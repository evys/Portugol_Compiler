/**
 * Linguagens Formais e Tradutores - 2014.1
 * Compilador para linguagem Portugol
 * Autores: Diego Maynard e Evellyn Mota
 * Primeira Etapa: Analisador Lexico
 * 
 * Data da ultima modificação: 30/05/2014
 * versão: 0.15
 */

package MyClasses;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import lft_2014.compiler_portugol.lexer.*;
import lft_2014.compiler_portugol.node.EOF;

/**
 * 
 * Classe Test: Imprime todos os tokens de um arquivo .txt
 * Note que esse arquivo poderia ser o programa escrito em portugol
 * 
 */
public class Test {
	public static void main(String[] args) throws FileNotFoundException, LexerException, IOException {
        File file = new File("D:\\My Documents\\Acadêmico\\UFS\\2014.1\\LFT\\sablecc-3.7\\lib\\teste.txt");
        PushbackReader pushbackReader = new PushbackReader(new FileReader(file));
        NestedCmtsFilter lex = new NestedCmtsFilter(pushbackReader);
        String teste = "";
        int linha = 0;
        while (!(lex.peek() instanceof EOF))
        {            
            if (lex.peek().getLine() > linha)
            {
                linha = lex.peek().getLine();
                teste = teste + System.lineSeparator();
            }
            teste =  teste + " " + lex.next().getClass().getSimpleName();
        }
        System.out.println(teste);       
    }
}
