/**
 * Module 28: Text Processing
 * Guided Activity 1: Character Processing
 * Program 1: Character counter library
 */
package m28.ga1;

/**
 * Library with utilities to define and use a character counter in a text
 * 
 * @author Soroush Abdollahi
 *
 */
public class CharacterCounter {
	
	/**
	 * Define the counter for characters provided in an input set
	 * Example:
	 * defineCounter("abc") return a counter: int[3] {0, 0, 0} with
	 * counter[0] counting how man times "a" appears, count[1] counting for "b"s and
	 * and count[2] for "c"
	 * @param CountedSet - a String with the characters that will be counted (set)
	 * @return - a counter for the characters (array of integers - index linked with counted set)
	 */
	public static int[] define(String countedSet) {
		int[] counter = new int[countedSet.length()];
		for (int i=0; i<countedSet.length();i++) {
			counter[i] = 0;
		}
		return counter;
	}
	
	/**
	 * Print the counter
	 * @param header - String to start the line
	 * @param countedSet - A String with the characters that will be counted (set)
	 * @param counter - The counting of each character in the counted set
	 */
	public static void print(String header, String countedSet, int[] counter) {
		System.out.print(header);
		for (int i=0; i<countedSet.length(); i++) {
			System.out.print("'"+countedSet.charAt(i)+"\'("+counter[i]+"); ");
		}
	}

	
	/**
	 * Update the counter for new text
	 * @param countedSet - the characters that are counted
	 * @param counter - the counting of each character in the counted set
	 * @param text - the text based on which the counter is updated
	 * @return the received counter (updated) - the counter will always be updated
	 */
	public static int[] update(String countedSet, int[] counter, String text) {
		for (int i=0; i<text.length();i++) {
			char ch = text.charAt(i);
			int countedIndex = countedSet.indexOf(ch);
			if (countedIndex>=0) {
				counter[countedIndex]++;
			}
		}
		return counter;
	}

}
