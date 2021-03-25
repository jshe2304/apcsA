package Final;

public class Driver {
    public static void main (String[] args) {
        Food apple = new Food ("Apple", 12345, new Location(1, 5), 0.99, 20, true, false);
        Clothing tshirt = new Clothing ("T-Shirt", 54321, new Location(2, 3), 4.99, 10, "Mens", "Large");
        
        System.out.println(apple.adminString());
        System.out.println(tshirt.adminString());
    }
}
