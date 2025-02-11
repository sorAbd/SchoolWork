/**
 * Module 08: For Loops and Formatted Output
 * Activity 1: For Loop, errors and aligned output.
 * Program 1: Multiplication Table
 */
package m08a1p1;

/**
 * Read a whole number from 1 to 20 from the command line.
 * If the number is wrong show them an error and stop the execution.
 * Create a multiplication table from 1 to 20 for that received number.
 * Follow the format like in the following example for received number 7:
 * 7 x 1 = 7
 * 7 x 2 = 14
 * 7 x 3 = 21
 * ...
 * 7 x 20 = 140
 * 
 * You must observe that the numbers are aligned to the right of each column
 * 
 * @author Soroush Abdollahi
 *
 */
public class MultiplicationTable {

	/**
	 * Read a whole number from 1 to 20 from the command line.
	 * If the number is wrong show them an error and stop the execution.
	 * Create a multiplication table from 1 to 20 for that received number.
	 * Follow the format like in the following example for received number 7:
	 * 7 x 1 = 7
	 * 7 x 2 = 14
	 * 7 x 3 = 21
	 * ...
	 * 7 x 20 = 140
	 * 
	 * You must observe that the numbers are aligned to the right of each column 
	 * 
	 * @param args - one number from 1 to 20
	 */
	public static void main(String[] args) {
		System.out.println("Multiplication Table by Soroush Abdollahi");
		
		// Read and check the number: n
		int n = Integer.parseInt(args[0]);
		if (n<1 || n>20) {
			System.out.println("ERROR: Please provide a number between 1 and 20");
			return;
		}
		
		//for each m number 1 to 20
		for (int m=1; m<=20; m++) {
			//print the line n x m
			System.out.printf("%d x %2d = %3d\n", n, m, n*m);
		}
			
	}

}
