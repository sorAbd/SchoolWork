/**
 * Module 31: Simple recursive methods
 * Guided Activity 3: Trace Recursive Methods
 * Program 1: Greatest common factor
 */
package m31.ga3;

/**
 * Computes the greatest common factor of two numbers using a recursive method.
 * make a method to trace it.
 * @author Soroush Abdollahi
 *
 */
public class TraceGCF {

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
	 * Trace the recursive method to compute the GCF between n and m, using recursive implementation
	 * @param space - a string that is an empty space
	 * @param n - the number for which we compute the factorial (positive integer)
	 * @param m - the number for which we compute the factorial (positive integer)
	 * @return - a long with the computed result if possible
	 */
    public static int GCFTrace(String space, int n, int m) {
        System.out.printf("%sCompute GCF(%d, %d)\n", space, n, m);
        if (m == 0) {
            System.out.printf("%sReturn GCF(%d, %d) = %d\n", space, n, m, n);
            return n; 
        } else {
            int result = GCFTrace(space + "| ", m, n % m); 
            System.out.printf("%sReturn GCF(%d, %d) = %d\n", space, n, m, result);
            return GCF(m, n % m); 
        }
    }
	
	/**
	 * Main method testing the factorial defined for known values:
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Greatest Common Factor Trace by Soroush Abdollahi");
		System.out.printf("Greatest common factor between %d and %d is: %d", 48, 160, GCFTrace("",48,160));

	}

}
