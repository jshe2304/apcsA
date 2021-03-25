package Chapter_4;

import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int maximum = -999999;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Input a number");
            int num = scan.nextInt();
            if (num > maximum) {
                maximum = num;
            }
        }
        System.out.println("The largest number inputted was " + maximum);
    }
}