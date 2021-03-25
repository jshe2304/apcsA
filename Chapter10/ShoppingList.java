package Chapter10;

import java.util.*;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Item> list = new ArrayList<Item>();
        double totalPrice = 0;
        int totalQuantity = 0;
        
        String shopping = "y";
        System.out.println("Would you like to shop? (y/n)");
        shopping = scan.nextLine();
        
        while (shopping.equals("y")) {
            System.out.println("Name of item:");
            String name = scan.nextLine();
            
            System.out.println("Price per item:");
            double price = scan.nextDouble();
            
            System.out.println("Quantity of items:");
            int quantity = scan.nextInt();
            
            totalPrice += price*quantity;
            totalQuantity += quantity;
            
            Item myItem = new Item(name, price, quantity);
            
            System.out.println(myItem);
            list.add(myItem);
            
            System.out.println("\n----------Cart----------");
            
            for (Item i : list) {
                System.out.println(i);
            }
            
            System.out.println("\nTotal: $" + totalPrice);
            System.out.println("Items: " + totalQuantity);
            
            System.out.println("------------------------\n");
            
            System.out.println("Continue shopping? (y/n)");
            shopping = scan.nextLine() + scan.nextLine();
        }
        
        System.out.println("\n-------Final Cart-------");
            
        for (Item i : list) {
            System.out.println(i);
        }
            
        System.out.println("\nTotal: $" + totalPrice);
        System.out.println("Items: " + totalQuantity);
        
        System.out.println("------------------------\n");
    }
}
