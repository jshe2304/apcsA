package Chapter6;

import java.util.*;

public class sumRange {
    public static String sumRange (int num1, int num2) {
        int sum = 0;
        
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
        }
        
        if (sum == 0) {
            return "Error!\nSum : " + sum;
        } else {
            return "Sum : " + sum;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        int num1 = scan.nextInt();
        System.out.println("Input a number");
        int num2 = scan.nextInt();
        
        System.out.println(sumRange(num1, num2));
    }
}

/*
Input a number
5
Input a number
1
Error!
Sum : 0
*/

/*
Input a number
1
Input a number
5
Sum : 15
*/
