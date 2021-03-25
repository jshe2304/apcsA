package Chapter10;

public class HW4 {
    public static int max(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i>max) {
                max = i;
            }
        }
        return max;
    }
    
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i<min) {
                min = i;
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.println("Max: " + max(arr));
        System.out.println("Min: " + min(arr));
    }
}

/*
Max: 9
Min: 1
*/
