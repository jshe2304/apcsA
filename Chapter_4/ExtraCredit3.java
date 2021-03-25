package Chapter_4;

import java.util.*;

public class ExtraCredit3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input a number");
        int num = scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}

/*
Input a number
7
1	
2	4	
3	6	9	
4	8	12	16	
5	10	15	20	25	
6	12	18	24	30	36	
7	14	21	28	35	42	49
*/