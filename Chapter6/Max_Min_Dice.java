package Chapter6;

public class Max_Min_Dice {
    public static void main(String[] args) {
        Dice die1 = new Dice(100);
        Dice die2 = new Dice(100);
        
        PairOfDice dice = new PairOfDice(die1, die2);
        
        System.out.println("Maximum Roll : " + dice.Max(1000));
        System.out.println("Minimum Roll : " + dice.Min(1000));

    }
}
