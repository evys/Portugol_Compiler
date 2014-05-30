/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TEscreva extends Token
{
    public TEscreva()
    {
        super.setText("escreva");
    }

    public TEscreva(int line, int pos)
    {
        super.setText("escreva");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEscreva(this);
    }

    @Override
    public Object clone()
    {
      return new TEscreva(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEscreva text.");
    }
}
