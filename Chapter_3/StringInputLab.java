package Chapter_3;

import java.util.*;

public class StringInputLab{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int length, index;
        String input, firstHalf, secondHalf, middleThree, rotated, input2;
        char lastLetter, firstLetter, indexChar;
        boolean stringsEqual;
        
        System.out.println("Enter your string");
        input = scan.nextLine();
        
        System.out.println("Enter another string");
        input2 = scan.nextLine();
        
        length = input.length();
        
        System.out.println("Enter an index between 0 and " + (length-1));
        index = scan.nextInt();
        

        
        firstHalf = input.substring(0, length/2);
        System.out.println("The first half of your input is \"" + firstHalf + "\"");
        
        secondHalf = input.substring(length/2, length);
        System.out.println("The second half of your input is \"" + secondHalf + "\"");
        
        System.out.println("The length of your string is " + length);
        
        lastLetter = input.charAt(length-1);
        System.out.println("The last character is \"" + lastLetter + "\"");
        
        firstLetter = input.charAt(0);
        System.out.println("The first character is \"" + firstLetter + "\"");
        
        middleThree = input.substring(length/2 - 1, length/2 + 2);
        System.out.println("The middle three characters are \"" + middleThree + "\"");
        
        indexChar = input.charAt(index);
        System.out.println("The character at index " + index + " is \"" + indexChar + "\"");
        
        rotated = secondHalf + firstHalf;
        System.out.println("The rotated input is \"" + rotated + "\"");
        
        stringsEqual = input.equals(input2);
        if(stringsEqual) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }
        
    }
}