package Chapter6;

import java.util.*;

public class Shapes {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("1 - Cube");
        System.out.println("2 - Rectangular Prism");
        System.out.println("3 - Sphere");
        System.out.println("4 - Rigth Circular Cylinder");
        System.out.println("5 - Right Circular Cone");
        System.out.println("6 - Right Square Pyramid");
        System.out.println("Enter \"1\", \"2\", \"3\", \"4\", \"5\", or \"6\"");
        System.out.println("Enter any other number to quit");

        int choice = scan.nextInt();
        
        while (choice >= 1 && choice <= 6) {
            if (choice == 1) {
                Cube();
            } else if (choice == 2){
                RectangularPrism();
            } else if (choice == 3){
                Sphere();
            } else if (choice == 4){
                Cylinder();
            } else if (choice == 5){
                Cone();
            } else if (choice == 6){
                Pyramid();
            }
            
            System.out.println("Enter \"1\", \"2\", \"3\", \"4\", \"5\", or \"6\"");
            System.out.println("Enter any other number to quit");
            choice = scan.nextInt();
        }
        
    }
    
    public static void Cube () {
        System.out.println("Input the length");
        int length = scan.nextInt();
        double volume = Math.pow(length, 3);
        System.out.println("The volume is " + volume);
    }
    
    public static void RectangularPrism() {
        System.out.println("Input the length of the first side");
        int length1 = scan.nextInt();
        System.out.println("Input the length of the second side");
        int length2 = scan.nextInt();
        System.out.println("Input the length of the third side");
        int length3 = scan.nextInt();
        int volume = length1*length2*length3;
        System.out.println("The volume is " + length1*length2*length3);
    }
    
    public static void Sphere() {
        System.out.println("Input the radius");
        int radius = scan.nextInt();
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume is " + volume);
    }
    
    public static void Cylinder() {
        System.out.println("Input the radius");
        int radius = scan.nextInt();
        System.out.println("Input the height");
        int height = scan.nextInt();
        double volume = height * Math.PI * Math.pow(radius, 2);
        System.out.println("The volume " + volume);
    }
    
    public static void Cone() {
        System.out.println("Input the radius");
        int radius = scan.nextInt();
        System.out.println("Input the height");
        int height = scan.nextInt();
        double volume = height * Math.PI * Math.pow(radius, 2) / 3;
        System.out.println("The volume is " + volume);
    }
    
    public static void Pyramid() {
        System.out.println("Input the length");
        int length = scan.nextInt();
        System.out.println("Input the height");
        int height = scan.nextInt();
        double volume = height * Math.pow(length, 2) / 3;
        System.out.println("The volume is " + volume);
    }
}
