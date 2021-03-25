package Chapter10;

import java.util.*;

public class Band {
    public static void main(String[] args) {
        ArrayList<String> band = new ArrayList<String>();
        
        band.add("Steve");
        band.add("Tim");
        band.add("Lucy");
        band.add("Pat");
        band.add("Angela");
        band.add("Tom");
        
        bandInfo(band);
        
        if(checkMember(band, "Pat")) {
            System.out.println("\nPat is in the band");
        } else {
            System.out.println("\nPat is not in the band");
        }
        
        removeMember(band, "Steve");
        removeMember(band, "Angela");
        
        lastMember(band, "Sarah");
        
        System.out.println();
        
        displayBand(band);
        
        System.out.println();
        
        band.remove(3);
        
        System.out.println();
        
        empty(band);
        
        System.out.println();
        
        bandInfo(band);
    }
    
    public static void bandInfo(ArrayList<String> band) {
        System.out.println("Band\n--------------------");
        String str1 = "";
        for (String i : band) {
            str1 += (i + ", ");
        }
        System.out.println(str1.substring(0, str1.length() - 2));
        
        System.out.println();
        
        System.out.println("Band Size: " + band.size());
    }
    
    public static boolean checkMember(ArrayList<String> band, String name) {
        boolean inList = false;
        while(inList == false) {
            for (String i : band) {
                if (i == name) {
                    inList = true;
                }
            }
            break;
        }
        return inList;
    }
    
    public static void removeMember(ArrayList<String> band, String name) {
        for (int i = 0; i < band.size(); i++) {
            if (band.get(i) == name) {
                band.remove(i);
            }
        }
    }
    
    public static void lastMember(ArrayList<String> band, String name) {
        band.remove(band.size() - 1);
        band.add("Sarah");
    }
    
    public static void displayBand(ArrayList<String> band) {
        for (int i = 0; i < band.size() - 1; i++) {
            System.out.print(band.get(i) + ", ");
        }
        System.out.print(band.get(band.size() - 1));
    }
    
    public static void empty(ArrayList<String> band) {
        if (band.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }
    }
}
