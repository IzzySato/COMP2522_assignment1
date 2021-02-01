package com.comp2522.assignment1;

import java.io.Serializable;
import java.util.Date;

/**
 * InventoryItem class is a super class.
 * @author A01166545 Shizuka (Izzy) Sato
 * @version 1
 */

public class InventoryItem implements Sellable, Comparable<Object>,
        Serializable {
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
     * @param newSku sku number
     */
    public InventoryItem(long newSku) {
        setSKU(newSku);
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
     * @param newDate ipd set to new date
     */
    public void setIPD(final Date newDate) {
        ipd = newDate;
    }

    /**
     * name mutator.
     * @param newName name set to new name
     */
    public void setName(final String newName) {
        name = newName;
    }

    /**
     * purchasePrice mutator.
     * @param newPurchasePrice purchasePrice set
     */
    public void setPurchasePrice(double newPurchasePrice) {
        purchasePrice = newPurchasePrice;
    }


    /**
     * sku mutator.
     * @param newSku set to newSku
     */
    public void setSKU(long newSku) {
        sku = newSku;
    }

    /**
     * type mutator.
     * @param newType set to a new type
     */
    public void setType(final String newType) {
        type = newType;
    }

    /**
     * description mutator.
     * @param newDescription set to new description
     */
    public void setDescription(final String newDescription) {
        if (newDescription == null) {
            throw new NullPointerException("description must not be null");
        }
        description = newDescription;
    }

    @Override
    public boolean isSellable() {
        return false;
    }

    @Override
    public void setSellable(boolean item) {
        //TODO
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
    public int hashCode() {
        return (int) sku << ipd.getTime();
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
