package Chapter10;

import java.util.*;

public class DeckOfCards {
    
    int len = 52;
    ArrayList<Card> deck = new ArrayList<Card>();

    public DeckOfCards() {
        this.len = len;
    }
    
    public void create() {
        System.out.println("Creating New Deck...");
        for (int i = 0; i < len; i++) {
            Card card = new Card();
            deck.add(card);
        }
    }

    public void shuffle() {
        Random gen = new Random();
        
        for(int i = 0; i < len; i++) {
            Card temp = deck.get(i);
            int swap = gen.nextInt(len) - 1;
            deck.set(swap, temp);
            deck.set(i, temp);
        }
    }
    
    public String deal(int num) {
        String result = "\nDeal\n--------------------\n";
        
        if (num <= len) {
            for (int i = 0; i < num; i++) {
                result += deck.get(i) + "\n";
                deck.remove(i);
            }
        }
        
        return result;
    }
    
    public int size() {
        return deck.size();
    }
    
    public String toString() {
        String result = "\nDeck\n--------------------\n";
        for (Card i : deck) {
            result += i + "\n";
        }
        return result;
    }
    

}
