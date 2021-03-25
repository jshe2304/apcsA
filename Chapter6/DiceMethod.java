package Chapter6;

public class DiceMethod {
	public static int DiceMethod (int rolls, int sum1, int sum2, Die dice1, Die dice2) {
		int count = 0;

		for (int i = 0; i < rolls; i++) {
			int sum = dice1.roll() + dice2.roll();
			if (sum == sum1 || sum == sum2) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Die dice1 = new Die(6);
		Die dice2 = new Die(6);
		System.out.println(DiceMethod(100, 7, 11, dice1, dice2));
	}
}