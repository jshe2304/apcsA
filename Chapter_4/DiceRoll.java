package Chapter_4;

import java.util.*;

public class DiceRoll {
    public static void main(String[] args) {
        Random generator = new Random();
        int limit = 10000;
        int snakeEyes = 0;
        int boxcard = 0;
        
        for (int count = 0; count < limit; count++) {
             int num1 = generator.nextInt(6) + 1;
             int num2 = generator.nextInt(6) + 1;
             System.out.println("Dice 1 : " + num1 + "\tDice 2 : " + num2);
             if(num1 == 1 && num2 == 1) {
                 snakeEyes++;
             }
             if (num1 == 6 && num2 == 6) {
                 boxcard++;
             }
        }
        
        System.out.println("Snake Eyes : " + snakeEyes + " out of " + limit);
        System.out.println("Boxcards : " + boxcard + " out of " + limit);
    }
}