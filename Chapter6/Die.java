package Chapter6;

import java.util.Random;

public class Die {
    private final int MIN_FACES = 6;

    private static Random generator = new Random();
    private int numFaces; // number of sides on the die
    private int faceValue; // current value showing on the die


    public Die () {
        numFaces = 6;
        faceValue = 1;
    }

//-----------------------------------------------------------------
// Explicitly sets the size of the die. Defaults to a size of
// six if the parameter is invalid. Initial face value is 1.
//-----------------------------------------------------------------
    public Die (int faces) {
        if (faces < MIN_FACES) {
            numFaces = 6;
        } else {
            numFaces = faces;
        }
        faceValue = 1;
    }

//-----------------------------------------------------------------
// Rolls the die and returns the result.
//-----------------------------------------------------------------
    public int roll () {
        faceValue = generator.nextInt(numFaces) + 1;
        return faceValue;
    }

//-----------------------------------------------------------------
// Returns the current die value.
//-----------------------------------------------------------------
    public int getFaceValue () {
        return faceValue;
    }
}