package Chapter10;

public class HW5 {
    public static void reverse(int[] arr) {
        int[] temp = new int[arr.length];
        
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[arr.length - 1 - i] = arr[i];
        }
        
        for (int i : temp) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        reverse(arr);
    }
}

/*
0 9 8 7 6 5 4 3 2 1 
*/