/**
 * 
 */
package PA_C132;

/**
 * Create an enum type for the values keeping
 * a short name, a long name and a rank, 
 * like (2, 2, 13), (3, 3, 12), ...(10, 10, 5), (J, jack, 4), (Q, queen, 3), (K, king, 2), (A, ace, 1)
 * 
 * @author Soroush Abdollahi
 *
 */
public enum Value {
	
    TWO("2", "two", 13),
    THREE("3", "three", 12),
    FOUR("4", "four", 11),
    FIVE("5", "five", 10),
    SIX("6", "six", 9),
    SEVEN("7", "seven", 8),
    EIGHT("8", "eight", 7),
    NINE("9", "nine", 6),
    TEN("10", "ten", 5),
    JACK("J", "jack", 4),
    QUEEN("Q", "queen", 3),
    KING("K", "king", 2),
    ACE("A", "ace", 1);
	
	public final String longName;
	public final String shortName;
	public final int rank;
	
	// constructors
    Value(String shortName, String longName, int rank) {
        this.shortName = shortName;
        this.longName = longName;
        this.rank = rank;
    }
    
    // getter methods
	public String toString() {
		return "("+longName+", "+shortName+", "+ rank+")";
	}
    
    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public int getRank() {
        return rank;
    }
}
