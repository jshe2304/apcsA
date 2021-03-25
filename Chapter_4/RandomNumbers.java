package Chapter_4;

import java.util.*;

/*
 Write a program that will ask the user the number of choices
 to generate random number then ask the user the minimum and 
 the maximum range they would like; Find the sum of all the 
 generated number and then find the average. Furthermore, find
 the smallest and the largest number that was generate.
 */

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        int choices, min, max, sum = 0;
        
        System.out.println("How many numbers?");
        choices = scan.nextInt();
        
        System.out.println("Input the minimum for the numbers");
        min = scan.nextInt();
        
        System.out.println("Input the maximum for the numbers");
        max = scan.nextInt();
        
        int smallest = max, largest = min;
        
        for (int i = 0; i < choices; i++) {
            int num = generator.nextInt(max - min + 1) + min;
            System.out.print(num + " ");
            sum += num;
            
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }    
        }
        
        int average = sum/choices;
        
        System.out.println("\nSum : " + sum);
        System.out.println("Average : ~" + average);
        System.out.println("Smallest Number : " + smallest);
        System.out.println("Largest Number : " + largest);
        
    }
}

// How many numbers?
// 5
// Input the minimum for the numbers
// 1
// Input the maximum for the numbers
// 20
// 9 5 11 4 16 
// Sum : 45
// Average : ~9
// Smallest Number : 4
// Largest Number : 16