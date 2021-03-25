package Chapter_4;


public class WhileToFor {
    public static void main(String[] args) {
        int num = 1;
        while (num<20) {
            num++;
            System.out.println(num);
        }
        
        for (int i = 2; i <= 20; i++) {
            System.out.println(i);
        }
    }
}