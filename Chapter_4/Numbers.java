package Chapter_4;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
	int num = 1;
        while (num <= 100) {
	    for (int i = num; i <= num+4; i++) {
		System.out.print(i + "\t");
	    }
	    System.out.println();
	    num+=5;
	}
    }
}