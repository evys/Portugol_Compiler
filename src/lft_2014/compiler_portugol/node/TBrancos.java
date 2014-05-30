/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TBrancos extends Token
{
    public TBrancos(String text)
    {
        setText(text);
    }

    public TBrancos(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBrancos(this);
    }

    @Override
    public Object clone()
    {
      return new TBrancos(getText(), getLine(), getPos());
    }
}