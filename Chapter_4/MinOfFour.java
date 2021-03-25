package Chapter_4;

//********************************************************************
//  MinOfThree.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of nested if statements.
//********************************************************************

import java.util.*;

public class MinOfFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1, num2, num3, num4, min = 0;
        
        System.out.println("Enter four numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        
        if ((num1<num2) && (num1<num3) && (num1<num4))
            min = num1;
        else {
            if ((num2<num1) && (num2<num3) && (num2<num4)) 
                min = num2;
            else {
                if ((num3<num1) && (num3<num2) && (num3<num4))
                    min = num3;
                else
                    min = num4;
            }
        }
        
        System.out.println("The smallest number is " + min);
        
    }
}
