/**
 * Module 08: For Loops and Formatted Output
 * Activity 3: Simulations
 * Program 1: Coin Flipper Simulation
 */
package m08a3p2;

import java.util.Scanner;

/**
 * Repeats a simulation several times to check if a coin flipper is fair
 * Inputs the number of simulations and the number of trails per simulation from keyboard
 * For each simulation, flip the coin for each trial and record how many times was head and how many times was tail
 * Compute the percentages for heads and tails
 * Create a table with the results and provide an average of all the simulation
 * @author Soroush Abdollahi
 *
 */
public class DiceRollerSimulation {

	/**
	 * Repeats a simulation several times to check if a coin flipper is fair
	 * Inputs the number of simulations and the number of trails per simulation from keyboard
	 * For each simulation, flip the coin for each trial and record how many times was head and how many times was tail
	 * Compute the percentages for heads and tails
	 * Create a table with the results and provide an average of all the simulation
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Dice Roller Simulation by Soroush Abdollahi");
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
		double sumOnePercent = 0;
		double sumTwoPercent = 0;
		double sumThreePercent = 0;
		double sumFourPercent = 0;
		double sumFivePercent = 0;
		double sumSixPercent = 0;
		//Print a header for result table
		System.out.printf("SIM |  ONE    |  TWO    |  THREE    |  FOUR    |  FIVE    |  SIX\n");
		System.out.printf("----+---------+---------+-----------+----------+----------+--------\n");
		//For each simulation
		for (int s=1; s<=simulations; s++) {
			//compute each statistic
			int sumOne = 0;
			int sumTwo = 0;
			int sumThree = 0;
			int sumFour = 0;
			int sumFive = 0;
			int sumSix = 0;
			for (int t=1; t<=trials; t++) {
				// perform the trial
				int dieRoll = (int) (1+ Math.random() *6);
				boolean isOne = dieRoll == 1;
				boolean isTwo = dieRoll == 2;
				boolean isThree = dieRoll == 3;
				boolean isFour = dieRoll == 4;
				boolean isFive = dieRoll == 5;
				boolean isSix = dieRoll == 6;
				
				if (isOne) sumOne++;
				else if (isTwo) sumTwo++;
				else if (isThree) sumThree++;
				else if (isFour) sumFour++;
				else if (isFive) sumFive++;
				else if (isSix) sumSix++;
			}
			double avgOnePerc = 100.0 * sumOne / trials;
			double avgTwoPerc = 100.0 * sumTwo / trials;
			double avgThreePerc = 100.0 * sumThree / trials;
			double avgFourPerc = 100.0 * sumFour / trials;
			double avgFivePerc = 100.0 * sumFive / trials;
			double avgSixPerc = 100.0 * sumSix / trials;
			
			sumOnePercent += avgOnePerc;
			sumTwoPercent += avgTwoPerc;
			sumThreePercent += avgThreePerc;
			sumFourPercent += avgFourPerc;
			sumFivePercent += avgFivePerc;
			sumSixPercent += avgSixPerc;
			//print the statistic
			System.out.printf("%3d |  %6.2f |  %6.2f |  %6.2f   |  %6.2f  |  %6.2f  |  %6.2f\n", s, avgOnePerc, avgOnePerc, avgThreePerc, avgFourPerc, avgFivePerc, avgSixPerc);
		}
		//compute and print the average result of all simulations
		double totalOnePerc = sumOnePercent / simulations;
		double totalTwoPerc = sumTwoPercent / simulations;
		double totalThreePerc = sumThreePercent / simulations;
		double totalFourPerc = sumFourPercent / simulations;
		double totalFivePerc = sumFivePercent / simulations;
		double totalSixPerc = sumSixPercent / simulations;
		System.out.printf("TOT |  %6.2f |  %6.2f |  %6.2f   |  %6.2f  |  %6.2f  |  %6.2f\n", totalOnePerc, totalTwoPerc, totalThreePerc, totalFourPerc, totalFivePerc, totalSixPerc);
		//close the resources
		scanner.close();


	}

}
