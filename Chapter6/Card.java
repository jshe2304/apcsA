package Chapter6;

import java.util.*;

public class Card {
    
    String faceName, suitName;
    
    Random generator = new Random();
    int face = generator.nextInt(13) + 1;
    int suit = generator.nextInt(4) + 1;

    public Card () {
        setFace();
        setSuit();
    }
    
    public void setFace() {
        if (face == 1) {
            faceName = "Ace";
        } else if (face == 2) {
            faceName = "Two";
        } else if (face == 3) {
            faceName = "Three";
        } else if (face == 4) {
            faceName = "Four";
        } else if (face == 5) {
            faceName = "Five";
        } else if (face == 6) {
            faceName = "Six";
        } else if (face == 7) {
            faceName = "Seven";
        } else if (face == 8) {
            faceName = "Eight";
        } else if (face == 9) {
            faceName = "Nine";
        } else if (face == 10) {
            faceName = "Ten";
        } else if (face == 11) {
            faceName = "Jack";
        } else if (face == 12) {
            faceName = "Queen";
        } else if (face == 13) {
            faceName = "King";
        }
    }
    
    public void setSuit() {
        if (suit == 1) {
            suitName = "Clubs";
        } else if (suit == 2) {
            suitName = "Diamonds";
        } else if (suit == 3) {
            suitName = "Hearts";
        } else if (suit == 4) {
            suitName = "Spades";
        }
    }

    public String toString() {
        return faceName + " of " + suitName;
    }
}

/*
public class CardDriver {
    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            Card card = new Card();
            System.out.println(card);
        }
    }
}

Two of Spades
Five of Diamonds
Eight of Spades
Queen of Diamonds
Jack of Clubs
Two of Diamonds
Two of Spades
Six of Spades
Ace of Spades
Ace of Spades
Six of Spades
Six of Clubs
King of Clubs
*/
