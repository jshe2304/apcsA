package Chapter_3;

import java.util.*;

public class project3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edge, surfaceArea;
        
        System.out.println("Input the length of the cube");
        edge = scan.nextInt();
        
        surfaceArea = edge * edge * 6;
        
        System.out.println("The surface area of a " + edge +
                            "x" + edge + "x" + edge + " cube is "
                            + surfaceArea); 
        
    }
}