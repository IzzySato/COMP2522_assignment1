package com.comp2522.assignment1;

import java.io.Serializable;
import java.util.Arrays;

/**
 * RentalItem class is a sub class.
 * @author A01166545 Shizuka (Izzy) Sato
 * @version 1
 */

public class RentalItem extends InventoryItem implements Serializable {
    private Condition currentCondition;
    private Rental[] items;
    private long rentalID;
    private double rentalPrice;
    private boolean sellable;
    private static final long serialVersionUID = 1L;
    private boolean sold;

    /**
     * Default constructor.
     */
    public RentalItem() {

    }

    /**
     * Main Constructor.
     * @param sku set
     * @param rentalItemID set
     */
    public RentalItem(long sku, long rentalItemID) {
        super(sku);
        setRentalID(rentalItemID);
        items = new Rental[0];
    }

    /**
     * currentCondition accessor.
     * @return currentCondition
     */
    public Condition getCurrentCondition() {
        return currentCondition;
    }

    /**
     * items accessor.
     * @return items
     */
    public Rental[] getItems() {
        return items;
    }

    /**
     * rentalID accessor.
     * @return rentalID
     */
    public long getRentalItemID() {
        return rentalID;
    }

    /**
     * rentalPrice accessor.
     * @return rentalPrice
     */
    public double getRentalPrice() {
        return rentalPrice;
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
     * currentCondition mutator.
     * @param newCurrentCondition set to new currentCondition
     */
    public void setCurrentCondition(final Condition newCurrentCondition) {
        if (newCurrentCondition == null) {
            throw new NullPointerException("NullPointerException Caught");
        }
        currentCondition = newCurrentCondition;
    }

    /**
     * items mutator.
     * @param newItems set new item
     */
    public void setItems(final Rental[] newItems) {
        items = newItems;
    }

    /**
     * rentalID mutator.
     * @param newRentalID set new rentalID
     */
    public void setRentalID(long newRentalID) {
        rentalID = newRentalID;
    }

    /**
     * rentalPrice mutator.
     * @param newRentalPrice set to new rentalPrice
     */
    public void setRentalPrice(double newRentalPrice) {
        rentalPrice = newRentalPrice;
    }

    /**
     * sellable mutator.
     * @param newSellable set to new sellable
     */
    public void setSellable(boolean newSellable) {
        sellable = newSellable;
    }

    /**
     * sold mutator.
     * @param newSold set to new sold
     */
    public void setSold(boolean newSold) {
        if (!newSold) {
            throw new RuntimeException("newSold must be true");
        }
    }

    private Rental[] addNewItem(final Rental[] rentalItems,
                                final Rental newRental) {
        int size = rentalItems.length;
        Rental[] newArr = new Rental[size + 1];
        try {
            for (int i = 0; i < size; i++) {
                newArr[i] = rentalItems[i];
            }
            //newArr = Array.copy();
            newArr[size] = newRental;

        } catch (Exception e) {
            System.out.print("AddItem  fail");
        }
        return newArr;
    }

    /**
     * add item into items array.
     * @param item must not be null
     */
    public void addRental(final Rental item) {
        if (item == null) {
            throw new NullPointerException("item must not be null");
        }
        items = addNewItem(items, item);
    }

    /**
     * calculate total costs from items array.
     * @return total rental cost
     */
    public double getTotalRentalCost() {
        double total = 0;
        for (Rental item: items) {
            total += item.getCostOfRental();
        }
        return total;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "RentalItem{"
                + "currentCondition=" + currentCondition
                + ", items=" + Arrays.toString(items)
                + ", rentalID=" + rentalID
                + ", rentalPrice=" + rentalPrice
                + ", sellable=" + sellable
                + ", serialVersionUID=" + serialVersionUID
                + ", sold=" + sold + '}';
    }
}
