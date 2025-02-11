/**
 * Module 08: For Loops and Formatted Output
 * Activity 2: Compute Mathematical Formulas
 * Program 2: Harmonic Numbers
 */
package m08a2p2;

import java.util.Scanner;
/**
 * Read a positive integer n from the keyboard
 * Compute the harmonic number Hn = 1 + 1/2 + 1/3 + ... + 1/n
 * Print the result
 * @author Soroush Abdollahi
 *
 */
public class HarmonicNumbers {

	/**
	 * Read a positive integer n from the keyboard
	 * Compute the harmonic number Hn = 1 + 1/2 + 1/3 + ... + 1/n
	 * Print the result
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Harmonic Numbers by Soroush Abdollahi");		
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
		for (int i=1; i<=n; i++) {
			sum1+=1.0/i;
		}
		//print outcome
		System.out.println("harmonic number Hn = 1 + 1/2 + 1/3 + ... + 1/n = " +sum1);
		//close scanner
		scanner.close();
	}

}