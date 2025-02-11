/**
 * Module 08: For Loops and Formatted Output
 * Activity 1: For Loop, errors and aligned output.
 * Program 2: Power Table
 */
package m08a1p2;

/**
 * @author Soroush Abdollahi
 *
 */
public class PowerTable {

	/**
	 * Read a whole number from 1 to 10 from the command line.
	 * If the number is wrong show them an error and stop the execution.
	 * Create a power table from 1 to 10 for that received number.
	 * Follow the format like in the following example for received number 2:
	 * 2 ^ 1 = 2
	 * 2 ^ 2 = 4
	 * 2 ^ 3 = 8
	 * ...
	 * 2 ^ 20 = 
	 * 
	 * You must observe that the numbers are aligned to the right of each column 
	 * 
	 * @param args - one number from 1 to 10
	 */
	public static void main(String[] args) {
		System.out.println("Power Table by Soroush Abdollahi");
		
		// Read and check the number: n
		int n = Integer.parseInt(args[0]);
		if (n<1 || n>10) {
			System.out.println("ERROR: Please provide a number between 1 and 20");
			return;
		}
		
		//for each m number 1 to 10
		for (int m=1; m<=10; m++) {
			//print the line n ^ m
			System.out.printf("%d ^ %2d = %s\n", n, m, (int)(Math.pow(n,m)));
		}
			
	}

}
