package Chapter_4;

import java.util.*;

public class Temperatures {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int max = -1000, min = 1000, maxHour = 0, minHour = 0;
        
        for (int i = 1; i <= 24; i++) {
            System.out.println("Enter the temperature at hour " + i);
            int temp = scan.nextInt();
            
            if (temp>max) {
                max = temp;
                maxHour = i;
            }
            
            if (temp < min) {
                min = temp;
                minHour = i;
            }
            
            System.out.println(max + " " + min + " " + maxHour + " " + minHour + " ");
        }
        
        System.out.println("The highest temperature was " + max + " at hour " + maxHour);
        System.out.println("The lowest temperature was " + min + " at hour " + minHour);
    }
}