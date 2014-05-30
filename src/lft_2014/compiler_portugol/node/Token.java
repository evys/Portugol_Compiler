/* This file was generated by SableCC (http://www.sablecc.org/). */

package lft_2014.compiler_portugol.node;

@SuppressWarnings("nls")
public abstract class Token extends Node
{
    private String text;
    private int line;
    private int pos;

    public int getLine()
    {
        return this.line;
    }

    public int getPos()
    {
        return this.pos;
    }

    public String getText()
    {
        return this.text;
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        throw new RuntimeException("Not a child.");
    }

    public void setLine(@SuppressWarnings("hiding") int line)
    {
        this.line = line;
    }

    public void setPos(@SuppressWarnings("hiding") int pos)
    {
        this.pos = pos;
    }

    public void setText(@SuppressWarnings("hiding") String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return this.text + " ";
    }
}