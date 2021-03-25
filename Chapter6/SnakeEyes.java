package Chapter6;

public class SnakeEyes {

    public static void main (String[] args) {
        final int ROLLS = 1000;
        int snakeEyes = 0, num1, num2;
        
        Die die1 = new Die(100); // creates a six-sided die
        Die die2 = new Die();
        // Die die3 = new Die(5);// creates a twenty-sided die

        for (int roll = 1; roll <= ROLLS; roll++) {
            num1 = die1.roll();
            num2 = die2.roll();
            System.out.println ("Num#1: " + num1 + " "+"Num#2: " + num2 );

            if (num1 == 1 && num2 == 1) {// check for snake eyes
                snakeEyes++;
            }

            System.out.println ("Number of rolls: " + ROLLS);
            System.out.println ("Number of snake eyes: " + snakeEyes);
            System.out.println ("Ratio: " + (double)snakeEyes/ROLLS);
        }
    }
}