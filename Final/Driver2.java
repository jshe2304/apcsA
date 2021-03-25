package Final;

public class Driver2 {
    public static void main (String[] args) {
        Cart cart = new Cart();
        User cust = new User ("Customer", false, false, 1234567890, "1234 Main Street, PV, CA, USA", "password123");
        User adm = new User ("Admin", true, false, 1234567890, "1234 Main Street, PV, CA, USA", "password321");
        
        UserList userlist = new UserList();
        userlist.addUser(cust);
        userlist.addUser(adm);
        
        Inventory inventory = new Inventory("Inventory 1", cart, adm);
        
        Inventory inventory2 = new Inventory("Inventory 2", cart, adm);
        
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
        
        //inventory.changeUser(cust);
        
        //System.out.println(inventory);
        
        //inventory.addToCart(0, 3);
        
        Item item1 = inventory.get(0);
        
        item1.changeQuantity(5);
        
        inventory2.add(item1);
        
        //System.out.println(inventory2);
        
        inventory2.addToCart(0, 2);
        
        System.out.println(inventory2.getCart());
        
        //System.out.println(item1);
        //inventory.changeQuantity(0, 30);
        
        //System.out.println(inventory);
        //System.out.println(inventory.getCart());
    }
}
