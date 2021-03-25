package Chapter_4;

public class MultiplicationTable{
    public static void main(String[] args) {
        int limit = 12;
        for(int i = 1; i <= limit; i++) {
            for (int j = 1;j <= limit; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println("\n");
        }
    }
}
