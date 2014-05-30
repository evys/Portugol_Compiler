/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TSenao extends Token
{
    public TSenao()
    {
        super.setText("senao");
    }

    public TSenao(int line, int pos)
    {
        super.setText("senao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSenao(this);
    }

    @Override
    public Object clone()
    {
      return new TSenao(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSenao text.");
    }
}
