package Chapter10;

import java.util.*;

public class Square {
    int[][] square;
    int size;
    
    Scanner scan = new Scanner(System.in);

    public Square(int size) {
        this.size = size;
        square = new int[size][size];
    }

//--------------------------------------

//return the sum of the values in the given row

//--------------------------------------

    public int sumRow(int row) {
        int sum = 0;
        for (int i : square[row]) {
            sum += i;
        }
        return sum;
    }

//--------------------------------------

//return the sum of the values in the given column

//--------------------------------------

    public int sumCol(int col) {
        int sum = 0;
        for (int[] i : square) {
            sum += i[col];
        }
        return sum;
    }

//--------------------------------------

//return the sum of the values in the main diagonal

//--------------------------------------

    public int sumMainDiag() {
        int col = 0;
        int sum = 0;
        for (int[] i : square) {
            sum += i[col];
            col ++;
        }
        return sum;
    }

//--------------------------------------

//return the sum of the values in the other ("reverse") diagonal

//--------------------------------------

    public int sumOtherDiag() {
        int col = size - 1;
        int sum = 0;
        for (int[] i : square) {
            sum += i[col];
            col --;
        }
        return sum;
    }

//--------------------------------------

//return true if the square is magic (all rows, cols, and diags have

//same sum), false otherwise

//--------------------------------------

    public boolean magic() {
        boolean magic = true;
        
        int num = sumRow(0);
        for (int i = 1; i < size; i++) {
            if (sumRow(i) != num) {
                magic = false;
            }
            if (sumCol(i) != num) {
                magic = false;
            }
        }
        if(sumMainDiag() != num || sumOtherDiag() != num) {
            magic = false;
        }
        return magic;
    }

//--------------------------------------

//read info into the square from the standard input.

//--------------------------------------

    public void readSquare() {

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col ++) {
                System.out.println("Row " + row + ", Column " + col + ":");
                square[row][col] = scan.nextInt();
            }
        }
    }

//--------------------------------------
//print the contents of the square, neatly formatted
//--------------------------------------

    public void printSquare() {
        System.out.println("Number Square:");
        
        for (int[] i : square) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}