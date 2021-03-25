package Chapter_3;

import java.util.*;

public class project3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double radius, diameter, circumference, surfaceArea, volume;
        
        System.out.println("Input the radius of the sphere");
        radius = scan.nextInt();
        
        diameter = radius * 2;
        
        circumference = diameter * Math.PI;
        
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        
        volume = (4 * Math.PI * Math.pow(radius, 3))/3;
        
        System.out.println("Radius : " + radius + "\nDiameter : " + diameter + "\nCircumference : " + circumference + "\nSurface Area : " + surfaceArea + "\nVolume : " + volume);
    }
}
