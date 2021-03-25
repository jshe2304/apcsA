package Chapter_4;

public class Pyramid {
    public static void main(String[] args) {
        int number = 9;
        for (int i = number; i > 0; i-=2) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
