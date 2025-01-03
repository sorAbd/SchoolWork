/**
 * Module 31: Simple recursive methods
 * Guided Activity 1: Recursive math functions
 * Program 1: Greatest common factor
 */
package m31.ga1;

/**
 * Computes the greatest common factor of two numbers using a recursive method.
 * @author Soroush Abdollahi
 *
 */
public class GCF {

	/**
	 * Compute the factorial of a number n, using a recursive implementation s
	 * @param n - the number for which we compute the GCF (positive integer)
	 * @param m - the number for which we compute the GCF (positive integer)
	 * return - a int with the computed result if possible
	 */
	public static int GCF(int n, int m) {
	    if (m != 0) return GCF(m, n % m);
	    else return n;
	}
	
	/**
	 * Main method testing the factorial defined for known values:
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Greatest common factor by Soroush Abdollahi");
		System.out.printf("Greatest common factor between %d and %d is: %d", 48, 160, GCF(48,160));

	}

}
