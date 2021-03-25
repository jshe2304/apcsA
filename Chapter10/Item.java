package Chapter10;


public class Item {
    
    private String name;
    private double price;
    private int quantity;
    
    public Item (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String toString() {
        return name + "\t\tPrice : $" + price + "\tQuantity : " + quantity;
    }
}
