package Chapter_4;

import java.util.*;

public class project4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side1, side2, side3, max;
        
        System.out.println("Input the lengths of the sides of the triangle");
        
        side1 = Math.abs(scan.nextInt());
        side2 = Math.abs(scan.nextInt());
        side3 = Math.abs(scan.nextInt());
        
        if(side1 > side2 && side1 > side3) {
            max = side1;
        } else if (side2 > side1 && side2 > side3){
            max = side2;
        } else {
            max = side3;
        }
        
        if(Math.pow(max, 2) == Math.pow(side1, 2) + Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(max, 2)) {
            System.out.println("Right");
        } else {
            System.out.println("Not Right");
        }
    }
}

// Input the lengths of the sides of the triangle
// 3
// 4
// 5
// Right