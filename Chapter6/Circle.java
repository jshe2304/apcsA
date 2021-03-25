package Chapter6;

import java.util.*;

class Circle {
    private static double area(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        System.out.println("The area is " + area(5));
    }

}