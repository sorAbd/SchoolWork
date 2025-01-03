/**
 * Program 2: Deck of Cards
 */
package PA_C132;

/**
 * class is to create a deck of cards with 52 cards 
 * there will be Enums and classes used to create this deck of cards
 * @author Soroush Abdollahi
 *
 */
public class DeckOfCards {
	
	private Card[] deck;
	private int numberOfCards;
	
	//constructor
	public DeckOfCards() {
		numberOfCards = 52;
		deck = new Card[numberOfCards];
		int i=0;
		for(Suit suit: Suit.values()) {
			for (Value value: Value.values()) {
				deck[i++] = new Card(suit, value);
			}
		}
	}
	
	//method to shuffle deck
	public void shuffle() {
		for (int i=0; i<52; i++) {
			int i1 = (int)(Math.random()*52);
			int i2 = (int)(Math.random()*52);
			Card temp = deck[i1];
			deck[i1] = deck[i2];
			deck[i2] = temp;
		}
	}
	
	//method to deal cards
	public Card dealCard() {
		if (numberOfCards==0) throw new RuntimeException("Empty deck.");
		return deck[--numberOfCards];
	}
	

	public Hand dealHand() {
		return new Hand(dealCard(),dealCard(),dealCard(),dealCard(),dealCard());
	}
	
	public String toString() {
		String result="";
		for(int i=0; i<numberOfCards; i++) {
			Card c = deck[i];
			result += c+" ";
		}
		return result;
	}
	
}
