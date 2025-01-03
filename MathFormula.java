/**
 * Module 08: For Loops and Formatted Output
 * Activity 2: Compute Mathematical Formulas
 * Program 1: Math formula
 */
package m08a2p1;

import java.util.Scanner;
/**
 * Read a positive integer n from the keyboard
 * Compute the following terms both by addition and applying the formula
 * Sum of numbers: 1 + 2 + 3 + ... + n
 * Sum of numbers formula: n*(n+1)/2
 * In the following ones we mark the power with ^, so 2^3 is 2 power 3 or 2*2*2 = 8
 * Sum of squares: 1^2 + 2^2 + 3^2 + ... + n^2
 * Sum of squares formula: ( 2*(n^3) + 3*(n^2) + n) / 6
 * Sum of cubes: 1^3 + 2^3 + 3^3 + ... + n^3
 * Sum of cubes formula: (n^4 + 2*(n^3) + n^2) / 4
 * Also compute the factorial
 * m! = 1 * 2 * 3 * ... * m as a big integer
 * Print all results
 * 
 * @author Soroush Abdollahi
 *
 */
public class MathFormula {

	/**
	 * Read a positive integer n from the keyboard
	 * Compute the following terms both by addition and applying the formula
	 * Sum of numbers: 1 + 2 + 3 + ... + n
	 * Sum of numbers formula: n*(n+1)/2
	 * In the following ones we mark the power with ^, so 2^3 is 2 power 3 or 2*2*2 = 8
	 * Sum of squares: 1^2 + 2^2 + 3^2 + ... + n^2
	 * Sum of squares formula: ( 2*(n^3) + 3*(n^2) + n) / 6
	 * Sum of cubes: 1^3 + 2^3 + 3^3 + ... + n^3
	 * Sum of cubes formula: (n^4 + 2*(n^3) + n^2) / 4
	 * Also compute the factorial
	 * m! = 1 * 2 * 3 * ... * m as a big integer
	 * Print all results
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Math Formula by Soroush Abdollahi");		
		//read n from keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive numbern n= ");
		int n = scanner.nextInt();
		if (n<1) {
			System.out.println("ERROR: please enter a positive number");
			System.out.print("Enter a positive numbern n= ");
			n = scanner.nextInt();
		}
		//computations
		
		//Sum of numbers: 1 + 2 + 3 + ... + n
		int sum1=0;
		for (int i=1; i<=n; i++) {
			sum1+=i;
		}
		//Sum of numbers formula: n*(n+1)/2
		int sum1Formula = n*(n+1)/2;
		
		//Sum of squares:  1^2 + 2^2 + 3^2 + ... + n^2
		int sum2=0;
		for (int i=1; i<=n; i++) {
			sum2 += i*i;
		}
		//Sum of squares formula: ( 2*(n^3) + 3*(n^2) + n) / 6
		int sum2Formula = (2*n*n*n+3*n*n+n)/6;

		//Sum of cubes:  1^3 + 2^3 + 3^3 + ... + n^3
		int sum3=0;
		for (int i=1; i<=n; i++) {
			sum3 += i*i*i;
		}
		//Sum of cubes formula: (n^4 + 2*(n^3) + n^2) / 4
		int sum3Formula = (n*n*n*n + 2*n*n*n + n*n)/4;
		
		// Factorial m! = 1 * 2 * 3 * ... * n
		long factorial = 1;
		for (int i=1; i<=n; i++) {
			factorial *= i;
		}
		
		//print the results
		System.out.println("Sum of numbers: 1 + 2 + 3 + ... + n = "+ sum1);
		System.out.println("Sum of numbers formula: n*(n+1)/2 = "+ sum1Formula);
		System.out.println("Sum of squares:  1^2 + 2^2 + 3^2 + ... + n^2 = "+ sum2);
		System.out.println("Sum of squares formula: ( 2*(n^3) + 3*(n^2) + n) / 6 = "+ sum2Formula);
		System.out.println("Sum of cubes:  1^3 + 2^3 + 3^3 + ... + n^3 = "+ sum3);
		System.out.println("Sum of cubes formula: (n^4 + 2*(n^3) + n^2) / 4 = "+ sum3Formula);
		System.out.println("Factorial: n! = "+factorial);
		//close scanner
		scanner.close();
	}

}
