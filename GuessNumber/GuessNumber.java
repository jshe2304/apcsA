package chapter4;

import java.util.*;

public class GuessNumber    {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num, guess, tries = 0, maxTries = 10, limit = 100;
        
        Random generator = new Random();
        num = generator.nextInt(limit) + 1;
        
        System.out.println("Guess a number");
        guess = scan.nextInt();
        
        while (guess != num && tries <= maxTries) {
            tries++;
            if (guess > num) {
                System.out.println("Too High! Guess Again");
                guess = scan.nextInt();
            } else {
                System.out.println("Too Low! Guess Again");
                guess = scan.nextInt();
            }
        }
        
        if(tries > maxTries) {
            System.out.println("You ran out of guesses!");
        } else {
            System.out.println("You got it right!");
            System.out.println("Tries : " + tries);
            System.out.println("Score : " + (maxTries - tries));
        }
    }
}
