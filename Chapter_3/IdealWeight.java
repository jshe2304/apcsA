package Chapter_3;

import java.util.*;

public class IdealWeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int feet, inches, inchesOver, weightMale, weightFemale;
        
        System.out.println("Input the feet");
        feet = scan.nextInt();
        
        System.out.println("Input the inches");
        inches = scan.nextInt();
        
        inchesOver = (feet - 5) * 12 + inches;
        weightMale = inchesOver * 6 + 106;
        weightFemale = inchesOver * 5 + 100;
        
        //System.out.println(inchesOver);
        
        System.out.println("The ideal weight for a " + feet + "'"
        + inches + " male is " + weightMale + " pounds, or between "
        + Math.round(0.85 *weightMale) + " and " + 
        Math.round(1.15 * weightMale) + " pounds");
        
        System.out.println("The ideal weight for a " + feet + "'"
        + inches + " female is " + weightFemale + " pounds, or between "
        + Math.round(0.85 * weightFemale) + " and " + 
        Math.round(1.15 * weightFemale) + " pounds");
    }
}

