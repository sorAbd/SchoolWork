/**
 * Module 08: For Loops and Formatted Output
 * Activity 3: Simulations
 * Program 1: Coin Flipper Simulation
 */
package m08a3p3;

import java.util.Scanner;

/**
 * Modify, to show the results from several simulations not only one, in a formatted table.
 * Compute the average over all simulations.
 * @author Soroush Abdollahi
 *
 */
public class GamblersRuin {

	/**
	 * Modify, to show the results from several simulations not only one, in a formatted table.
     * Compute the average over all simulations.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Gramblers Ruin by Soroush Abdollahi");
		//Read input from user
		// read the number of simulations and the number of trials from the keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.print("The number of simulations to run (from 1 to 999): ");
		int simulations = scanner.nextInt();
		while (simulations<1 && simulations> 999) {
			System.out.println("Error: The number of simulations must be between 1 and 999");
			System.out.print("The number of simulations to run: ");
			simulations = scanner.nextInt();
		}
		// gambler's stating bankroll
		int stake  = Integer.parseInt(args[0]);
	    // gambler's desired bankroll
		int goal   = Integer.parseInt(args[1]);
		//number of trials
		int trials = Integer.parseInt(args[2]);    

		// total number of bets made
        int bets = 0;       
        // total number of games won
        int wins = 0;
        //Print a header for result table
        System.out.printf("SIM |  WINS  |  AVG Bets\n");
		System.out.printf("----+--------+----------\n");
        //do simulations
        double sumWinPercent = 0;
		double sumBetPercent = 0;
        for (int s=1; s<=simulations; s++) {
        	// repeat trials times
        	for (int t = 0; t < trials; t++) {
        		// do one gambler's ruin simulation
        		int cash = stake;
        		while (cash > 0 && cash < goal) {
        			bets++;
        			// win $1
        			if (Math.random() < 0.5) cash++;     
        			// lose $1
        			else cash--;    
        		}
        		// did gambler go achieve desired goal?
        		if (cash == goal) wins++;                
        	}
			double avgWinPerc = 100.0 * wins / trials;
			double avgBetPerc = 100.0 * bets / trials;
			
			sumWinPercent += avgWinPerc;
			sumBetPercent += avgBetPerc;
			System.out.printf("%3d |  %6.2f |  %6.2f\n",s, avgWinPerc, avgBetPerc);
        }
        
        // print results
		double totalWinPerc = sumWinPercent / simulations;
		double totalBetPerc = sumBetPercent / simulations;
		System.out.printf("TOT |  %6.2f |  %6.2f\n", totalWinPerc, totalBetPerc);
        System.out.println(wins + " wins of " + trials);
        System.out.println("\nPercent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
        //close scanner
        scanner.close();
    }

}
