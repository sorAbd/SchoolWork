/**
 * Module 09: Other Loops and Conditionals
 * Activity 1: do-while loop
 * Program 2: Fibonacci Table
 */
package m09a1p2;

/**
 * Create a table with the Fibonacci numbers.
 * @author Soroush Abdollahi
 *
 */
public class FibonacciTable {

	/**
	 *  Create a table with the Fibonacci numbers.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Fibonacci Table by Soroush Abdollahi");

		// print table
		int f0 = 0;
		int f1 = 1;
		int count = 2;
		boolean hasNext;
		System.out.println("F0="+f0);
		System.out.println("F1="+f1);
		do {
			int value = f0+f1;
			System.out.printf("F%-2d = F%-6d + F%-6d = %-10d\n", count, f0,f1,value);
			hasNext = value < Integer.MAX_VALUE-f1;
			if (hasNext) {
				count++;
				f0= f1;
				f1= value;
			}
		} while (hasNext);
	}

}
