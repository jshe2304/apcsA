package Chapter_4;

import java.util.Scanner;
public class LeapYear {
//-----------------------------------------------------------------
// Reads an integer value representing a year. Determines if the year
// is a leap year
//-----------------------------------------------------------------
    public static void main (String[] args) {
        int year;
        boolean leap = false;

        System.out.print("Enter a year : ");
        Scanner scan = new Scanner (System.in);
        year = scan.nextInt();

        if (year < 1582)
            System.out.println("ERROR year not valid in the Gregorian calendar");
        else {
            if (year % 4 == 0) // divisible by 4
            {
                leap = true;
                if ((year % 100 == 0) && (year % 400 != 0))
                {
                    leap = false;
                }
            }
            if (leap)
            System.out.println(year + " is a leap year");
            else
            System.out.println(year + " is not a leap year");
        }

    }
}