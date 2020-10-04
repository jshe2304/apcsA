package chapter4;

import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        Boolean playing = true;
        int score = 0;
        
         while (playing){
            GuessNumber game1 = new GuessNumber();
            score += game1.GuessGame(generator, scan);
            
            System.out.println("Your score is : " + score);            
            System.out.println("Do you want to keep playing yes or no");
            

            Boolean answered = false;
            
            do {
                String answer = scan.nextLine();
                if (answer.equals("no")) {
                    playing = false;
                    answered = true;
                } else if (answer.equals("yes")){
                    playing = true;
                    answered = true;
                }
            } while (answered == false);
        }
    }
    
    public int GuessGame(Random generator, Scanner scan) {
        int num, guess, tries = 0, maxTries = 10, limit = 100;
        
        num = generator.nextInt(limit) + 1;
        
        System.out.println("Guess a number");

        do {
            guess = scan.nextInt();
            tries++;
            if (guess > num) {
                System.out.println("Too High! Guess Again");
            } else {
                System.out.println("Too Low! Guess Again");
            }
        } while (guess != num && tries <= maxTries);
        
        if(tries > maxTries) {
            System.out.println("You ran out of guesses!");
        } else {
            System.out.println("You got it right!");
            System.out.println("Tries : " + tries);
            System.out.println("Score : " + (maxTries - tries));
        }
        return (maxTries-tries);
    }
}
