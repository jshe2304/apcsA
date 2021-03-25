package Chapter6;

public class d7_11 {
    public static void main (String[] args) {
        final int ROLLS = 10000;
        int sum = 0, num1, num2;

        PairOfDice1 mygame = new PairOfDice1();
        sum = mygame.roll();
        System.out.println(sum);
        System.out.println(mygame.getDie1 ());
        System.out.println(mygame.getDie2 ());
    }
}