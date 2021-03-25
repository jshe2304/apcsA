package Chapter6;

import java.util.*;

public class Reverse {
    public static String Reverse (String str) {
        String reverse = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        
        return reverse;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        
        System.out.println(Reverse(scan.nextLine()));
    }
}

/*
Input a string
hello world
dlrow olleh
*/