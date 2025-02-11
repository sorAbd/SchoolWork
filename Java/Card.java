/**
 * 
 */
package PA_C132;

/**
 * Create a card class that will keep the suit and value of the card. It is an immutable class, 
 * not allowing its values to change. Two fields, one for suit and one for value of the above enum types. 
 * They must be private and final. One constructor specifying the suit and value
 * Getters for each field 
 * A toString method that will return the card in the format: SHORT_NAME_FOR_VALUE SHORT_NAME_FOR_SUIT,
 * e.g. As is an ace of spades. 2d is a two of diamonds.
 *  
 * @author Soroush Abdollahi
 *
 */
public class Card {
	
	private final Suit suit;
	private final Value value;
	
	// Card constructor
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	// Getter methods
	public Suit getSuit() {
		return suit;
	}
	
	public Value getValue() {
		return value;
	}
	
	public String toString() {
		return value.shortName + suit.shortName;
	}
	
	/**
	 * Create a method isBetter that will compare the current card with another provided card 
	 * and return true if it is better (two identical cards are not better). 
	 * A card is better if the rank of the suit is better. 
	 * If they have the suit, than the rank of the value. The best rank is 1.
	 */
	public boolean isBetter(Card other) {
		if(this.suit.rank<other.suit.rank) return true;
		if(this.suit.rank>other.suit.rank) return false;
		//same suits
		return (this.value.rank < other.value.rank);
	}
}
