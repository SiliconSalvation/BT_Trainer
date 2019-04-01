import java.util.Random;
/**
 * A Deck represents a standard deck of 52 playing cards
 * @author Nick Stauffer
 * @author kazuma2448@protonmail.com
 */
public class Deck {
	Card[] deck;
	/**
	 * Constructor that creates a deck of 52 standard playing cards
	 */
	public Deck() {
		this.deck = new Card[52];
		String spades = "spades";
		String clubs = "clubs";
		String hearts = "hearts";
		String diamonds = "diamonds";
		
		for(int i = 0; i < deck.length; i++) {
			if(i < 13) {
				deck[i] = new Card(i, spades);
			}else if(i > 12 && i < 26) {
				deck[i] = new Card(i % 13, clubs);
			}else if(i > 25 && i < 39) {
				deck[i] = new Card(i % 13, hearts);
			}else {
				deck[i] = new Card(i % 13, diamonds);
			}
		}
	}
	/**
	 * Getter for the array field deck
	 * @return
	 */
	public Card[] getDeck() {
		return this.deck;
	}
	/**
	 * Shuffles the deck of playing cards randomly
	 * @param card A Card object
	 * @param n int value for the number of cards to be shuffled
	 */
	public static void shuffle(Card[] card, int n) {
		Random rand = new Random(); 
        
        for (int i = 0; i < n; i++) 
        { 
            // Random for remaining positions. 
            int r = i + rand.nextInt(52 - i); 
              
             //swapping the elements 
             Card temp = card[r]; 
             card[r] = card[i]; 
             card[i] = temp; 
               
        } 
	}

}
