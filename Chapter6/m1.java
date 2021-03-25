package Chapter6;

public class m1 {
    public static void main(String[] args) {
        myMethod("Lili", 5);
        myMethod("Jenny", 8);
        myMethod("Anna", 11);
    }

    public static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
}