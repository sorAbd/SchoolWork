/**
 * Module A02: Analysis of Algorithms
 * Section 1 : Measure Execution Time
 * Task 1a : Build and Test a Stop
 */
package alg.analysis;

import java.util.Date;

/**
 * Test the {@link Stopwatch} class with a predefined operation.
 * 
 * @author Soroush Abdollahi
 * @version 1
 */
public class TestStopwatch {
	
	/**
	 * Test the stopwatch with computing the sum of the first 1 billion integers as a double
	 * @param args - not used
	 */
	public static void main(String[] args) {
		Stopwatch w = new Stopwatch();
		double sum = 0;
		for (int i=1; i<=2000000000; i++) {
			sum+=i;
		}
		long t = w.elapsedTime();
		//System.out.println("Stop Watch - Task 1 - by Soroush Abdollahi");
		System.out.println("Stop Watch - Task 2 - by Soroush Abdollahi");
		Date date = new Date();
	    System.out.println("Executed on: "+date.toString());
		System.out.println("Computes the sum of the first billion integers as a double.");
		System.out.println("Sum (double) = "+sum);
		System.out.println("Time (mili-s) = "+t);
	}
}
