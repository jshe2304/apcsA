package Chapter_4;

public class InvertedTriangle {
//-----------------------------------------------------------------
// Prints a triangle shape using asterisk (star) characters.
//-----------------------------------------------------------------
    public static void main (String[] args) {
        final int maxRows = 100;
        for (int row = maxRows; row >= 1; row--) {
            for (int star = row; star >= 1; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}