package Chapter10;

public class ExtraCredit {
    public static void main(String[] args) {
        int len = 5;
        int[][] arr = new int[len][len];
        
        for (int i = 1; i <= len; i++) {
            int num = 0;
            for (int j = 1; j <= (len*2) - 1; j+=2) {
                arr[num][i-1] = i*j;
                num++;
            }
        }
        
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

/*
1	2	3	4	5	
3	6	9	12	15	
5	10	15	20	25	
7	14	21	28	35	
9	18	27	36	45
*/