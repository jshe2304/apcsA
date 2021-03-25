package Chapter_4;

import java.util.*;

public class SplitWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input your phrase");
        String phrase = scan.nextLine();
        
        for (int i = 0; i < phrase.length(); i++) {
            System.out.println(phrase.charAt(i));
        }
    }
}
