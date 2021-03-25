package Chapter_4;

import java.util.*;

public class project4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Input two numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        if (num1 > num2) {
            int remainder = num1 % num2;
            System.out.println((num1 - remainder)/num2 + " R " + remainder);
        } else {
            int remainder = num2 % num1;
            System.out.println((num2 - remainder)/num1 + " R " + remainder);
        }
    }
}

// Input two numbers
// 9
// 2
// 4 R 1
