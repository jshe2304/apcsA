package Chapter10;

public class SquareDriver {
   public static void main(String[] args) {
       Square square1 = new Square(3);
       square1.readSquare();
       
       System.out.println("--------------------");
       
       square1.printSquare();
       
       System.out.println("--------------------");
       
       if (square1.magic()) {
           System.out.println("Magic!\nSum: " + square1.sumRow(0));
       } else {
           System.out.println("Not Magic");
       }
   }
}

/*
Row 0, Column 0:
4
Row 0, Column 1:
9
Row 0, Column 2:
2
Row 1, Column 0:
3
Row 1, Column 1:
5
Row 1, Column 2:
7
Row 2, Column 0:
8
Row 2, Column 1:
1
Row 2, Column 2:
6
--------------------
Number Square:
4	9	2	
3	5	7	
8	1	6	
--------------------
Magic!
Sum: 15
*/