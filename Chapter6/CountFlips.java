package Chapter6;

public class CountFlips {
//-----------------------------------------------------------------
// Flips a coin multiple times and counts the number of heads
// and tails that result.
//-----------------------------------------------------------------
    public static void main (String[] args) {
        final int NUM_FLIPS = 1000000;
        int heads = 0, tails = 0;

        Coin myCoin1 = new Coin();
        // Coin myCoin2 = new Coin();
        // Coin myCoin3 = new Coin();
        // instantiate the Coin object

        for (int count=1; count <= NUM_FLIPS; count++) {
            myCoin1.flip();

            if (myCoin1.isHeads()) {
                heads++;
            } else {
                tails++;
            }
        
            System.out.println (" " + myCoin1);
        }
        // System.out.println (" " + myCoin1);
        System.out.println ("The number flips: " + NUM_FLIPS);
        System.out.println ("The number of heads: " + heads);
        System.out.println ("The number of tails: " + tails);
    }
}