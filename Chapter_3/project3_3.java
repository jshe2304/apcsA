package Chapter_3;

import java.util.*;

public class project3_3 {
    public static void main(String[] args) {
        double mass, velocity, momentum, kineticEnergy;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the mass");
        mass = scan.nextFloat();
        
        System.out.println("Input the velocity");
        velocity = scan.nextFloat();
        
        momentum = mass * velocity;
        kineticEnergy = 0.5 * mass * Math.pow(velocity, 2);
        
        System.out.println("The momentum is " + momentum + " kg*m/s");
        System.out.println("The kinetic energy is " + kineticEnergy + "Joules");
    }
}
