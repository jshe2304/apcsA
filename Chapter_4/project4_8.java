package Chapter_4;

import java.util.*;

public class project4_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input your base");
        int base = scan.nextInt();
        
        System.out.println("Input your exponent");
        int exp = scan.nextInt();
        
        while (exp >= 0) {
            System.out.println("The power is " + Math.pow(base, exp));
            System.out.println("Input your exponent. Enter -1 to exit");
            exp = scan.nextInt();
        }
    }
}

// Input your base
// 3
// Input your exponent
// 3
// The power is 27.0
// Input your exponent. Enter -1 to exit
// 5
// The power is 243.0
// Input your exponent. Enter -1 to exit
// 7
// The power is 2187.0
// Input your exponent. Enter -1 to exit
// 9
// The power is 19683.0
// Input your exponent. Enter -1 to exit
// -1