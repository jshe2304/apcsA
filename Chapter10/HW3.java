package Chapter10;

public class HW3 {
    public static void table(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {9, 8, 7}, {4, 5, 6}};
        table(array);
    }
}

/*
1	2	3	
9	8	7	
4	5	6	
*/
