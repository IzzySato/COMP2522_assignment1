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
     * @param currentCondition set
     */
    public void setCurrentCondition(final Condition currentCondition) {
        if (currentCondition == null) {
            throw new NullPointerException("NullPointerException Caught");
        }
        this.currentCondition = currentCondition;
    }

    /**
     * items mutator.
     * @param items set
     */
    public void setItems(final Rental[] items) {
        this.items = items;
    }

    /**
     * rentalID mutator.
     * @param rentalID set
     */
    public void setRentalID(long rentalID) {
        this.rentalID = rentalID;
    }

    /**
     * rentalPrice mutator.
     * @param rentalPrice set
     */
    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
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
        this.sold = sold;
    }

    private Rental[] addNewItem(final Rental items[], final Rental newRental) {
        int size = items.length;
        Rental newArr[] = new Rental[size + 1];
        try {
            for (int i = 0; i < size; i++) {
                newArr[i] = items[i];
            }
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
            throw new NullPointerException("NullPointerException Caught: comments");
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
