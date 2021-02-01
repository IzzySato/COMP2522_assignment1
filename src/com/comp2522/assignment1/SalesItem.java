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
     * @param newSalesID set new salesID
     */
    public SalesItem(long sku, long newSalesID) {
        super(sku);
        setSalesID(newSalesID);
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
     * @param newSalePrice set new salesPrice
     */
    public void setSalePrice(double newSalePrice) {
        salePrice = newSalePrice;
    }

    /**
     * salesID mutator.
     * @param newSalesID set new salesID
     */
    public void setSalesID(long newSalesID) {
        salesID = newSalesID;
    }

    /**
     * sellable mutator.
     * @param newSellable set new sellable
     */
    public void setSellable(boolean newSellable) {
        sellable = newSellable;
    }

    /**
     * sold mutator.
     * @param newSold set new sold
     */
    public void setSold(boolean newSold) {
        if (!newSold) {
            throw new RuntimeException("Can't set property item to unsold");
        }
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
    public int hashCode() {
        return 1;
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
