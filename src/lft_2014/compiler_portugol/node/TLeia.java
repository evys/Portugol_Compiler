/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TLeia extends Token
{
    public TLeia()
    {
        super.setText("leia");
    }

    public TLeia(int line, int pos)
    {
        super.setText("leia");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLeia(this);
    }

    @Override
    public Object clone()
    {
      return new TLeia(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLeia text.");
    }
}
