package Chapter_4;

import java.util.*;

public class project4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cost = 0;
        
        System.out.println("Input the minutes");
        int minutes = scan.nextInt();
        
        if (minutes <= 2){
            cost += 1.15;
        } else {
            cost += 1.15 + (minutes-2)*0.5;
        }
        
        System.out.println("The cost of your call is $" + cost);
        
    }
}

// Input the minutes
// 5
// The cost of your call is $2.65
