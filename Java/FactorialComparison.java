/**
 * Module 31: Simple recursive methods
 * Guided Activity 2: Compare Recursive and iterative implementations
 * Program 1: Factorial Comparison
 */
package m31.ga2;

/**
 * Computes the factorial of a number using both a recursive method
 * and an interative method and discusses the differences.
 * The factorial of a number n is: n! = 1 x 2 x 3 ... x n.
 * We can also write the formula as: n! = (n-1)! x n
 * 
 * @author Soroush Abdollahi
 *
 */
public class FactorialComparison {

	/**
	 * Compute the factorial of a number n, using a recursive implementation
	 * @param n - the number for which we compute the factorial (positive integer)
	 * return - a long with the computed result if possible
	 */
	public static long factorial(int n) {
		if (n==1)return 1; // end condition
		return factorial(n-1)*n; // recursive formula or call
	}
	
	/**
	 * Compute the factorial of a number n, using an iterative implementation
	 * @param n - the number for which we compute the factorial (positive integer)
	 * return - a long with the computed result if possible
	 */
	public static long factorialIterative (int n) {
		long result = 1;
		for (int i=2; i<=n; i++) {
			result*=i;
		}
		return result;
	}
	/**
	 * Main method testing the factorial defined for known values:
	 * Examples include: 1!=1; 2!=1; 3!=6; 4!=24; ...
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Factorials Iterative by Soroush Abdollahi");
		for(int i=1; i<=4;i++) {
			System.out.printf("%2d! = %19d = %19d\n", i, factorial(i), factorialIterative(i));
		}
	}

}
