/**
 * Linguagens Formais e Tradutores - 2014.1
 * Compilador para linguagem Portugol
 * Autores: Diego Maynard e Evellyn Mota
 * Primeira Etapa: Analisador Lexico
 * 
 * Data da ultima modificação: 30/05/2014
 * versão: 0.01
 */

package MyClasses;

import lft_2014.compiler_portugol.lexer.Lexer;
import lft_2014.compiler_portugol.lexer.Lexer.State;
import lft_2014.compiler_portugol.lexer.LexerException;
import lft_2014.compiler_portugol.node.*;

/**
 * Classe NestedCmtsFilter: filtro para que comentários em bloco sejam reconhecidos
 * pela linguagem 
 * Nesta versão, penas comentários aninhados são reconhecidos. Caso seja inserido algum comentário
 * não balanceado, entrará em loop 
 */   

public class NestedCmtsFilter extends Lexer{
	 
	 private int count;
	 private TComment comment;
	 private StringBuffer text;
	 public NestedCmtsFilter(java.io.PushbackReader in)
	  { super(in);
	  }
	 protected void filter()
	  { // if we are in the comment state
	    if(state.equals(State.COMMENT))
	    { // if we are just entering this state
	      if(comment == null)
	      { // The token is supposed to be a comment.
	        // We keep a reference to it and set the count to one
	        comment = (TComment) token;
	        text = new StringBuffer(comment.getText());
	        count = 1;
	        token = null; // continue to scan the input.
	      }
	      else
	      { // we were already in the comment state
	        text.append(token.getText()); // accumulate the text.
	        if(token instanceof TComment)
	          count++;
	        else if(token instanceof TCommentEnd)
	          count--;
	        if(count != 0)
	         token = null; // continue to scan the input.
	        else
	        { comment.setText(text.toString());
	          token = comment; //return a comment with the full text.
	          state = State.NORMAL; //go back to normal.
	          comment = null; // We release this reference.
	        }
	      }
	    }
	  }
	 }
