/* This file was generated by SableCC (http://www.sablecc.org/). */

package ensp.parity.node;

import ensp.parity.analysis.*;

@SuppressWarnings("nls")
public final class TB extends Token
{
    public TB()
    {
        super.setText("b");
    }

    public TB(int line, int pos)
    {
        super.setText("b");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TB(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTB(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TB text.");
    }
}