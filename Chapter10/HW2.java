package Chapter10;

public class HW2 {
    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    
    public static int avg(int[] array) {
        return (sum(array))/(array.length);
    }
    
    public static void main(String[] args) {
        int[] array = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        
        System.out.println(sum(array));
        System.out.println(avg(array));
    }
}

/*
45
5
*/
