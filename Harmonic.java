/**
 * Module 31: Simple recursive methods
 * Guided Activity 1: Recursive math functions
 * Program 1: Harmonic numbers
 */
package m31.ga1;

/**
 * Computes the factorial of a number using a recursive method.
 * The factorial of a number n is:  Hn = 1 + 1/2 + 1/3 + ... + 1/n.
 * We can also write the formula as: Hn = Hn-1 + 1/n.
 * @author Soroush Abdollahi
 *
 */
public class Harmonic {

	/**
	 * Compute the factorial of a number n, using a recursive implementation s
	 * @param n - the number for which we compute the factorial (positive integer)
	 * return - a long with the computed result if possible
	 */
	public static double harmonic(int n) {
		if (n==1)return 1; // end condition
		return (1.0/n) + harmonic(n-1); // recursive formula or call
	}
	
	/**
	 * Main method testing the factorial defined for known values:
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Harmonics by Soroush Abdollahi");
		for(int i=1; i<=4;i++) {
			System.out.printf("H%d=%f6.4\n", i, harmonic(i));
		}

	}

}
