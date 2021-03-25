package Chapter6;

import java.util.Random;

public class m2 {
    public static void main(String[] args) {
        System.out.println("About to encounter a method.");

        // method call
        myMethod1();
        myMethod2();
        System.out.println("Method was executed successfully!");
    }

    public static void myMethod1() {
        System.out.println("My Function called");
    }

    public static void myMethod2() {
        System.out.println("Printing from inside myMethod2()!");
    }
}