package PA_C132;

/**
 * Create an enum type for the suits keeping a name,
 * a short name, color and a rank 
 * (clubs, c, black, 4), (diamonds, d, red, 3), (hearts, h, red, 2) and (spades, s, black, 1).
 * Use a boolean for color.
 * 
 * @author Soroush Abdollahi
 *
 */

public enum Suit {
	CLUBS("clubs", "c", false, 4),
	DIAMONDS("diamonds", "d", true, 3),
	HEARTS("hearts", "h", true, 2),
	SPADES("spades", "s", false, 1);
	
	public final String name;
	public final String shortName;
	public final boolean isRed;
	public final int rank;
	
	//constructor
	Suit(String name, String shortName, boolean isRed, int rank) {
		this.name = name;
		this.shortName = shortName;
		this.isRed = isRed;
		this.rank = rank;
	}
	
	public String getColor() {
		if (isRed) return "red";
		return "black";
	}
	
	public String toString() {
		return "("+name+", "+shortName+", "+getColor()+", "+rank+")";
	}
}
