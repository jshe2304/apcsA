package Final;

public class InventoryDatabase {
    public static Inventory getInventory () {
        
        Cart cart = new Cart();
        
        User adm = new User ("Admin", true, false, 1234567890, "1234 Main Street, PV, CA, USA", "password321");
        
        // UserList userlist = new UserList();
        // userlist.addUser(cust);
        // userlist.addUser(adm);
        
        Inventory inventory = new Inventory("Inventory 1", cart, adm);
        
        Food apple = new Food ("Apple", 12345, new Location(1, 5), 0.99, 20, true, false);
        Food orange = new Food ("Orange", 13579, new Location(1, 6), 0.99, 30, false, false);
        Food bread = new Food ("Bread", 24680, new Location(1, 7), 1.99, 5, false, false);
        Clothing sweater = new Clothing ("Sweater", 14701, new Location(2, 2), 19.99, 10, "Unisex", "S, M, L, XL");
        Clothing tshirt = new Clothing ("T-Shirt", 54321, new Location(2, 3), 4.99, 10, "Mens", "L");
        Clothing socks = new Clothing ("Socks", 86420, new Location (2, 4), 5.99, 20, "Unisex", "Fits All");
        
        inventory.add(apple);
        inventory.add(orange);
        inventory.add(bread);
        inventory.add(tshirt);
        inventory.add(sweater);
        inventory.add(socks);
        
        return inventory;
    }
}
