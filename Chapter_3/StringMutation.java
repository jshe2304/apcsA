package Chapter_3;

import java.util.*;

public class StringMutation {
    public static void main(String[] args) {
        String phrase = new String("Hello");
        
        int length;
        String mutation1, mutation2, mutation3, mutation4, substring1, letter1, letter2;
        
        length = phrase.length();
        
        mutation1 = phrase.concat(" World");
        
        mutation2 = mutation1.toUpperCase();
        
        mutation3 = mutation2.toLowerCase();
        
        mutation4 = mutation1.replace("o", "x");
        
        substring1 = phrase.substring(1,4);
        
        letter1 = "d";
        letter2 = "f";
        
        System.out.println("Phrase : " + phrase);
        System.out.println("Length : " + length);
        System.out.println("Mutation 1 : " + mutation1);
        System.out.println("Mutation 2 : " + mutation2);
        System.out.println("Mutation 3 : " + mutation3);
        System.out.println("Mutation 4 : " + mutation4);
        System.out.println("Substring :" + substring1);
        System.out.println("Comparison : " + letter1.compareTo(letter2));
        System.out.println("Equals : " + mutation1.equals(mutation2));
        System.out.println("Equals Without Cases : " + phrase.equalsIgnoreCase(mutation1));
    }
}
