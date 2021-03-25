package Final;

import java.util.*;
import java.lang.Cloneable;

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
    
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public int getFloor() {
        return location.floor();
    }
    
    public int getRow() {
        return location.row();
    }
    
    public String getLocation() {
        return location.toString();
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
     
    public void changeQuantity(int newQuantity) {
        quantity = newQuantity;
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
    
    public String cartString () {
        String result = "";
        result += "Item Name: " + name + "\n";
        result += "Quantity : " + quantity + "\n";
        result += "Price: $" + String.format("%.3g", price) + " x " + quantity + " = $" + String.format("%.3g", price*quantity) + "\n";
        return result;
    }
    
    public String adminString () {
        String result = "";
        result += "Item Name: " + name + "\n";
        result += "Price: " + String.format("%.3g", price) + "\n";
        result += "Quantity : " + quantity + "\n";
        result += "ID: " + id + "\n";
        result += getLocation();
        return result;
    }
    
    public String toString () {
        String result = "";
        result += "Item Name: " + name + "\n";
        result += "Price: $" + String.format("%.3g", price) + "\n";
        result += "Quantity : " + quantity + "\n";
        return result;
    }
}
