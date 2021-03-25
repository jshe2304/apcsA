package Chapter_4;

import java.util.*;
public class SlotMachines{
    public static void main(String[] args){

        final int NUMBERS = 10;
        int num1, num2, num3;
        String play;
        Random rand = new Random();
        Scanner scan = new Scanner (System.in);

        System.out.println("Would you like to play (y/n)?");
        play = scan.next();
        while(play.equalsIgnoreCase("y")){
            num1 = rand.nextInt(NUMBERS);
            num2 = rand.nextInt(NUMBERS);
            num3 = rand.nextInt(NUMBERS);
            System.out.println(num1 + "\t" + num2 + "\t" + num3);
            if((num1 == num2) && (num2 == num3))
            {
                System.out.println("Jackpot!!!");
            }
            else if((num1 == num2) || (num1 == num3) || (num2 == num3)){
                System.out.println("Two matches!!");
            }else{
                System.out.println("No match. Play again?");
            }
            System.out.println("Would you like to play (y/n)?");
            play = scan.next();
        }
    }
}