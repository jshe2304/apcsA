package Chapter10;

public class TwoDimensional{
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 22}, {30, 40, 44}, {5, 50, 55}};
        
        System.out.println("Elements: ");
        
        // System.out.print(arr[0][0] + " ");
        // System.out.print(arr[0][1] + " ");
        // System.out.print(arr[0][2]);
        // System.out.println();
        // System.out.print(arr[1][0] + " ");
        // System.out.print(arr[1][1] + " ");
        // System.out.print(arr[1][2]);
        
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
