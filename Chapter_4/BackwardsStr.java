package Chapter_4;

import java.util.*;

public class BackwardsStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input a message");
        String str = scan.nextLine();
        
        for(int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}