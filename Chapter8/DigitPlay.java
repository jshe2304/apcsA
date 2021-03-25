package Chapter8;

import java.util.*;

public class DigitPlay {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int num; //a number
        System.out.print ("Please enter a positive integer: ");
        num = scan.nextInt();
        
        if (sumDigits(num) % 7 == 0) {
            System.out.println("OK, Sum : " + sumDigits(num));
        } else {
            System.out.println("Error");
        }
    }

    public static int sumDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + sumDigits(num / 10);
        }
    }
}

