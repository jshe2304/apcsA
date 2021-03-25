package Chapter6;

class m3 {
    public static void main(String[] args) {
        int result;

        // call the method and store returned value
        result = square();
        System.out.println("Squared value of 10 is: " + result);
        System.out.println("Squared value of 10 is: " + square2(15,10));
        System.out.println("Squared value of 10 is: " + square3(15));
    }

    public static int square() {
        // return statement
        return 10 * 10;
    }

    public static int square2(int i, int j) {
        // return statement
        return i * j;
    }

    static int square3(int i) {
        return i * i;
    }
}