package Chapter10;

public class SwitchRow {
    public static void printArr(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    
    public static void switchArr(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        int[][] temp = new int[col][row];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[j][i] = arr[i][j];
            }
        }
        
        printArr(temp);
    }
    
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        printArr(arr);
        
        System.out.println();
        
        switchArr(arr);
    }
}
