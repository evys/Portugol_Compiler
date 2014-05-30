/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

import lft_2014.compiler_portugol.analysis.*;

@SuppressWarnings("nls")
public final class TPontoVirgula extends Token
{
    public TPontoVirgula()
    {
        super.setText(";");
    }

    public TPontoVirgula(int line, int pos)
    {
        super.setText(";");
        setLine(line);
        setPos(pos);
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPontoVirgula(this);
    }

    @Override
    public Object clone()
    {
      return new TPontoVirgula(getLine(), getPos());
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPontoVirgula text.");
    }
}
