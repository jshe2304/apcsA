package Chapter10;

import java.util.*;

public class NumCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] ranges = new int [10];
        int box;
        
        int num = 1;
        
        while (num >= 1 && num <= 100) {
            box = (num - 1) / 10;
            ranges[box] ++;
            num = scan.nextInt ();
        }
        
        for (box = 0; box < 10; box++) {
            System.out.print ((10 * box + 1) + "-");
            System.out.print ((10 * box + 10) + "\t|");
            for (int count = 0; count < ranges[box]; count++) {
                System.out.print ("*");
                System.out.println ();
            }
        }
    }
}
