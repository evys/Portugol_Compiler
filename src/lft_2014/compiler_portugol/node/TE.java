/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TE extends Token
{
    public TE()
    {
        super.setText("e");
    }

    public TE(int line, int pos)
    {
        super.setText("e");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTE(this);
    }

    @Override
    public Object clone()
    {
      return new TE(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TE text.");
    }
}
