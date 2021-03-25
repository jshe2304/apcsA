package Chapter10;

import java.util.*;

public class UserArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input number of rows");
        int rows = scan.nextInt();
        
        System.out.println("Input number of columns");
        int columns = scan.nextInt();
        
        int[][] array = new int[rows][columns];
        
        System.out.println("Input array elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {
            System.out.print("Row " + (i + 1) + ":\t");
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
