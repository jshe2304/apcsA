package Chapter6;

import java.util.*;

public class multiConcat {
    public static String multiConcat(String str, int count) {
        String result = str;
        
        for (int i = 1; i < count; i++) {
            result += str;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input a string");
        String str = scan.nextLine();

        System.out.println("Input a count");
        int count = scan.nextInt();

        System.out.println(multiConcat(str, count));
    }
}

/*
Input a string
hi
Input a count
0
hi
*/

/*
Input a string
hi
Input a count
5
hihihihihi
*/
