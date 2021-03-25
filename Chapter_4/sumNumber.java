package Chapter_4;

import java.util.*;

public class sumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
    
        System.out.println("Enter a number");
        int num = Math.abs(scan.nextInt());
        
        while (num>0) {
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        
        System.out.println("Sum : " + sum);
        
    }
}