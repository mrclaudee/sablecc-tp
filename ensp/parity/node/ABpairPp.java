/* This file was generated by SableCC (http://www.sablecc.org/). */

package ensp.parity.node;

import ensp.parity.analysis.*;

@SuppressWarnings("nls")
public final class ABpairPp extends PPp
{
    private TB _b_;
    private PPp _pp_;

    public ABpairPp()
    {
        // Constructor
    }

    public ABpairPp(
        @SuppressWarnings("hiding") TB _b_,
        @SuppressWarnings("hiding") PPp _pp_)
    {
        // Constructor
        setB(_b_);

        setPp(_pp_);

    }

    @Override
    public Object clone()
    {
        return new ABpairPp(
            cloneNode(this._b_),
            cloneNode(this._pp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABpairPp(this);
    }

    public TB getB()
    {
        return this._b_;
    }

    public void setB(TB node)
    {
        if(this._b_ != null)
        {
            this._b_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._b_ = node;
    }

    public PPp getPp()
    {
        return this._pp_;
    }

    public void setPp(PPp node)
    {
        if(this._pp_ != null)
        {
            this._pp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._b_)
            + toString(this._pp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._b_ == child)
        {
            this._b_ = null;
            return;
        }

        if(this._pp_ == child)
        {
            this._pp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._b_ == oldChild)
        {
            setB((TB) newChild);
            return;
        }

        if(this._pp_ == oldChild)
        {
            setPp((PPp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
