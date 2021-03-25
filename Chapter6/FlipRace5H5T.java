package Chapter6;

public class FlipRace5H5T {
    public static void main(String[] args) {
        final int goal1 = 5, goal2 = 5;
        int count1h = 0, count2h = 0, count3h = 0;
        int count1t = 0, count2t = 0, count3t = 0;
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        Coin coin3 = new Coin();
        
        while (count1t < goal2 && count2t < goal2 && count3t < goal2) {
            coin1.flip();
            coin2.flip();
            coin3.flip();
            
            System.out.print("Coin 1 : " + coin1 + "\t");
            System.out.print("Coin 2 : " + coin2 + "\t");
            System.out.println("Coin 3 : " + coin3);
            
            if (count1h < goal1) {
                if (coin1.isHeads()) {
                    count1h ++;
                } else {
                    count1h = 0;
                }
            } else {
                if (coin1.isTails()) {
                    count1t++;
                } else {
                    count1h = 0;
                    count1t = 0;
                }
            }
            
            if (count2h < goal1) {
                if (coin2.isHeads()) {
                    count2h ++;
                } else {
                    count2h = 0;
                }
            } else {
                if (coin2.isTails()) {
                    count2t++;
                } else {
                    count2h = 0;
                    count2t = 0;
                }
            }
            
            if (count3h < goal1) {
                if (coin3.isHeads()) {
                    count3h ++;
                } else {
                    count3h = 0;
                }
            } else {
                if (coin3.isTails()) {
                    count3t++;
                } else {
                    count3h = 0;
                    count3t = 0;
                }
            }
        }
        
        if (count1t == goal2) {
            System.out.println("Coin 1 Won");
        } else if (count2t == goal2) {
            System.out.println("Coin 2 Won");
        } else if (count3t == goal2) {
            System.out.println("Coin 3 Won");
        } else {
            System.out.println("Tie");
        }
        
    }
}
