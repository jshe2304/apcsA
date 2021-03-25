package Chapter8;

public class Exponent {
    public static int square(int input) {
        int n = input;
        if (input < 0) {
            n = input * -1;
        }
        if (n != 0) {
            return square(n-1) + 2*(n-1) + 1;
        } else {
            return 0;
        }
    }
    
    public static int cube(int input) {
        if (input == 0) {
            return 0;
        } else {
            return cube(input - 1) + 3*(square(input-1)) + 3*(input-1) + 1;
        }
    }
}
