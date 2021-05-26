package Final;

import java.util.*;

/*
 * ItemList interface.
 * 
 * Establishes basic function necessary for implementation.
 * Implemented by Inventory and Cart classes.
 * 
 * Functions are self explanatory.
 */

public interface ItemList {
    
    public int find (String name);
    
    public void add (Item item);
    
    public void remove(int index);
    
    public int getSize ();
    
    public void changeQuantity (int index, int quantity);
    
    public void clearAll ();
    
    public int totalItems();
    
    public double totalPrice();
    
    public String toString ();
} 
