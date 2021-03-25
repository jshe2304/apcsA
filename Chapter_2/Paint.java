package Chapter_2;

import java.util.Scanner;

public class Paint {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int coverage = 350;
        int length, width, height, doors, windows;
        double totalSqFt, paintNeeded;
        
        System.out.println("Input the length of the room in feet");
        length = scan.nextInt();
        
        System.out.println("Input the width of the room in feet");
        width = scan.nextInt();
        
        System.out.println("Input the height of the room in feet");
        height = scan.nextInt();
        
        System.out.println("Input the number of doors in the room");
        doors = scan.nextInt();
        
        System.out.println("Input the number of windows in the room");
        windows = scan.nextInt();
        
        totalSqFt = 2 * (width * length +height * length +height * width) - 
                    (doors * 20) - (windows * 15);
        
        paintNeeded = totalSqFt/coverage;
        
        //System.out.println(length + ", " + width + ", " + height);
        System.out.println("The surface area of the room is " + totalSqFt
                            + " square feet");
        System.out.println("The amount of paint needed is " + paintNeeded
                            + " gallons");
    }
}