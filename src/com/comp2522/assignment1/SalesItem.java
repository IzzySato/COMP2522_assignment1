package com.comp2522.assignment1;

import java.io.Serializable;

/**
 * SalesItem class is a sub class.
 * @author A01166545 Shizuka (Izzy) Sato
 * @version 1
 */

public class SalesItem extends InventoryItem implements Serializable {
    private double salePrice;
    private long salesID;
    private boolean sellable;
    private static final long serialVersionUID = 1L;
    private boolean sold;

    /**
     * Default Constructor.
     */
    public SalesItem() {
    }

    /**
     * Main constructor.
     * @param sku set
     * @param salesID set
     */
    public SalesItem(long sku, long salesID) {
        super(sku);
        setSalesID(salesID);
    }

    /**
     * salePrice accessor.
     * @return salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * salesID accessor.
     * @return salesID
     */
    public long getSalesID() {
        return salesID;
    }

    /**
     * sellable accessor.
     * @return sellable
     */
    public boolean isSellable() {
        return sellable;
    }

    /**
     * sold accessor.
     * @return sold
     */
    public boolean isSold() {
        return sold;
    }

    /**
     * salePrice mutator.
     * @param salePrice set
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * salesID mutator.
     * @param salesID set
     */
    public void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    /**
     * sellable mutator.
     * @param sellable set
     */
    public void setSellable(boolean sellable) {
        this.sellable = sellable;
    }

    /**
     * sold mutator.
     * @param sold set
     */
    public void setSold(boolean sold) {
        if (!sold) {
            throw new RuntimeException("Can't set property item to unsold");
        }
        this.sold = sold;
    }

    @Override
    public int compareTo(final Object o) {
        if (this.equals(o)) {
            return 0;
        } else if (o instanceof SalesItem) {
            return (int) (((SalesItem) o).getSalesID() - this.getSalesID());
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(final Object obj) {
        if (super.equals(obj) && obj.getClass() == this.getClass()) {
            return ((SalesItem) obj).getSalesID() == this.getSalesID();
        }
        return false;
    }

    @Override
    public String toString() {
        return "SalesItem{"
                + "salePrice=" + salePrice
                + ", salesID=" + salesID
                + ", sellable=" + sellable
                + ", serialVersionUID=" + serialVersionUID
                + ", sold=" + sold + '}';
    }
}
