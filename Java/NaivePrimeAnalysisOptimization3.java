/**
 * Module 14: Prime numbers and optimization
 * Guided Activity 1: Naive method for prime numbers
 * Program 1: Naive Prime
 */
package m14ga2p2;

/**
 * Given a number in the command line.
 * compute and print all the prime numbers less or equal with n.
 * 
 * Use a naive method to test for each number k from 2 to n if it is prime
 * The test will consider all numbers from 2 to k-1 and and see if they are divisors of k.
 * If none is, then the number is prime
 * 
 * Make and print an analysis table
 * 
 * Compute the execution time for the entire program. 
 * Make and print an analysis table
 * 
 * @author Soroush Abdollahi
 *
 */
public class NaivePrimeAnalysisOptimization3 {

	/**
	 * Given a number in the command line.
	 * compute and print all the prime numbers less or equal with n.
	 * 
	 * Use a naive method to test for each number k from 2 to n if it is prime
	 * The test will consider all numbers from 2 to k-1 and and see if they are divisors of k.
	 * If none is, then the number is prime
	 * 
	 * Make and print an analysis table
	 * 
	 * Compute the execution time for the entire program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Naive Prime Analysis Optimization 3 by Soroush Abdollahi");
		System.out.printf("INPUT  |  # OF PRIMES  |  EXECUTION TIME\n");
		System.out.printf("-------+---------------+-----------------");
		// Read list of numbers which we compute from the command line
		int[] n = new int[args.length];
		for (int i = 0; i<args.length; i++) {
			n[i] = Integer.parseInt(args[i]);
			if (n[i]<2) {
				System.out.println("ERROR: the number is expected to be 2 or bigger.");
				return;
			}
		}
		// mark the start of the execution 
		for (int z=0; z<n.length;z++) {
			long startTime = System.currentTimeMillis();
		
			// for each number from 2 to n[i] check if it is prime
			int noOfPrimes = 0;
			for (int k=2; k<=n[z];k++) {
				boolean prime = true;
				// for each number from 2 to k-1 check if divides by k
				for (int i=2; i<=Math.sqrt(k); i++) {
					if (k%i==0) {
						prime=false;
						break;
					}
				}
				if (prime) {
					noOfPrimes++;

			}
		}
		// mark the end of the execution 
			long endTime = System.currentTimeMillis();
		
			// compute and print the total time 
			long duration = endTime - startTime;
			System.out.printf("\n%d  |      %d     | %d ms.",n[z], noOfPrimes, duration);
		
		}

	}
}
