/**
 * Module 06: Conditional statement: if
 * Activity 2: Learning to play
 * Program 1: Computer guess number in 3 turns
 */
package m06a2p1;

import java.util.Scanner;
/**
 * The user picks a random integer from 1 to 10 and
 * The computer will try to guess it in 3 turns.
 * After each turn the user tells the computer if the number is:
 * too big, too small or the same.
 * If the number is guessed the computer win,
 * otherwise the user wins.
 * Print the winning message
 * @author Soroush Abdollahi
 *
 */
public class ComputerGuessNumber {

	/**
	 * The user picks a random integer from 1 to 10 and
	 * The computer will try to guess it in 3 turns.
	 * After each turn the user tells the computer if the number is:
	 * too big, too small or the same.
	 * If the number is guessed the computer win,
	 * otherwise the user wins.
	 * Print the winning message
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Computer Guess Number by Soroush Abdollahi");
		// Print instructions for the user
		System.out.println("Pick a random integer from 1 to 10.");
		System.out.println("I will try to guess it in 3 turns");
		
		//Compute guess 1 for the computer
		int guess1 = 5+ (int)(Math.random()*2);
		
		//Print guess 1, ask for feedback from user
		System.out.println("Guess 1: " + guess1);
		System.out.println("How is my number?");
		System.out.print("answer with s/small, b/big, e/equal:");
		Scanner scanner = new Scanner(System.in);
		String feedback1 = scanner.nextLine();
		
		//If the number is guess the computer wins
		if (feedback1.equals("e") || feedback1.equals("equal")) {
			System.out.println("I won!");
			scanner.close();
			return;
		}
		
		//Compute guess 2 for the computer
		int guess2; // computer second guess
		int min; //minimum number that I can guess
		int max; //maximum number that I can guess
		if (feedback1.equals("s") || feedback1.equals("small")) {
			min = guess1+1;
			max = 10;
		} else if (feedback1.equals("b") || feedback1.equals("big")) {
			min = 1;
			max = guess1 - 1;
			
		} else {
			System.out.println("I won! You did not answer correctly");
			scanner.close();
			return;
		}
		if ((max-min+1)%2==1) { //I have an odd number of integers between min and max
			guess2 = (min+max) / 2;
		} else {
			guess2 = (min+max) / 2 + (int)(Math.random()*2);
		}
		//Print guess 2, ask for feedback from user
		System.out.println("Guess 2: " + guess2);
		System.out.println("How is my number?");
		System.out.print("answer with s/small, b/big, e/equal:");
		String feedback2 = scanner.nextLine();
		//If the number is guess the computer wins
		if (feedback2.equals("e") || feedback2.equals("equal")) {
			System.out.println("I won!");
			scanner.close();
			return;
		}
		// compute guess 3
		
		if (feedback2.equals("s") || feedback2.equals("small")) {
			min = guess2 + 1;
		} else if (feedback2.equals("b") || feedback2.equals("big")) {
			max = guess2 - 1;
			
		} else {
			System.out.println("I won! You did not answer correctly");
			scanner.close();
			return;
		}
		int guess3; //computer third guess
		guess3 = min + (int)(Math.random()*(max-min+1));
		//Print guess 3, ask for feedback from the user
		System.out.println("Guess 3: " + guess3);
		System.out.println("How is my number?");
		System.out.print("answer with s/small, b/big, e/equal:");
		String feedback3 = scanner.nextLine();
		//If the number is guessed, computer wins
		if (feedback3.equals("e") || feedback3.equals("equal")) {
			System.out.println("I won!");
			scanner.close();
			return;
		}
		//otherwise the computer wins
		System.out.println("You, won! I did not guess the number.");
		scanner.close();
	}// end main

}// end ComputerGuessNumber
