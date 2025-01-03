/**
 * 
 */
package PA_C132;

/**
 * Create a hand class that will keep 5 cards.
 * A constructor creating the hand based on an array of cards received.
 * A toString metthod tthat will print the hand.
 * @author Soroush Abdollahi
 *
 */
public class Hand {
	private Card[] cards;
	
	//Hand constructor
	public Hand(Card c1, Card c2, Card c3, Card c4, Card c5) {
		cards = new Card[5];
		cards[0] = c1;
		cards[1] = c2;
		cards[2] = c3;
		cards[3] = c4;
		cards[4] = c5;
	}
	
	public String toString() {
		String result="";
		for(Card c: cards) {
			result += c+" ";
		}
		return result;
	}
}
