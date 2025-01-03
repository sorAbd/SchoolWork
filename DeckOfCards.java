/**
 * Module 12: Tables as linked arrays
 * Guided Activity 1: Representing features with linked arrays
 * Program 1: Deck of Cards
 */
package m12.ga1;

/**
 * Represent a card (suit, rank, value). Pick a random card.
 * Represent a deck of cards with linked arrays.
 * Create a new deck. Shuffle it. Print it.
 * Deal 5 cards to four players.
 * 
 * @author Soroush Abdollahi
 *
 */
public class DeckOfCards {

	/**
	 * Represent a card (suit, rank, value). Pick a random card.
	 * Represent a deck of cards with linked arrays.
	 * Create a new deck. Shuffle it. Print it.
	 * Deal 5 cards to four players.
	 * 
	 * @param args - not user
	 */
	public static void main(String[] args) {
		System.out.println("Deck of Cards by Soroush Abdollahi");
		// Represent a card (suit, rank, value)
		final String[] SUIT = {"Clubs", "Diamonds", "Hearts", "Spades"};
		final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};
		final int[] RANK_VALUE = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 11};
		int card1Suit = 2;
		int card1Rank = 10;
		System.out.printf("The card %s of %s has the value of %d.\n", RANK[card1Rank], SUIT[card1Suit], RANK_VALUE[card1Rank]);
		
		// Pick a random card
		int card2Suit = (int)(Math.random()*4);
		int card2Rank = (int)(Math.random()*13);
		System.out.printf("The random card is: %s of %s has the value of %d.\n",
				RANK[card2Rank], SUIT[card2Suit], RANK_VALUE[card2Rank]);
		
		// Represent a deck of cards with linked arrays.
		int[] deckSuit = new int[52];
		int[] deckRank = new int[52];
		// Create a new deck
		for (int s=0; s<4; s++) {
			for (int r=0; r<13; r++) {
				int i=s*13+r;
				deckSuit[i] =s;
				deckRank[i] =r;
			}
		}
		
		// Shuffle it
		for (int k=1; k<=500; k++) {
			int i = (int)(Math.random()*52);
			int j = (int)(Math.random()*52);
			int temp = deckSuit[i];
			deckSuit[i] = deckSuit[j];
			deckSuit[j] = temp;
			temp = deckRank[i];
			deckRank[i] = deckRank[j];
			deckRank[j] = temp;
		}
		
		// Print it
		System.out.print("The deck is:");
		for (int k=0; k<52; k++) {
			System.out.printf("%s of %s; ", RANK[deckRank[k]], SUIT[deckSuit[k]]);
		}
		System.out.println();
		
		// Deal 5 cards to four players
		int currentDeckCard = 0;
		for (int player=1; player<=4; player++) {
			System.out.printf("Player %d: ", player);
			for (int card=1; card<=5; card++) {
				System.out.printf("%s of %s; ", RANK[deckRank[currentDeckCard]], SUIT[deckSuit[currentDeckCard]]);
				currentDeckCard++;
			}
			System.out.println();
		}
	}

}
