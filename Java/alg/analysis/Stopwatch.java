/**
 * Module A02: Analysis of Algorithms
 * Section 1 : Measure Execution Time
 * Task 1a : Build and Test a Stopwatch
 */
package alg.analysis;

/**
 * Simulates a stopwatch to compute the execution time
 * 
 * @author Soroush Abdollahi
 * @version 1
 */
public class Stopwatch {
	
	/**
	 * Saves the time when the watch is started (or restarted)
	 */
	private long startTime;
	
	/**
	 * Creates and starts a stop watch
	 */
	public Stopwatch() {
		startWatch();
	}
	
	/**
	 * Starts or restarts the stopwatch
	 */
	public void startWatch() {
		startTime = System.currentTimeMillis();
	}
	
	/**
	 * Compute and return the elapse time from the last start or restart.
	 * @return the elapse time as a {@code long}
	 */
	public long elapsedTime() {
		return System.currentTimeMillis() - startTime;
	}
}
