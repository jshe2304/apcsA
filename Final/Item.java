package Final;

import java.util.*;
import java.lang.Cloneable;

/*
 * Represents an Item in the Inventory
 * 
 * Items have 5 basic fields, including a Location object.
 * Items have functions for manipulation and returns.
 */

public abstract class Item implements Cloneable{
    String name;
    int id;
    Location location;
    double price;
    int quantity;
    
    
    public Item (String name, int id, Location location, double price, int quantity) {
        this.id = id;
        this.name = name.toLowerCase();
        this.location = location;
        this.price = price;
        this.quantity = quantity;
    }
    
    /*
     * This function ensures that later on, the program can make a separate copy of an Item.
     */
    
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    /*
     * The following functions return the Item values.
     */
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return id;
    }
    
    public int getFloor() {
        return location.floor();
    }
    
    public int getRow() {
        return location.row();
    }
    
    public Location getLocation() {
        return location;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    /*
     * The following functions change the basic values.
     */
    
    public void changeQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    
    public void addQuantity (int addQuantity) {
        quantity += addQuantity;
    }
    
    public void changePrice (double newPrice) {
        price = newPrice;
    }
    
    public void changeLocation (int floor, int row) {
        location.changeFloor(floor);
        location.changeRow(row);
    }
    
    public void changeLocation (Location location) {
        this.location = location;
    }
    
    /*
     * Returns a String to be displayed when the Item is added to a Cart.
     * Contains limited information.
     */
    
    public String cartString () {
        String result = "";
        result += "Item Name: " + name + "\n";
        result += "Quantity : " + quantity + "\n";
        result += "Price: $" + Math.floor(price * 100)/100 + " x " + quantity + " = $" + Math.floor(price * quantity * 100)/100 + "\n";
        return result;
    }
    
    /*
     * Returns a String to be displayed when an Administrator is viewing the Item.
     * Contains all values. 
     */
    
    public String adminString () {
        String result = "";
        result += getName().substring(0, 1).toUpperCase() + getName().substring(1) + "\n";
        result += "Price: $" + Math.floor(price * 100)/100 + "\n";
        result += "Quantity : " + quantity + "\n";
        result += "ID: " + id + "\n";
        result += getLocation();
        return result;
    }
    
    /*
     * Returns a String to be displayed when a Customer is viewing the Item outside of the Cart.
     * Contains limited information.
     */
    
    public String toString () {
        String result = "";
        result += getName().substring(0, 1).toUpperCase() + getName().substring(1) + "\n";
        result += "Price: $" + Math.floor(price * 100)/100 + "\n";
        result += "Quantity : " + quantity + "\n";
        return result;
    }
}
