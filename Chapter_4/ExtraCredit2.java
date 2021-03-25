package Chapter_4;

import java.util.*;

public class ExtraCredit2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input a limit for your table");
        int num = scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}

/*
Input a limit for your table
6
1	2	3	4	5	6	
2	4	6	8	10	12	
3	6	9	12	15	18	
4	8	12	16	20	24	
5	10	15	20	25	30	
6	12	18	24	30	36	
*/