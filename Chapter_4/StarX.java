package Chapter_4;

public class StarX {

    public static void main (String[] args) {
        int row,col;
        for( row = 0; row < 10; row++)
        {
            for( col = 0; col < 10; col++)
            {
                if((row == col) || (row +col==9 ))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}