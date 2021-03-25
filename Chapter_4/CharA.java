package Chapter_4;

import java.util.*;

public class CharA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a message");
        String input = scan.nextLine();
        
        int count = 0;
        
        for (int i = 0; i < input.length(); i++) {
            
            char letter = input.charAt(i);
            
            if (letter == 'a' || letter == 'A') {
                count++;
            }
        }
        System.out.println("There were " + count + " A's in your input");
    }
}