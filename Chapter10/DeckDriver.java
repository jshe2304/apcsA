package Chapter10;

public class DeckDriver {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.create();
        
        System.out.println(deck);

        deck.shuffle();
        System.out.println(deck);
        System.out.println(deck.deal(20));
        System.out.println(deck);
        System.out.println("Deck Size: " + deck.size());
    }
}

/*
Creating New Deck...

Deck
--------------------
Two of Clubs
Ace of Diamonds
Queen of Hearts
King of Diamonds
King of Diamonds
Five of Clubs
Jack of Clubs
Jack of Clubs
Jack of Hearts
Nine of Hearts
Seven of Clubs
Ten of Clubs
Eight of Clubs
Nine of Diamonds
Four of Spades
Two of Spades
Nine of Hearts
Ten of Clubs
Ten of Clubs
Seven of Clubs
Seven of Spades
Nine of Clubs
King of Hearts
Seven of Diamonds
Four of Spades
Nine of Spades
Seven of Diamonds
Ten of Hearts
Four of Hearts
Queen of Spades
Nine of Spades
Six of Hearts
King of Clubs
Queen of Diamonds
Five of Hearts
Jack of Spades
King of Clubs
King of Clubs
King of Spades
Four of Spades
Two of Clubs
Two of Spades
Two of Diamonds
King of Diamonds
Queen of Spades
Three of Clubs
Six of Spades
Ten of Clubs
Eight of Diamonds
Four of Diamonds
Jack of Spades
Ace of Spades


Deck
--------------------
Queen of Spades
Four of Spades
Ace of Spades
King of Diamonds
Ten of Clubs
Five of Clubs
Ace of Diamonds
Jack of Clubs
Jack of Hearts
Nine of Hearts
Seven of Clubs
Three of Clubs
Eight of Clubs
Nine of Hearts
King of Clubs
Two of Spades
Nine of Hearts
Ten of Clubs
Ace of Diamonds
Seven of Clubs
Ten of Clubs
King of Hearts
King of Hearts
Four of Spades
King of Diamonds
Four of Diamonds
Jack of Hearts
Eight of Clubs
Ten of Clubs
Seven of Spades
Nine of Spades
Six of Hearts
Four of Spades
Queen of Diamonds
Five of Hearts
Eight of Clubs
King of Clubs
King of Hearts
King of Spades
Four of Spades
Jack of Hearts
Jack of Hearts
Ten of Clubs
King of Diamonds
Nine of Clubs
Jack of Hearts
Six of Spades
Ten of Clubs
King of Diamonds
Four of Diamonds
Jack of Hearts
Ace of Spades


Deal
--------------------
Queen of Spades
Ace of Spades
Ten of Clubs
Ace of Diamonds
Jack of Hearts
Seven of Clubs
Eight of Clubs
King of Clubs
Nine of Hearts
Ace of Diamonds
Ten of Clubs
King of Hearts
King of Diamonds
Jack of Hearts
Ten of Clubs
Nine of Spades
Four of Spades
Five of Hearts
King of Clubs
King of Spades


Deck
--------------------
Four of Spades
King of Diamonds
Five of Clubs
Jack of Clubs
Nine of Hearts
Three of Clubs
Nine of Hearts
Two of Spades
Ten of Clubs
Seven of Clubs
King of Hearts
Four of Spades
Four of Diamonds
Eight of Clubs
Seven of Spades
Six of Hearts
Queen of Diamonds
Eight of Clubs
King of Hearts
Four of Spades
Jack of Hearts
Jack of Hearts
Ten of Clubs
King of Diamonds
Nine of Clubs
Jack of Hearts
Six of Spades
Ten of Clubs
King of Diamonds
Four of Diamonds
Jack of Hearts
Ace of Spades

Deck Size: 32
*/