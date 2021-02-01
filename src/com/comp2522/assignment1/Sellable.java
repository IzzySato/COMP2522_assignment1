/**
 * Sellable is interface that used in InventoryItem class.
 * @author A01166545 Shizuka (Izzy) Sato
 * @version 1
 */

package com.comp2522.assignment1;

import java.io.Serializable;

public interface Sellable extends Serializable {
    /**
     * To check if sellable.
     * @return true if sellable
     */
    boolean isSellable();

    /**
     * set to new item.
     * @param item check the item is sellable
     */
    void setSellable(boolean item);
}
