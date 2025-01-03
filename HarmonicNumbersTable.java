/**
 * Module 08: For Loops and Formatted Output
 * Activity 2: Compute Mathematical Formulas
 * Program 2: Harmonic Numbers Table
 */
package m08a2p3;

import java.util.Scanner;

/**
 * Read a positive integer n from the keyboard
 * Compute the harmonic number Hk = 1 + 1/2 + 1/3 + ... + 1/k for all k between 1 and n
 * Print the results in a table with header and values aligned.
 * @author Soroush Abdollahi
 *
 */
public class HarmonicNumbersTable {

	/**
	 * Read a positive integer n from the keyboard
	 * Compute the harmonic number Hk = 1 + 1/2 + 1/3 + ... + 1/k for all k between 1 and n
	 * Print the results in a table with header and values aligned.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Harmonic Numbers Table by Soroush Abdollahi");		
		//read n from keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive numbern n = ");
		int n = scanner.nextInt();
		if (n<1) {
			System.out.println("ERROR: please enter a positive number");
			System.out.print("Enter a positive numbern n= ");
			n = scanner.nextInt();
		}
		//compute harmonic numbers
		double sum1=0.0;
		int k = n;
		for (int i=1; i<=k; i++) {
			sum1+=1.0/i;
		}
		//print outcome
		System.out.printf("k |  Harmonic Sum\n");
		System.out.printf("--+---------------\n");
	     System.out.printf("%-5d %-6.10f \n", k, sum1);
		//close scanner
		scanner.close();

	}

}
