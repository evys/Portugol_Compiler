/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TXor extends Token
{
    public TXor()
    {
        super.setText("xor");
    }

    public TXor(int line, int pos)
    {
        super.setText("xor");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTXor(this);
    }

    @Override
    public Object clone()
    {
      return new TXor(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TXor text.");
    }
}
