package Final;

import java.util.*;

/*
 * Represents a shopping cart for the Inventory program.
 * 
 * Constructs an ArrayList of Item objects. 
 */

public class Cart implements ItemList{
    
    ArrayList<Item> cart = new ArrayList<Item>();
    
    /*
     * Finds the index of the Item in the Cart with the given name.
     */
    
    public int find (String name) {
        int index = -1;
        
        for (int i = 0; i < cart.size(); i++) {
            Item item = cart.get(i);
            String itemName = item.getName();
            if (itemName.indexOf(name) != -1) {
                index = i;
            }
        }
        
        return index;
    }
    
    /*
     * Returns the actual ArrayList. 
     * 
     * Used in the GUI.
     */
    
    public ArrayList<Item> getArrayList () {
        return cart;
    }
    
    /*
     * Returns the Item at the specified index.
     */
    
    public Item get(int index) {
        return cart.get(index);
    }
    
    /*
     * Adds an item to the Cart unless the Item already exists. 
     */
    
    public void add (Item item) {
        if (find(item.getName()) == -1) {
            cart.add(item);
        }
    }
    
    /*
     * Returns the number of unique Items in the Cart.
     */

    public int getSize () {
        return cart.size();
    }
    
    /*
     * Removes an Item from the Cart.
     */
    
    public void remove (int index) {
        if (index < cart.size() && index >= 0) {
            cart.remove(index);
        }
    }
    
    /*
     * Changes the quantity of the Item at the given index to the given quantity.
     */
    
    public void changeQuantity (int index, int quantity) {
        if (index < cart.size() && index >= 0) {
            Item item = cart.get(index);
            item.changeQuantity(quantity);
            cart.set(index, item);
        }
    }
    
    /*
     * Returns the total number of items in the cart.
     */
    
    public int totalItems() {
        int quantity = 0;
        
        for (Item item : cart) {
            quantity += item.getQuantity();
        }
        
        return quantity;
    }
    
    /*
     * Returns the total price of the cart.
     */
    
    public double totalPrice() {
        double total = 0;
        
        for (Item item : cart) {
            total += item.getPrice() * item.getQuantity();
        }
        
        return Math.floor(total * 100)/100;
    }
   
    /*
     * Clears the entire cart.
     */ 
    
    public void clearAll () {
        cart.clear();
    }
    
    /*
     * Returns a String that lists the entire cart with the size and total price. 
     * 
     * Each Item displays its Cart String, consisting of price and quantity.
     */
    
    public String toString () {
        Iterator <Item> iter = cart.iterator();
        
        String result = "Size : " + cart.size() + "\n";
        result += "Total Price : " + totalPrice() + "\n";
        
        int count = 1;
        while (iter.hasNext()) {
            Item item = iter.next();
            result += count + "\n" + item.cartString() + "\n";
            count++;
        }
        
        return result;
    }
}
