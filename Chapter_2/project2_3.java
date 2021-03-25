package Chapter_2;

import java.util.*;

public class project2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //From North Pole to Equator there are 90 * 60 nautical miles
        //From North Pole to Equator there are 10000 kilometers
        //One kilometer is equal to 90*60/10000 = 0.54
        
        int kilometer;
        double conversion = 0.54;
        
        //System.out.println(conversion);
        
        System.out.println("Enter the number of kilometers");
        kilometer = scan.nextInt();
        
        System.out.println(kilometer + "kilometers = " + kilometer
                            * conversion + "nautical miles");
    }
}