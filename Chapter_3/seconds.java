package Chapter_3;

import java.util.*;

public class seconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours, minutes, seconds, totalSeconds;

        System.out.println("Input the hours");
        hours = scan.nextInt();

        System.out.println("Input the minutes");
        minutes = scan.nextInt();

        System.out.println("Input the seconds");
        seconds = scan.nextInt();

        totalSeconds = hours * 3600 + minutes * 60 + seconds;

        System.out.println("The number of seconds in " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds is " + totalSeconds + " seconds");
    }
}
