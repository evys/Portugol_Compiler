/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TFimSe extends Token
{
    public TFimSe()
    {
        super.setText("fim se");
    }

    public TFimSe(int line, int pos)
    {
        super.setText("fim se");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimSe(this);
    }

    @Override
    public Object clone()
    {
      return new TFimSe(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimSe text.");
    }
}
