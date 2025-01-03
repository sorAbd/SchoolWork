/**
 * 
 */
package PA_C132;

/**
 * testing the deck
 * @author Soroush Abdollahi
 *
 */
public class TestDeck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);

	}

}
