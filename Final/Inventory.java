package Final;

import java.util.*;

public class Inventory implements ItemList{
    
    ArrayList<Item> inventory = new ArrayList<Item>();
    String name;
    Cart cart;
    User user;
    //UserList userList;
    
    public Inventory (String name, Cart cart, User user) {
        this.name = name;
        this.cart = cart;
        this.user = user;
        //this.userList = userList;
    }
    
    public Item get(int index) {
        return inventory.get(index);
    }
    
    public String getName () {
        return name;
    }
    
    public boolean uniqueName(String name) {
        name = name.toLowerCase();
        for (Item item : inventory) {
            if (item.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }
    
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
    
    public boolean validIndex(int index) {
        if (index >= 0 && index < inventory.size()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void set (int index, Item item) {
        inventory.set(index, item);
    }
    
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
    
    public Item findItem (Item checkItem) {
        Item foundItem = null;
        name = name.toLowerCase();
        
        for (Item item : inventory) {
            if (item.getName().equals(checkItem.getName())) {
                foundItem = item;
            }
        }
        
        return foundItem;
    }
    
    public void add (Item item) {
        if (find(item.getName()) != -1) {
            //System.out.println("Item, " + item.getName() + ", already exists.\nTo add a quantity of that item, use 'addQuantity'.\n");
        } else {
            inventory.add(item);
            //System.out.println("Item, " + item.getName() + ", added!");
        }
    }

    public int getSize () {
        return inventory.size();
    }
    
    public void remove (int index) {
        inventory.remove(index);
    }
    
    public void changeQuantity (int index, int quantity) {
        if (index < inventory.size() && index >= 0) {
            inventory.get(index).changeQuantity(quantity);
        } else {
            System.out.println("Item index out of bounds.\nTo create an item, use 'add'.\n");
        }
    }
    
    public void clearAll () {
        inventory.clear();
    }
    
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
    
    public void addToCart (Item item) {
        cart.add(item);
    }
    
    public void removeCartItem (int index) {
        if (index >= 0 && index < cart.getSize()) {
            int quantity = cart.get(index).getQuantity();
            findItem(cart.get(index)).addQuantity(quantity);
            cart.remove(index);
        }
    }
    
    public void changeCartItemQuantity (int index, int quantity) {
        Item item = cart.get(index);
        
        int returnedQuantity = item.getQuantity() - quantity;
        
        cart.changeQuantity(index, quantity);
        
        int originalIndex = find(item.getName());
        int originalQuantity = inventory.get(originalIndex).getQuantity();
        
        changeQuantity(originalIndex,  originalQuantity + returnedQuantity);
    }
    
    public Cart getCart () {
        return (cart);
    }
    
    public int totalItems() {
        int quantity = 0;
        
        for (Item item : inventory) {
            quantity += item.getQuantity();
        }
        
        return quantity;
    }
    
    public double totalPrice() {
        double total = 0;
        
        for (Item item : inventory) {
            total += item.getPrice() * item.getQuantity();
        }
        
        return Math.floor(total * 100)/100;
    }
    
    public void changeUser (User newUser) {
        user = newUser;
        //System.out.println("User Changed!");
    }
    
    public User getUser () {
        return user;
    }
    
    public String help() {
        String result = "Welcome to " + name + "\n\n";
        result += "General Functionalities\n";
        result += "Inventory\t\t\t\t\t\t - Displays entire inventory catalog\n";
        result += "User\t\t\t\t\t\t\t - Displays user information\n";
        result += "Change User\t\t\t\t\t - Change user\n";
        if (!user.isAdmin()) {
            result += "\nShopping Functionalities\n";
            result += "Cart\t\t\t\t\t\t\t - Displays user's cart\n";
            result += "Add To Cart\t\t\t\t\t - Adds an item to user's cart\n";
            result += "Edit Item\t\t\t\t\t\t - Changes the quantity of an item in the cart\n";
            result += "Remove From Cart\t\t\t\t - Removes an item from user's cart)\n";
        } else {
            result += "\nAdmin Functionalities\n";
            result += "Add (Food/Clothing/Misc) Item\t - Adds item to inventory\n";
            result += "Change Item Quantity\t\t\t - Changes quantity of item\n";
            result += "Remove Item\t\t\t\t\t - Removes item from inventory\n";
            result += "Clear Inventory\t\t\t\t - Clears entire inventory\n";
        }
        return result;
    }

    public String toString () {
        String result = "";
        
        int count = 1;
        
        for (Item item : inventory) {
            if (user.isAdmin()) {
                result += count + "\n" + item.adminString() + "\n";
            } else {
                result += count + "\n" + item.toString() + "\n";
            }
            count++;
        }
        
        return result;
    }
}
