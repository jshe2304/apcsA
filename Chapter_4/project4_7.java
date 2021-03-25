package Chapter_4;

import java.util.*;

public class project4_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input your exponent");
        int exp = scan.nextInt();
        
        while (exp >= 0) {
            System.out.println("The power is " + Math.pow(2, exp));
            System.out.println("Input your exponent. Enter -1 to exit");
            exp = scan.nextInt();
        }
    }
}

// Input your exponent
// 2
// The power is 4.0
// Input your exponent. Enter -1 to exit
// 5
// The power is 32.0
// Input your exponent. Enter -1 to exit
// 7
// The power is 128.0
// Input your exponent. Enter -1 to exit
// 9
// The power is 512.0
// Input your exponent. Enter -1 to exit
// -1
