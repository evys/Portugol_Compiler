/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TFimAvalie extends Token
{
    public TFimAvalie()
    {
        super.setText("fim avalie");
    }

    public TFimAvalie(int line, int pos)
    {
        super.setText("fim avalie");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimAvalie(this);
    }

    @Override
    public Object clone()
    {
      return new TFimAvalie(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimAvalie text.");
    }
}
