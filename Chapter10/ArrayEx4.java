package Chapter10;

import java.util.*;

public class ArrayEx4 {
    public static void swapArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        
        System.out.println("\nSwapped Array");
        
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
    
    public static void swapArray(int[] array, int a, int b) {
        if (a >= 0 && a <= array.length && b >= 0 && b <= array.length) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        
            System.out.println("\nArray with swapped values at indexes " + a + " and " + b);
        
            for (int i :  array) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("\nIndexes not in range");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input Array Size : ");
        int len = scan.nextInt();
        int[] array = new int[len];
        
        System.out.println();
        
        for (int i = 1; i <= len; i++) {
            System.out.print("Input element " + i + " : ");
            int input = scan.nextInt();
            array[i-1] = input;
            System.out.println();
        }
        
        System.out.println("Forward :");   
        
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        System.out.println("\nBackward :");
        
        for (int i = len-1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        swapArray(array);
        
        System.out.println("\nWhat indexes to swap?");
        
        swapArray(array, scan.nextInt(), scan.nextInt());
        
        /*
        for (int i = 0; i < len/2; i++) {
            int temp = array[i];
            array[i] = array[len-i-1];
            array[len-i-1] = temp;
        }
        
        System.out.println("\nSwapped Array");
        
        for (int i : array) {
            System.out.print(i + " ");
        }
        */
    }
}
