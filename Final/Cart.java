package Final;

import java.util.*;

public class Cart implements ItemList{
    
    ArrayList<Item> cart = new ArrayList<Item>();
    
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
    
    public Item get(int index) {
        return cart.get(index);
    }
    
    public void add (Item item) {
        if (find(item.getName()) != -1) {
            System.out.println("Item, " + item.getName() + ", already added to cart.\nTo add a quantity of that item, use 'addQuantity'.\n");
        } else {
            cart.add(item);
            System.out.println("Item, " + item.getName() + ", added to cart!");
        }
    }

    public int getSize () {
        return cart.size();
    }
    
    public void remove (int index) {
        if (index < cart.size() && index >= 0) {
            cart.remove(index);
        }
    }
    
    public void changeQuantity (int index, int quantity) {
        if (index < cart.size() && index >= 0) {
            Item item = cart.get(index);
            item.changeQuantity(quantity);
            cart.set(index, item);
        }
    }
    
    public int totalPrice() {
        int price = 0;
        for (Item item : cart) {
            price += item.getPrice() * item.getQuantity();
        }
        return price;
    }
    
    public void clearAll () {
        cart.clear();
        System.out.println("Cart Cleared");
    }
    
    public String toString () {
        String result = "Size: " + cart.size() + "\n";
        
        int count = 1;
        for (Item item : cart) {
            result += count + ".\n" + item.cartString() + "\n";
            count++;
        }
        
        return result;
    }
}
