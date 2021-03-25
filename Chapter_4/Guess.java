package Chapter_4;

import java.util.*;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numToGuess, guess, tries = 0, high = 0, low = 0;
        
        Random generator = new Random();
        numToGuess = generator.nextInt(100);
        
        System.out.println("Guess a number");
        guess = scan.nextInt();
        
        while (guess != numToGuess) {
            tries++;
            if (guess > numToGuess) {
                System.out.println("Too High! Guess Again");
                guess = scan.nextInt();
                high++;
            } else {
                System.out.println("Too Low! Guess Again");
                guess = scan.nextInt();
                low++;
            }
        }
        
        System.out.println("You got it right!");
        System.out.println("Tries : " + tries);
        System.out.println("Guesses too high : " + high);
        System.out.println("Guesses too low : " + low);
        
        
    }
}