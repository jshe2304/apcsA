package Chapter_4;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String running = "y";
        
        while(running.equals("y")) {
            System.out.println("Input your word or phrase");
            String input = scan.nextLine();
            
            int left = 0, right = input.length()-1;
            
            Boolean palindrome = true;

            while(left != right && palindrome) {
                Character leftChar = input.charAt(left);
                Character rightChar = input.charAt(right);
                
                if (!leftChar.equals(rightChar)) {
                    palindrome = false;
                    break;
                } else {
                    left++;
                    right--;
                }
            }
            
            if (palindrome) {
                System.out.println("It is a palindrome");
            } else {
                System.out.println("It is not a palindrome");
            }
            
            System.out.println("Continue (y/n)");
            running = scan.nextLine();
        }
    }
}
