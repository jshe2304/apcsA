package Chapter6;

import java.util.*;

public class Alarm {
    public static void Alarm (int num) {
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.println("Alarm!");
            }
        } else {
            System.out.println("Error!");
        }
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times to alarm");
        int num = scan.nextInt();
        Alarm(num);
    }
}

/*
Enter the number of times to alarm
-1
Error!
*/

/*
Enter the number of times to alarm
5
Alarm!
Alarm!
Alarm!
Alarm!
Alarm!
*/