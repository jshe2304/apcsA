package Chapter10;

public class HW8 {
    public static void main(String[] args) {
        int rows = 5;
        int[][] triangle = new int[rows][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i+1; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }
        }
        
        for (int[] i : triangle) {
            for (int j : i) {
                if (j != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

/*
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
*/