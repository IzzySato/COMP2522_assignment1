package com.comp2522.assignment1;

import java.io.Serializable;
import java.util.Date;

/**
 * InventoryItem class is a super class.
 * @author A01166545 Shizuka (Izzy) Sato
 * @version 1
 */

public class InventoryItem implements Sellable, Comparable, Serializable {
    private Date ipd;
    private long sku;
    private String description;
    private String name;
    private double purchasePrice;
    private static final long serialVersionUID = 1L;
    private String type;

    /**
     * Default Constructor.
     */
    public InventoryItem() {
    }

    /**
     * Main constructor.
     * @param sku sku number
     */
    public InventoryItem(long sku) {
        setSKU(sku);
    }

    /**
     * description accessor.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * IPD accessor.
     * @return ipd
     */
    public Date getIPD() {
        return ipd;
    }

    /**
     * SKU accessor.
     * @return sku
     */
    public long getSKU() {
        return sku;
    }

    /**
     * name accessor.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * purchasePrice accessor.
     * @return purchasePrice
     */
    public double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * type accessor.
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * ipd mutator.
     * @param ipd ipd set
     */
    public void setIPD(final Date ipd) {
        this.ipd = ipd;
    }

    /**
     * name mutator.
     * @param name name set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * purchasePrice mutator.
     * @param purchasePrice purchasePrice set
     */
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * SKU mutator.
     * @param sku sku set
     */
    public void setSKU(long sku) {
        this.sku = sku;
    }

    /**
     * type mutator.
     * @param type type set
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * description mutator.
     * @param description description set
     */
    public void setDescription(final String description) {
        if (description == null) {
            throw new NullPointerException("description must not be null");
        }
        this.description = description;
    }

    @Override
    public boolean isSellable() {

        return false;
    }

    @Override
    public void setSellable(boolean item) {

    }

    @Override
    public int compareTo(final Object o) {
        if (this.equals(o)) {
            return 0;
        } else if (o instanceof InventoryItem) {
            return (int) (((InventoryItem) o).getSKU() - this.getSKU());
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj.getClass() == this.getClass())) {
            return false;
        }
        InventoryItem item = (InventoryItem) obj;
        return item.getSKU() == this.getSKU();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "InventoryItem{"
                + "ipd=" + ipd
                + ", sku=" + sku
                + ", name='" + name + '\''
                + ", purchasePrice="
                + purchasePrice
                + ", serialVersionUID= "
                + serialVersionUID
                + ", type='" + type + '\'' + '}';
    }
}
