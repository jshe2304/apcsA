package Chapter_4;

import java.util.*;

public class evenOddZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zero = 0, even = 0, odd = 0;
    
        System.out.println("Enter a number");
        int num = Math.abs(scan.nextInt());
        
        if (num==0) {
            zero++;
        }
        
        while (num>0) {
            int digit = num%10;
            
            if (digit == 0) {
                zero++;
            } else if (digit%2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num/10;
        }
        
        System.out.println("Zeroes : " + zero);
        System.out.println("Evens : " + even);
        System.out.println("Odd : " + odd);
        
    }
}