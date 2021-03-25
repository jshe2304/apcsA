package Chapter_4;

import java.util.*;

public class Sentinel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sentinel = 10;
        Boolean guessed = false;
        
        while (!guessed) {
            System.out.println("Input a number");
            int input = scan.nextInt();
            
            System.out.println("You inputted " + input);
            
            if (input == sentinel) {
                guessed = true;
            }
        }
        
        System.out.println("You guessed it right");
        
    }
}
