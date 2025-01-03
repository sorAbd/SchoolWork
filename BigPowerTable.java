/**
 * Module 09: Other Loops and Conditionals
 * Activity 1: do-while loop
 * Program 1: Big Power Table
 */
package m09a1p1;

import java.util.Scanner;
/**
 * Read a positive number from the keyboard.
 * Print a formatted table with all the powers of that number that
 * may be computed as an int.
 * @author Soroush Abdollahi
 *
 */
public class BigPowerTable {

	/**
	 * Read a positive number from the keyboard.
	 * Print a formatted table with all the powers of that number that
	 * may be computed as an int.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Big Power Table by Soroush Abdollahi");
		// Read a positive number from the keyboard
		Scanner scanner = new Scanner(System.in);
		boolean error;
		int n;
		do {
			System.out.print("For which number (2 or higher) you want the power table? ");
			n = scanner.nextInt();
			error = n<2;
			if (error) {
				System.out.println("ERROR: Please enter a number 2 or higher. ");
			}
		} while(error);
		// Print the table header
		System.out.println("  POWER   |        VALUE\n");
		System.out.println("----------+-------------------\n");
		
		// For each power, print a row in the table
		int power = 0;
		int value = 1;
		boolean hasNext;
		do {
			System.out.printf("%9d | %10d\n", power, value);
			hasNext = value < Integer.MAX_VALUE / n;
			if (hasNext) {
				power++;
				value *= n;
			}
		} while (hasNext);
		//close resources
		scanner.close();

	}

}
