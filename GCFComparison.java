/**
 * Module 31: Simple recursive methods
 * Guided Activity 2: Compare Recursive and iterative implementations
 * Program 1: Greatest common factor comparison
 */
package m31.ga2;

/**
 * Computes the greatest common factor of two numbers using a recursive method.
 * @author Soroush Abdollahi
 *
 */
public class GCFComparison {

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
	 * Compute the GCF between numbers n and m, using an iterative implementation
	 * @param n - the number for which we compute a GCF (positive integer)
	 * @param m - the number for which we compute a GCF (positive integer)
	 * return - an int with the computed result if possible
	 */
	public static int GCFIterative (int n, int m) {
        int result = 0;
        int min = Math.min(n,m);
		for (int i=min; i>0; i--) {
		if (m%i == 0 && n%i == 0){
		  result = i;
		  break;
			}
		}
		return result;
	}
	
	/**
	 * Main method testing the GCF defined for known values:
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Greatest common factor by Soroush Abdollahi");
		System.out.printf("Greatest common factor between %d and %d is: %d = %d", 48, 160, GCFIterative(48,160), GCF(48,160));

	}

}
