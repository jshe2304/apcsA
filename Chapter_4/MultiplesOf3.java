package Chapter_4;

public class MultiplesOf3 {
    public static void main(String[] args) {
        for (int i = 300; i > 0; i--) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}