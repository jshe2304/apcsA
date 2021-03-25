package Chapter10;

import java.util.*;

public class HW6 {
    public static void duplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[i]);
                    break;
                }
            }
        }
        
        System.out.println(duplicates);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
        
        duplicates(arr);
    }
}

/*
[2, 5, 6]
*/