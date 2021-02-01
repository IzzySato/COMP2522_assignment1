package com.comp2522.assignment1;

import java.io.Serializable;
import java.util.Date;

/**
 * Rental class used in RentalItem class.
 * @author A01166545 Shizuka (Izzy) Sato
 * @version 1
 */

public class Rental implements Serializable {
    private String comments;
    private Condition conditionAfter;
    private Condition conditionBefore;
    private Date date;
    private long rentalID;
    private static final long serialVersionUID = 1L;
    private long rentalItemID;
    private double rentalCost;

    /**
     * Default constructor.
     */
    public Rental() {
    }

    /**
     * Main Constructor.
     * @param newRentalID set new rentalID
     * @param newRentalItemID set new rentalItemID
     * @param newDate set new date
     */
    public Rental(long newRentalID, long newRentalItemID, final Date newDate) {
    setRentalID(newRentalID);
    rentalItemID = newRentalItemID;
    date = newDate;
}
    /**
     * comments accessor.
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * conditionAfter accessor.
     * @return conditionAfter
     */
    public Condition getConditionAfter() {
        return conditionAfter;
    }

    /**
     * conditionBefore accessor.
     * @return conditionBefore
     */
    public Condition getConditionBefore() {
        return conditionBefore;
    }

    /**
     * rentalID accessor.
     * @return rentalID
     */
    public long getRentalID() {
        return rentalID;
    }

    /**
     * rentalItemID accessor.
     * @return rentalItemID
     */

    public long getRentalItemID() {
        return rentalItemID;
    }

    /**
     * date accessor.
     * @return date
     */
    public Date getDateRented() {
        return date;
    }

    /**
     * rentalCost accessor.
     * @return rentalCost
     */
    public double getCostOfRental() {
        return rentalCost;
    }

    /**
     * comments mutator.
     * @param newComments comments set to newComments
     */
    public void setComments(final String newComments) {
        if (newComments == null) {
            throw new NullPointerException("NullPointerException Caught: comments");
        }
        comments = newComments;
    }

    /**
     * conditionAfter mutator.
     * @param newConditionAfter must not be null
     */
    public void setConditionAfter(final Condition newConditionAfter) {
        if (newConditionAfter == null) {
            throw new NullPointerException("NullPointerException Caught: condition after");
        }
        conditionAfter = newConditionAfter;
    }

    /**
     * conditionBefore mutator.
     * @param newConditionBefore must not be null
     */
    public void setConditionBefore(final Condition newConditionBefore) {
        if (newConditionBefore == null) {
            throw new NullPointerException("NullPointerException Caught: conditionBefore");
        }
        conditionBefore = newConditionBefore;
    }

    /**
     * rentalID mutator.
     * @param newRentalID set to new rentalID
     */
    public void setRentalID(long newRentalID) {
        rentalID = newRentalID;
    }

    /**
     * rentalCost mutator.
     * @param newRentalCost set
     */
    public void setCostOfRental(double newRentalCost) {
        if (newRentalCost > 0) {
            rentalCost = newRentalCost;
        }
    }

    @Override
    public int hashCode() {
        return (int) rentalID << rentalItemID << date.getTime();
    }

    @Override
    public boolean equals(final Object obj) {
        return this.getClass() == obj.getClass();
    }

    @Override
    public String toString() {
        return "Rental{" + "comments='" + comments + '\''
                + ", conditionAfter=" + conditionAfter
                + ", conditionBefore=" + conditionBefore
                + ", date=" + date
                + ", rentalID=" + rentalID
                + ", serialVersionUID=" + serialVersionUID + '}';
    }
}
