package Chapter_2;

//********************************************************************
//  Geometry.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an assignment statement to change the
//  value stored in a variable.
//********************************************************************

public class Geometry
{
   //-----------------------------------------------------------------
   //  Prints the number of sides of several geometric shapes.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int sides = 7;  // declaration with initialization
      System.out.println ("A heptagon has " + sides + " sides.");

      sides = 10;  // assignment statement
      System.out.println ("A decagon has " + sides + " sides.");

      sides = 12;
      System.out.println ("A dodecagon has " + sides + " sides.");
      
      double decimal = 2.5;
      System.out.println("Five divided by two equals : " + decimal);
      
      String animal = "elephant";
      System.out.println("The " + animal + " is my favorite animal");
      
      char letter = 'J';
      System.out.println("My name starts with the letter " + letter);
      
      boolean myAnswer = true;
      System.out.println("The earth is round : " + myAnswer);
   }
}