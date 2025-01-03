/**
 * Module 13: Boolean arrays
 * Guided Activity 1: Representing the existence of objects with markers
 * Program 2: Rare Card Simulation
 */
package m13ga1p2;

import java.util.Scanner;

/**
 * A cereal producer puts in each box of cereals a collector card
 * with player form your favorite sport
 * We would like to know which is the average number of boxes that we need to buy
 * in order to get all the cards
 * To compute the number we will run simulations that will randomly pick a card
 * The user will provide the number of players in the promotion
 * and how many simulations we want to run
 * ONE OF THE CARDS IS TWICE AS RARE (TWICE AS HARD) TO FIND
 * We want to compute and print some statistics related to the performed simulations:
 * - average number of boxes bought
 * - minimum number of boxes bought
 * - maximum number of boxes bought
 * @author Soroush Abdollahi
 *
 */
public class RareCards {

	/**
	 * A cereal producer puts in each box of cereals a collector card
	 * with player form your favorite sport
	 * We would like to know which is the average number of boxes that we need to buy
	 * in order to get all the cards
	 * To compute the number we will run simulations that will randomly pick a card
	 * The user will provide the number of players in the promotion
	 * and how many simulations we want to run
	 * ONE OF THE CARDS IS TWICE AS RARE (TWICE AS HARD) TO FIND
	 * We want to compute and print some statistics related to the performed simulations:
	 * - average number of boxes bought
	 * - minimum number of boxes bought
	 * - maximum number of boxes bought
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Rare Card Simulation by Soroush Abdollahi");
		// Read the number of players in the promotion
		Scanner scanner= new Scanner(System.in);
		int numberOfPlayers;
		boolean error;
		do {
			System.out.print("Number of players: ");
			numberOfPlayers = scanner.nextInt();
			error = numberOfPlayers<2;
			if (error) {
				System.out.println("Please provide a whole number greater than 1");
			}
		} while(error);
		// Read the number of simulations
		int numberOfSimulations;
		do {
			System.out.print("Number of simulations: ");
			numberOfSimulations = scanner.nextInt();
			error = numberOfSimulations<1;
			if (error) {
				System.out.println("Please provide a whole number at least 1");
			}
		} while(error);

		// Define array for the results of simulations
		int[] numberOfBoxes = new int[numberOfSimulations];
		
		// For each simulation, run the simulation and store the results
		for (int s=1; s<=numberOfSimulations; s++) {
			// run the simulation s
			
			// initialize the marker that keeps what cards I already bought
			boolean[] bought = new boolean[numberOfPlayers];
			//no card bought
			for (int c=0; c<numberOfPlayers; c++) bought[c]=false;
			int numberOfDifferentCards=0;
			int boxNumber=0;
			
			do {
				boxNumber++;
				int cardNumber = (int)(Math.random()*(numberOfPlayers-1));
				if (!bought[cardNumber]) {
					numberOfDifferentCards++;
					bought[cardNumber] = true;
				}
				
			}while(numberOfDifferentCards<numberOfPlayers-1);
			
			do {
				boxNumber++;
				int cardNumberRare = (int)(Math.random()*(numberOfPlayers*2));
				if (cardNumberRare == numberOfPlayers-1) {
					numberOfDifferentCards++;
					bought[numberOfPlayers-1] = true;
				}
			}while(numberOfDifferentCards<numberOfPlayers);
			
			System.out.printf("Simulation %5d needs %4d boxes\n", s, boxNumber);
			numberOfBoxes[s-1]=boxNumber;
		}
		
		// Process the result to compute average, minimum, and maximum
		int sum = numberOfBoxes[0];
		int minimum = numberOfBoxes[0];
		int maximum = numberOfBoxes[0];
		for (int s=1; s <numberOfSimulations; s++) {
			sum += numberOfBoxes[s];
			if (numberOfBoxes[s] < minimum) minimum = numberOfBoxes[s];
			else if (numberOfBoxes[s] > maximum) maximum = numberOfBoxes[s];
		}
		double average = 1.0 * sum/ numberOfSimulations;
		// Print the results
		System.out.println("Average number of boxes: "+ average);
		System.out.println("Minimum number of boxes: "+ minimum);
		System.out.println("Maximum number of boxes: "+ maximum);

	}

}
