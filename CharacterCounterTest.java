/**
 * Module 28: Text Processing
 * Guided Activity 1: Character Processing
 * Program 1: Character counter library set
 */
package m28.ga1;

/**
 * Test class for Character counter library
 * 
 * 
 * @author Soroush Abdollahi
 *
 */
public class CharacterCounterTest {

	/**
	 * Simple tests for the character counter library
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Character Counter Test by Soroush Abdollahi");
		String countedSetABC = "ABC";
		int[] counterABC = CharacterCounter.define("abc");
		CharacterCounter.print("\nCounter ABC ", "abc", counterABC);
		CharacterCounter.update(countedSetABC, counterABC, "A asdfsadfasd B asdfasdffdsa C asdfasdfsd");
		CharacterCounter.print("\nCounter ABC ", "abc", counterABC);
		CharacterCounter.update(countedSetABC, counterABC, "A asdfsadfasd B asdfasdffdsa C asdfasdfsd");
		CharacterCounter.print("\nCounter ABC ", "abc", counterABC);
		CharacterCounter.update(countedSetABC, counterABC, "AAAAABBBCCCBBBAABCBBAA");
		CharacterCounter.print("\nCounter ABC ", "abc", counterABC);

	}

}
