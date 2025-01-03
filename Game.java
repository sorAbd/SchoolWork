/**
 * 
 */
package PA_C132;

/**
 * Start the program output with a printed line containing the name of the program and the author (e.g. Hello Java by Mihai Boicu).
 * Create a deck - print it
 * Shuffle the deck - print it
 * Deal a hand - print it
 * Deal a second hand - print it
 * Deal a third hand - print it
 * 
 * @author Soroush Abdollahi
 *
 */
public class Game {

	public static void main(String[] args) {
		System.out.println("Card Game by Soroush Abdollahi");
		DeckOfCards deck = new DeckOfCards();
		System.out.println("Deck: " +deck);
		deck.shuffle();
		System.out.println("Deck: " +deck);
		Hand h1 = deck.dealHand();
		System.out.println("Hand 1: " +h1);
		System.out.println("Deck: " +deck);
		Hand h2 = deck.dealHand();
		System.out.println("Hand 2: " +h2);
		System.out.println("Deck: " +deck);
		Hand h3 = deck.dealHand();
		System.out.println("Hand 3: " +h3);
		System.out.println("Deck: " +deck);
	}
}
