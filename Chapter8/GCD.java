package Chapter8;

public class GCD {
    public static int GCD (int i, int j) {
        if (j == 0) {
            return i;
        } else {
            return GCD(i, i % j);
        }
    }
}
