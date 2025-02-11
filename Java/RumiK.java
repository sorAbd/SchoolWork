/**
 * Module 12: Tables as linked arrays
 * Guided Activity 1: Representing features with linked arrays
 * Program 1: Rumi-k
 */
package m12a1p2;

/**
 * Create a representation for the tiles in the Rumi-K game
 * Pick a random tile.
 * Represent a new deck of tiles
 * Shuffle and print the deck
 * Deal 4 hands of 14 tiles
 * 
 * @author Soroush Abdollahi
 *
 */
public class RumiK {

	/**
	 * Create a representation for the tiles in the Rumi-K game
	 * Pick a random tile
	 * Represent a new deck of tiles
	 * Shuffle and print the deck
	 * Deal 4 hands of 14 tiles
	 * 
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Rumi-k by Soroush Abdollahi\n");
		// Represent a card (suit, rank, value)
		final String[] COLOR = {"Red", "Blue", "Yellow", "Black"};
		final String[] RANK = {"1", "1", "2", "2", "3", "3", "4", "4", "5", "5", "6", "6", "7", "7", "8", "8",
				"9", "9", "10", "10", "11", "11", "12", "12", "13", "13"};
		final int[] RANK_VALUE = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9,
				10, 10, 11, 11, 12, 12, 13, 13};
		int tile1Color = 2;
		int tile1Rank = 10;
		System.out.printf("The tile %s of %s has the value of %d.\n\n", RANK[tile1Color], COLOR[tile1Color], RANK_VALUE[tile1Rank]);
		
		// Pick a random card
		int tile2Color = (int)(Math.random()*4);
		int tile2Rank = (int)(Math.random()*28);
		System.out.printf("The random tile is: %s of %s has the value of %d.\n\n",
				RANK[tile2Rank], COLOR[tile2Color], RANK_VALUE[tile2Rank]);
		
		// Represent a deck of cards with linked arrays.
		int[] deckColor = new int[104];
		int[] deckRank = new int[104];
		// Create a new deck
		for (int s=0; s<4; s++) {
			for (int r=0; r<26; r++) {
				int i=s*26+r;
				deckColor[i] =s;
				deckRank[i] =r;
			}
		}
		
		// Shuffle it
		for (int k=1; k<=500; k++) {
			int i = (int)(Math.random()*104);
			int j = (int)(Math.random()*104);
			int temp = deckColor[i];
			deckColor[i] = deckColor[j];
			deckColor[j] = temp;
			temp = deckRank[i];
			deckRank[i] = deckRank[j];
			deckRank[j] = temp;
		}
		
		// Print it
		System.out.print("The deck is:");
		for (int k=0; k<104; k++) {
			System.out.printf("%s of %s; ", RANK[deckRank[k]], COLOR[deckColor[k]]);
		}
		System.out.println();
		System.out.println();
		
		// Deal 5 cards to four players
		int currentDeckTile = 0;
		for (int player=1; player<=4; player++) {
			System.out.printf("Player %d: ", player);
			for (int tile=1; tile<=14; tile++) {
				System.out.printf("%s of %s; ", RANK[deckRank[currentDeckTile]], COLOR[deckColor[currentDeckTile]]);
				currentDeckTile++;
			}
			System.out.println();
		}
	}

}
