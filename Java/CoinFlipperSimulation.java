/**
 * Module 08: For Loops and Formatted Output
 * Activity 3: Simulations
 * Program 1: Coin Flipper Simulation
 */
package m08a3p1;

import java.util.Scanner;
/**
 * Repeats a simulation several times to check if a coin flipper is fair
 * Inputs the number of simulations and the number of trails per simulation from keyboard
 * For each simulation, flip the coin for each trial and record how many times was head and how many times was tail
 * Compute the percentages for heads and tails
 * Create a table with the results and provide an average of all the simulation
 * 
 * @author Soroush Abdollahi
 *
 */
public class CoinFlipperSimulation {

	/**
	 * Repeats a simulation several times to check if a coin flipper is fair
	 * Inputs the number of simulations and the number of trails per simulation from keyboard
	 * For each simulation, flip the coin for each trial and record how many times was head and how many times was tail
	 * Compute the percentages for heads and tails
	 * Create a table with the results and provide an average of all the simulation
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Coin Flipper Simulation by Soroush Abdollahi");
		// read the number of simulations and the number of trials from the keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.print("The number of simulations to run (from 1 to 999): ");
		int simulations = scanner.nextInt();
		while (simulations<1 && simulations> 999) {
			System.out.println("Error: The number of simulations must be between 1 and 999");
			System.out.print("The number of simulations to run: ");
			simulations = scanner.nextInt();
		}
		System.out.print("The trials to run in each simulation: ");
		int trials = scanner.nextInt();
		while (trials<1) {
			System.out.println("Error: The number of trials per simulation must be 1 or greater");
			System.out.print("The number of trials to run in each simulation: ");
			trials = scanner.nextInt();
		}
		//prepare the sum of results
		double sumHeadPercent = 0;
		double sumTailPercent = 0;
		//Print a header for result table
		System.out.printf("SIM |  HEADS |  TAILS\n");
		System.out.printf("----+--------+-------\n");
		//For each simulation
		for (int s=1; s<=simulations; s++) {
			//compute each statistic
			int sumHeads = 0;
			int sumTails = 0;
			for (int t=1; t<=trials; t++) {
				// perform the trial
				boolean isHead = Math.random() < 0.5;
				if (isHead) sumHeads++; else sumTails++;
			}
			double avgHeadsPerc = 100.0 * sumHeads / trials;
			double avgTailsPerc = 100.0 * sumTails / trials;
			
			sumHeadPercent += avgHeadsPerc;
			sumTailPercent += avgTailsPerc;
			//print the statistic
			System.out.printf("%3d |  %6.2f |  %6.2f\n", s, avgHeadsPerc, avgTailsPerc);
		}
		//compute and print the average result of all simulations
		double totalHeadsPerc = sumHeadPercent / simulations;
		double totalTailsPerc = sumTailPercent / simulations;
		System.out.printf("TOT | %6.2f  |  %6.2f\n", totalHeadsPerc, totalTailsPerc);
		//close the resources
		scanner.close();

	}

}
