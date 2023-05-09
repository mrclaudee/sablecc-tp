/* This file was generated by SableCC (http://www.sablecc.org/). */

package ensp.automate.node;

import ensp.automate.analysis.*;

@SuppressWarnings("nls")
public final class TParite extends Token
{
    public TParite(String text)
    {
        setText(text);
    }

    public TParite(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TParite(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParite(this);
    }
}