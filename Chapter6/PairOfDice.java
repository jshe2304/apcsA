package Chapter6;

import java.util.*;

public class PairOfDice {
    
    Random generator = new Random();
    
    Dice dice1;
    Dice dice2;
    
    public PairOfDice (Dice dice1, Dice dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }
    
    public int sumRoll() {
        return dice1.Roll() + dice2.Roll();
    }
    
    public int Max(int count) {
        int max = 0;
        for (int i = 0; i < count; i++) {
            int roll = sumRoll();
            if (roll > max) {
                max = roll; 
            }
        }
        return max;
    }
    
    public int Min(int count) {
        int min = dice1.sides + dice2.sides;
        for (int i = 0; i < count; i++) {
            int roll = sumRoll();
            if (roll < min) {
                min = roll;
            }
        }
        return min;
    }
}

/*
public class Max_Min_Dice {
    public static void main(String[] args) {
        Dice die1 = new Dice(100);
        Dice die2 = new Dice(100);
        
        PairOfDice dice = new PairOfDice(die1, die2);
        
        System.out.println("Maximum Roll : " + dice.Max(1000));
        System.out.println("Minimum Roll : " + dice.Min(1000));

    }
}

Maximum Roll : 191
Minimum Roll : 6
*/
