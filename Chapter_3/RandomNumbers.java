package Chapter_3;

import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int range1;
        
        System.out.println("What is the limit for your numbers?");
        range1 = scan.nextInt();
        
        //range1 = 9;
        
        // num1 = generator.nextInt(100);
        // System.out.println("A random number between 0 and 99 is " + num1);
        
        // num2 = generator.nextInt(1000) + 1;
        // System.out.println("A random number between 1 and 1000 is " + num2);
        
        num1 = generator.nextInt(range1) + 1;
        num2 = generator.nextInt(range1) + 1;
        num3 = generator.nextInt(range1) + 1;
        
        System.out.println("Your numbers are:\n" + num1 + "\t" + num2 + "\t" + num3);
    }
}