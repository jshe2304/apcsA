package Final;

import java.util.*;

public interface ItemList {
    
    ArrayList<Item> list = new ArrayList<Item>();
    
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
