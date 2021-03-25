package Chapter6;

public class FlipRace3 {
    public static void main(String[] args) {
        int goal = 5;
        int count1 = 0, count2 = 0, count3 = 0;

        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        Coin coin3 = new Coin();
        
        coin1.flip();
        coin2.flip();
        coin3.flip();
        
        Coin state1 = coin1, state2 = coin2, state3 = coin3;
        
        while (count1 < goal && count2 < goal && count3 < goal) {
            coin1.flip();
            coin2.flip();
            coin3.flip();
            
            System.out.println("Coin 1 : " + coin1 + "\t" + "Coin 2 : " + coin2 + "\t" + "Coin 3 : " + coin3);
            
            System.out.println(state1 + " " + state2 + " " + state3);
            
            if (coin1 == state1) {
                count1++;
            } else {
                count1 = 0;
                state1 = coin1;
            }
            
            if (coin2 == state2) {
                count2++;
            } else {
                count2 = 0;
                state2 = coin2;
            }
            
            if (coin3 == state3) {
                count3++;
            } else {
                count3 = 0;
                state3 = coin3;
            }
            
            System.out.println(count1 + " " + count2 + " " + count3);
        }
        
        if (count1 > count2 && count1 > count3) {
            System.out.println("Coin 1 Wins");
        } else if (count2 > count1 && count2 > count3) {
            System.out.println("Coin 2 Wins");
        } else if (count3 > count1 && count3 > count2) {
            System.out.println("Coin 3 Wins");
        } else {
            System.out.println("Tie");
        }
    }
}
