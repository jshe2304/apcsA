package Chapter_2;

import java.util.*;

public class project2_5 {
    public static void main(String[] args) {
        float mass, velocity, momentum;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the mass");
        mass = scan.nextFloat();
        
        System.out.println("Input the velocity");
        velocity = scan.nextFloat();
        
        momentum = mass * velocity;
        System.out.println("The momentum is " + momentum + " kg*m/s");
    }
}
