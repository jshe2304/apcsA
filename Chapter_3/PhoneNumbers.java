package Chapter_3;

import java.util.Random;
import java.util.Formatter;

public class PhoneNumbers {
    public static void main(String[] args) {
        Random generator = new Random();
        int set1;
        String set2, set3;
        
        set1 = generator.nextInt(900) + 100;
        
        set2 = String.format("%03d", generator.nextInt(743));
        
        set3 = String.format("%04d", generator.nextInt(10000));
        
        System.out.println(set1 + "-" + set2 + "-" + set3);
    }
}
