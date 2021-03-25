package Chapter_4;

import java.util.*;

public class ExtraCredit1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input a number");
        int num = scan.nextInt();
        
        int sum = 0;
        
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
            if (num%2 == 0) {
                if (i%2 != 0) {
                    sum += i;
                }
            } else {
                if (i%2 == 0) {
                    sum += i;
                }
            }
        }
        if (num%2 == 0) {
            System.out.println("The sum of the odd numbers is " + sum);
        } else {
            System.out.println("The sum of the even numbers is " + sum);
        }
    }
}

/*
Input a number
10
0
1
2
3
4
5
6
7
8
9
10
The sum of the odd numbers is 25
*/

/*
Input a number
11
0
1
2
3
4
5
6
7
8
9
10
11
The sum of the even numbers is 30
 */