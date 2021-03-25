package Chapter_4;

import java.util.*;

public class Count {
    public static void main (String[] args) {
        String running = "y";        
        Scanner scan = new Scanner(System.in);

        while (!running.equals("quit")) {
            String phrase;
            int countBlank = 0, countA = 0, countE = 0, countS = 0, countT = 0;
        
            System.out.println("Input your phrase");
            phrase = scan.nextLine();
        
            int length = phrase.length();

            for (int i = 0; i <= length - 1; i++) {
                Character ch = phrase.charAt(i);
            
                // if (ch.equals(' ')) {
                // countBlank++;
                // } else if (ch.equals('A') || ch.equals('a')) {
                // countA++;
                // } else if (ch.equals('E') || ch.equals('e')) {
                // countE++;
                // } else if (ch.equals('S') || ch.equals('s')) {
                // countS++;
                // } else if (ch.equals('T') || ch.equals('t')) {
                // countT++;
                // }
            
                switch(ch) {
                    case ' ':
                        countBlank++;
                        break;
                    case 'A':
                        countA++;
                        break;
                    case 'E':
                        countE++;
                        break;
                    case 'S':
                        countS++;
                        break;
                    case 'T':
                        countT++;
                        break;
                    case 'a':
                        countA++;
                        break;
                    case 'e':
                        countE++;
                        break;
                    case 's':
                        countS++;
                        break;
                    case 't':
                        countT++;
                        break;
                }
            } 

        
            System.out.println("Blanks : " + countBlank);
            System.out.println("A's : " + countA);
            System.out.println("E's : " + countE);
            System.out.println("S's : " + countS);
            System.out.println("T's : " + countT);
            
            System.out.println("Type quit to exit");
            running = scan.nextLine();
        }
    }
}