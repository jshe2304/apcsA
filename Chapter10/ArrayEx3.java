package Chapter10;

public class ArrayEx3 {
    public static int[][] Table(int a, int b) {
        int[][] table = new int[a][b];
        
        int[][] num = new int[a][b];
        
        for (int i = 1; i <= a; i++) {
            
            for (int j = 1; j <= b; j++) {
                num[i-1][j-1] = i*j;
            }
            
        }
        return table;
    }
    
    public static void main(String[] args) {
        
        int limit = 12;
        
        int[][] num = new int[limit][limit];
        
        for (int i = 1; i <= limit; i++) {
            
            for (int j = 1; j <= limit; j++) {
                num[i-1][j-1] = i*j;
            }
            
        }
        
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
