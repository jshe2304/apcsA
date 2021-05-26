package Final;

import java.util.*;

/*
 * Represents an Inventory.
 * 
 * Takes 3 parameters for operation.
 * Cart and User objects must be created prior to Inventory object creation in order to be passed in.
 * 
 * Creates an ArrayList of Item objects on construction.
 */

public class Inventory implements ItemList{
    
    ArrayList<Item> inventory = new ArrayList<Item>();
    String name;
    static Cart cart;
    //User user;
    
    public Inventory (String name, Cart cart) {
        this.name = name;
        this.cart = cart;
        //this.user = user;
    }
    
    /*
     * The following functions return the object attributes.
     * 
     * The getCart and getUser functions return the corresponding Cart or User objects for manipulation.
     */
    
    public String getName () {
        return name;
    }
    
    public Cart getCart () {
        return (cart);
    }
    
    // public User getUser () {
        // return user;
    // }
    
    /*
     * Returns the Item at the given index.
     */
    
    public Item get(int index) {
        return inventory.get(index);
    }
    
    /*
     * Checks to see whether a given name is unique or not.
     * 
     * Used when adding Items to the inventory.
     */
    
    public boolean uniqueName(String name) {
        name = name.toLowerCase();
        for (Item item : inventory) {
            if (item.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }
    
    /*
     * Generates a 5 digit unique ID using recursion.
     * 
     * Used when adding Items to the inventory.
     */
    
    public int generateID () {
        boolean unique = true;
        
        Random gen = new Random();
        
        int id = gen.nextInt(88888) + 11111;
        
        for (Item item : inventory) {
            if (item.getID() == id) {
                return generateID();
            }
        }
        
        return id;
    }
    
    /*
     * Makes sure a given index is valid.
     * 
     * Simply used to clean up future code.
     */
    
    public boolean validIndex(int index) {
        if (index >= 0 && index < inventory.size()) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
     * Sets changes the Item at the given index to the given Item.
     * 
     * Used to clean up future code.
     */
    
    public void set (int index, Item item) {
        inventory.set(index, item);
    }
    
    /*
     * Finds the index of an Item based on a given name;
     */
    
    public int find (String name) {
        int index = -1;
        name = name.toLowerCase();
        
        for (int i = 0; i < inventory.size(); i++) {
            Item item = inventory.get(i);
            String itemName = item.getName();
            if (itemName.indexOf(name) != -1) {
                index = i;
            }
        }
        return index;
    }
    
    /*
     * Links the Item in the Inventory from a given Item for manipulation.
     */
    
    public Item find (Item checkItem) {
        Item foundItem = null;
        
        for (Item item : inventory) {
            if (item.getName().equals(checkItem.getName())) {
                foundItem = item;
            }
        }
        
        return foundItem;
    }
    
    /*
     * Finds the index of the Item with the given ID.
     */
    
    public int find (int givenID) {
        for (Item item : inventory) {
            if (item.getID() == givenID) {
                return inventory.indexOf(item);
            }
        }
        return -1;
    }
    
    /*
     * Adds an Item to the inventory if the name is unique.
     */
    
    public void add (Item item) {
        if (uniqueName(item.getName())) {
            inventory.add(item);
        }
    }
    
    /*
     * Removes the Item at the specified index from the inventory.
     */
    
    public void remove (int index) {
        inventory.remove(index);
    }
    
    /*
     * Changes the quantity of the Item at the given index to the given quantity
     */
    
    public void changeQuantity (int index, int quantity) {
        if (validIndex(index)) {
            inventory.get(index).changeQuantity(quantity);
        }
    }
    
    /*
     * Clears the entire inventory.
     */
    
    public void clearAll () {
        inventory.clear();
    }
    
    
    /*
     * Adds the given quantity of the Item at the given index to the Cart.
     */
    
    public void addToCart (int index, int quantity) {
        if (index >= 0 && index < inventory.size()) {
            Item item = inventory.get(index);
            int originalQuantity = item.getQuantity();
            if (item.getQuantity() > quantity) {
                try {
                    Item newItem = (Item) item.clone();
                    newItem.changeQuantity(quantity);
                    cart.add(newItem);
                    inventory.get(index).changeQuantity(originalQuantity - quantity);
                } catch (CloneNotSupportedException e) {
                }
            }
        }
    }
    
    /*
     * Adds an Item object to the cart.
     */
    
    public void addToCart (Item item) {
        cart.add(item);
    }
    
    /*
     * Removes the Item at the given index from the Cart and returns the quantity of the removed Item to the Inventory.
     */
    
    public void removeCartItem (int index) {
        if (index >= 0 && index < cart.getSize()) {
            int quantity = cart.get(index).getQuantity();
            find(cart.get(index)).addQuantity(quantity);
            cart.remove(index);
        }
    }
    
    /*
     * Changes the quantity of the Item at the given index to the given quantity.
     */
    
    public void changeCartItemQuantity (int index, int quantity) {
        Item item = cart.get(index);
        
        int returnedQuantity = item.getQuantity() - quantity;
        
        cart.changeQuantity(index, quantity);
        
        int originalIndex = find(item.getName());
        int originalQuantity = inventory.get(originalIndex).getQuantity();
        
        changeQuantity(originalIndex,  originalQuantity + returnedQuantity);
    }
    
    /*
     * Clears the entire cart and returns the quantities of all removed Items to the Inventory.
     */
    
    public void clearCart () {
        for (int i = 0; i < cart.getSize(); i++) {
            changeCartItemQuantity(i, 0);
        }
        cart.clearAll();
    }

    /*
     * Returns the number of unique Items in the Inventory.
     */

    public int getSize () {
        return inventory.size();
    }
    
    /*
     * Returns the total number of items in the Inventory.
     */
    
    public int totalItems() {
        int quantity = 0;
        
        for (Item item : inventory) {
            quantity += item.getQuantity();
        }
        
        return quantity;
    }
    
    /*
     * Returns the total price/value of the inventory.
     */
    
    public double totalPrice() {
        double total = 0;
        
        for (Item item : inventory) {
            total += item.getPrice() * item.getQuantity();
        }
        
        return Math.floor(total * 100)/100;
    }
    
    /*
     * Changes the User to the given User.
     */
    
    // public void changeUser (User newUser) {
        // user = newUser;
    // }
    
    /*
     * Returns a help String for display in the GUI. 
     * 
     * Administrators and Customers see different Strings
     */
    
    public String help(boolean isAdmin) {
        String result = "";
        result += "General Functionalities\n";
        result += "Inventory\t\t\t\t\t\t - Displays entire inventory catalog\n";
        result += "User\t\t\t\t\t\t\t - Displays user information\n";
        result += "Change User\t\t\t\t\t - Change user\n";
        if (isAdmin) {
            result += "\nAdmin Functionalities\n";
            result += "Inventory Info\t\t\t\t\t - Displays Additional Inventory Information\n";
            result += "Add (Food/Clothing/Misc) Item\t - Adds item to inventory\n";
            result += "Remove Item\t\t\t\t\t - Removes item from inventory\n";
            result += "Edit Item\t\t\t\t\t\t - Change item information\n";
            result += "Clear Inventory\t\t\t\t - Clears entire inventory\n";
        } else {
            result += "\nShopping Functionalities\n";
            result += "Cart\t\t\t\t\t\t\t - Displays user's cart\n";
            result += "Add To Cart\t\t\t\t\t - Adds an item to user's cart\n";
            result += "Edit Item\t\t\t\t\t\t - Changes the quantity of an item in the cart\n";
            result += "Remove From Cart\t\t\t\t - Removes an item from user's cart)\n";
        }
        return result;
    }
    
    public void saveInventory () {
    }
    
    /*
     * Returns a list of all Items in the inventory.
     * 
     * Administrators and Customers recieve different Strings with more or less information for each Item, respectively.
     */

    public String toString (boolean isAdmin) {
        Iterator<Item> iter = inventory.iterator();
        
        String result = "";
        
        int count = 1;
        
        while (iter.hasNext()) {
            Item item = iter.next();
            if (isAdmin) {
                result += count + "\n" + item.adminString() + "\n";
            } else {
                result += count + "\n" + item.toString() + "\n";
            }
            count++;
        }
        
        return result;
    }
}
