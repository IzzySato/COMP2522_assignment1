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
     * @param rentalID set
     * @param rentalItemID set
     * @param date set
     */
    public Rental(long rentalID, long rentalItemID, Date date) {
    setRentalID(rentalID);
    this.rentalItemID = rentalItemID;
    this.date = date;
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
     * @param comments comments set
     */
    public void setComments(final String comments) {
        if (comments == null) {
            throw new NullPointerException("NullPointerException Caught: comments");
        }
        this.comments = comments;
    }

    /**
     * conditionAfter mutator.
     * @param conditionAfter must not be null
     */
    public void setConditionAfter(final Condition conditionAfter) {
        if (conditionAfter == null) {
            throw new NullPointerException("NullPointerException Caught: condition after");
        }
        this.conditionAfter = conditionAfter;
    }

    /**
     * conditionBefore mutator.
     * @param conditionBefore must not be null
     */
    public void setConditionBefore(final Condition conditionBefore) {
        if (conditionBefore == null) {
            throw new NullPointerException("NullPointerException Caught: conditionBefore");
        }
        this.conditionBefore = conditionBefore;
    }

    /**
     * rentalID mutator.
     * @param rentalID set
     */
    public void setRentalID(long rentalID) {
        this.rentalID = rentalID;
    }

    /**
     * rentalCost mutator.
     * @param rentalCost set
     */
    public void setCostOfRental(double rentalCost) {
        if (rentalCost > 0) {
            this.rentalCost = rentalCost;
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
