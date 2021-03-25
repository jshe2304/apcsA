package Chapter_2;

//********************************************************************
//  Quadratic.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates a calculation based on user input.
//********************************************************************

//import cs1.Keyboard;
import java.util.*;

public class Quadratic
{
   //-----------------------------------------------------------------
   //  Determines the roots of a quadratic equation.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int a, b, c;  // ax^2 + bx + c
      
      System.out.print ("Enter the coefficient of x squared: ");
      a = scan.nextInt();
      
      System.out.print ("Enter the coefficient of x: ");
      b = scan.nextInt();

      System.out.print ("Enter the constant: ");
      c = scan.nextInt();

      // Use the quadratic formula to compute the roots.
      // Assumes a positive discriminant.

      double discriminant = Math.pow(b, 2) - (4 * a * c);
      double root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
      double root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

      System.out.println ("Root #1: " + root1);
      System.out.println ("Root #2: " + root2);
   }
}