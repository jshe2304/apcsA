package Chapter_2;

import java.util.*;

public class project2_4 {
    public static void main(String[] args) {
        int minutesHour = 60;
        int hoursDay = 24;
        int daysYear = 365;
        int minutes;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input number of years");
        int years = scan.nextInt();
        
        minutes = minutesHour * hoursDay * daysYear * years;
        System.out.println("In " + years + " years, there are " + minutes + " minutes");
    }
}
