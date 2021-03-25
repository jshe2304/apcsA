package Chapter6;

import java.util.*;

public class Dice {
    int sides;
    Random gen = new Random();

    public Dice(int sides) {
        if (sides > 1) {
            this.sides = sides;
        } else {
            this.sides = 6;
        }
    }

    public int Roll() {
        return (gen.nextInt(sides));
    }
}