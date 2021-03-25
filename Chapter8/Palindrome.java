package Chapter8;

import java.util.*;

public class Palindrome {
    public static boolean palindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return palindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        if (palindrome("race car")) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }
    }
}
