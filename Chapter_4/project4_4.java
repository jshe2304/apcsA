package Chapter_4;

import java.util.Scanner;
public class project4_4 {
    public static void main(String[] args){
       Scanner reader = new Scanner(System.in);
       
       System.out.print("Enter a number greater than 0: ");
       int number = reader.nextInt();
       
       long product = 1;
       int count = 1;
       
       while (count <= number){
           product = product * count;
           System.out.println(product);
           //System.out.println(count);
           count++;
        }
        
        System.out.println("The factorial of " + number + " is " + product);
    } 
}

/*
The problem is that the int type is no longer enough to store the value

The same thing happens as the numbers grow larger
The problem reemerges at 21
 */