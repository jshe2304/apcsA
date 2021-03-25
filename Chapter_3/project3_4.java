package Chapter_3;

import java.util.*;

public class project3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double hourlyWage, regularHours, regularWeeklyPay, overtimeHours, overtimePay, totalWeeklyPay;
        
        System.out.println("Input the hourly wage");
        hourlyWage = scan.nextDouble();  
        
        System.out.println("Input the number of regular hours");
        regularHours = scan.nextDouble();   
        
        System.out.println("Input the number of overtime hours");
        overtimeHours = scan.nextDouble();    
        
        regularWeeklyPay = hourlyWage * regularHours;
        overtimePay = hourlyWage * 1.5 * overtimeHours;
        
        totalWeeklyPay = regularWeeklyPay + overtimePay;
        
        System.out.println("The total weekly pay is " + totalWeeklyPay);
    }
}
