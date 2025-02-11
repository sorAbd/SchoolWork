package PA_C132;

public class testCard {
	public static void main (String[] args) {
		Card c1 = new Card(Suit.HEARTS, Value.TWO);
		Card c2 = new Card(Suit.SPADES, Value.FOUR);
		System.out.println(c1.getSuit());
		System.out.println(c1.getValue());
		System.out.println(c1);
		System.out.println(c1+" is better than "+c2+"? "+c1.isBetter(c2));
	}
}
