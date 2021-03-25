package Chapter6;

public class FlipRace2 {
    public static void main(String[] args) {
        int goal = 5;
        int count1 = 0, count2 = 0, count3 = 0;
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        Coin coin3 = new Coin();
        
        while (count1 < goal && count2 < goal && count3 < goal) {
            coin1.flip();
            coin2.flip();
            coin3.flip();
            
            System.out.println("Coin 1 : " + coin1 + "\t" + "Coin 2 : " + coin2 + "\t" + "Coin 3 : " + coin3);
            
            if (coin1.isTails()) {
                count1++;
            } else {
                count1 = 0;
            }
            
            if (coin2.isTails()) {
                count2++;
            } else {
                count2 = 0;
            }
            
            if (coin3.isTails()) {
                count3++;
            } else {
                count3 = 0;
            }
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
