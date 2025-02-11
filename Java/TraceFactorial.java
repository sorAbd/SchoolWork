/**
 * Module 31: Simple recursive methods
 * Guided Activity 3: Trace Recursive Methods
 * Program 1: Trace Factorial
 */
package m31.ga3;

/**
 * Computes the factorial of a number using a recursive method.
 * The factorial of a number n is: n! = 1 x 2 x 3 ... x n.
 * We can also write the formula as: n! = (n-1)! x n
 * 
 * @author Soroush Abdollahi
 *
 */
public class TraceFactorial {

	/**
	 * Compute the factorial of a number n, using a recursive implementation s
	 * @param n - the number for which we compute the factorial (positive integer)
	 * return - a long with the computed result if possible
	 */
	public static long factorial(int n) {
		if (n==1)return 1; // end condition
		return factorial(n-1)*n; // recursive formula or call
	}
	
	/**
	 * Trace the recursive method to compute the factorial of number n, using recursive implementation
	 * @param n - the number for which we compute the factorial (positive integer)
	 * @return - a long with the computed result if possible
	 */
	public static long factorialTrace(String space, int n) {
		System.out.printf("%sCompute factorial(%d)\n", space, n);
		if (n==1) {
			System.out.printf("%sreturn factorial(1)=1\n", space);
			return 1; // end condition
		}
		long f = factorialTrace(space+ "| ",n-1)*n;
		System.out.printf("%sreturn factorial(%d)=%d*%d=%d\n",space,n,f,n,f*n);
		return factorial(n-1)*n; // recursive formula or call
	}
	
	/**
	 * Main method testing the factorial defined for known values:
	 * Examples include: 1!=1; 2!=1; 3!=6; 4!=24; ...
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Factorials by Soroush Abdollahi");
		for(int i=1; i<=10;i++) {
			System.out.printf("%2d!=%20d\n", i, factorialTrace("",i));
		}

	}

}
