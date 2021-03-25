package Chapter10;

import java.util.*;

public class DiceArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input number of rows:");
        int rows = scan.nextInt();
        
        System.out.println("Input number of columns:");
        int columns = scan.nextInt();
        
        System.out.println("Input number of sides on the dice:");
        int sides = scan.nextInt();
        
        int[][] diceArray = new int[rows][columns];
        Die dice = new Die(sides);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                diceArray[i][j] = dice.roll();
            }
        }
        
        for (int[] i : diceArray) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println("\n\n");
        } 
    }
}
