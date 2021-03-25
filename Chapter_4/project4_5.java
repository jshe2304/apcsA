package Chapter_4;

import java.util.*;

public class project4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the desired number of iterations");
        int iterations = scan.nextInt();
        
        float num = -3;
        float pi = 1;
        
        for (int i = 0; i < iterations;i++) {
            pi += 1/num;
            if (num > 1) {
                num += 2;
            } else {
                num -= 2;
            }
            num *= -1;
        }
        System.out.println(pi*4);
    }
}

// Input the desired number of iterations
// 1000000000
// 3.1415968