package Chapter10;

import java.util.*;

public class Ingredients {
    public static void main(String[] args) {
        ArrayList<String> ingredients = new ArrayList<String>();
        
        ListIterator<String> Itr = ingredients.listIterator();
        
        ingredients.add("Flour");
        ingredients.add("Sugar");
        ingredients.add("Cocoa");
        ingredients.add("Oil");
        ingredients.add("Butter");
        ingredients.add("Eggs");
        ingredients.add("Baking Soda");
        
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.print(ingredients.get(i) + "\t");
        }
        
        System.out.println();
        
        for (String i : ingredients) {
            System.out.print(i + "\t");
        }
        
        while(Itr.hasNext()) {
            System.out.println(Itr.next());
        }
    }
}
