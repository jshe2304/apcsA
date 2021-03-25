package Chapter_4;

public class FlippedTriangle {
    public static void main (String[] args) {
        final int maxRows = 10;
        for (int row = maxRows; row >= 0; row--) {
            for (int space = row - 1; space >= 1; space--) {
                System.out.print("-");
            }
            for (int i = 1; i <= maxRows-row; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
