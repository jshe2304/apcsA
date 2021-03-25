package Chapter_3;

import java.util.*;

public class project3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double hourlyWage, regularHours, regularWeeklyPay, overtimeHours, overtimePay, totalWeeklyPay;
        
        System.out.println("Input the hourly wage");
        hourlyWage = scan.nextDouble();  
        
        regularHours = 0;
        System.out.println("Enter the regular hours worked each day sequentially");
        regularHours += scan.nextDouble();
        regularHours += scan.nextDouble();
        regularHours += scan.nextDouble();
        regularHours += scan.nextDouble();
        regularHours += scan.nextDouble();
        regularWeeklyPay = regularHours * hourlyWage;
        
        overtimeHours = 0;
        System.out.println("Enter the overtime hours worked each day sequentially");
        overtimeHours += scan.nextDouble();
        overtimeHours += scan.nextDouble();
        overtimeHours += scan.nextDouble();
        overtimeHours += scan.nextDouble();
        overtimeHours += scan.nextDouble();
        overtimePay = hourlyWage * 1.5 * overtimeHours;
        
        totalWeeklyPay = regularWeeklyPay + overtimePay;
        
        System.out.println("The total weekly pay is " + totalWeeklyPay);
    }
}
