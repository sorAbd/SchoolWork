/**
 * Module 31: Simple recursive methods
 * Guided Activity 2: Compare Recursive and iterative implementations
 * Program 2: Harmonic numbers comparison
 */
package m31.ga2;

/**
 * Computes the factorial of a number using a recursive method.
 * The factorial of a number n is:  Hn = 1 + 1/2 + 1/3 + ... + 1/n.
 * We can also write the formula as: Hn = Hn-1 + 1/n.
 * @author Soroush Abdollahi
 *
 */
public class HarmonicComparison {

	/**
	 * Compute the factorial of a number n, using a recursive implementation s
	 * @param n - the number for which we compute the harmonic (positive integer)
	 * return - a long with the computed result if possible
	 */
	public static double harmonic(int n) {
		if (n==1)return 1; // end condition
		return (1.0/n) + harmonic(n-1); // recursive formula or call
	}
	
	/**
	 * Compute the harmonic of a number n, using an iterative implementation
	 * @param n - the number for which we compute the harmonic (positive integer)
	 * return - a double with the computed result if possible
	 */
	public static double harmonicIterative (int n) {
		double result = 1.0;
		for (int i=2; i<=n; i++) {
			result+=(1.0/i);
		}
		return result;
	}
	
	/**
	 * Main method testing the harmonics defined for known values:
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Harmonics by Soroush Abdollahi");
		for(int i=1; i<=10;i++) {
			System.out.printf("H%d = %f6.4 = %f6.4 \n", i, harmonicIterative(i), harmonic(i));
		}

	}

}
