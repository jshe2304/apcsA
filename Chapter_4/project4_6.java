package Chapter_4;

import java.util.*;

public class project4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initial, rateHours, hours, total, rate;
        
        System.out.println("Input initial population");
        initial = scan.nextInt();
        
        System.out.println("Input rate");
        rate = scan.nextInt();
         
        System.out.println("Input the hours it takes to achieve the rate");
        rateHours = scan.nextInt();
        
        System.out.println("Input the total hours");
        hours = scan.nextInt();
        
        total = ((hours/rateHours)*rate)*initial;
        System.out.println(total);
    }
}

// Input initial population
// 500
// Input rate
// 2
// Input the hours it takes to achieve the rate
// 6
// Input the total hours
// 12
// 2000