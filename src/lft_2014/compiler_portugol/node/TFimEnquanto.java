/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TFimEnquanto extends Token
{
    public TFimEnquanto()
    {
        super.setText("fim enquanto");
    }

    public TFimEnquanto(int line, int pos)
    {
        super.setText("fim enquanto");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimEnquanto(this);
    }

    @Override
    public Object clone()
    {
      return new TFimEnquanto(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimEnquanto text.");
    }
}