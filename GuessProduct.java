/**
 * Module 06: Conditional statement: if
 * Activity 1: Branch the execution with if
 * Program 2: Guess product in 3 turns
 */
package m06a1p2;

import java.util.Scanner;

/**
 * The computer picks atwo random integer from 10 to 99
 * The computer adds those two integers together
 * After each turn the computer tells the user if the number is:
 * too big, too small or the same
 * If the number is guessed the user wins,
 * Otherwise the computer wins
 * Print winning message
 * @author Soroush Abdollahi
 *
 */
public class GuessProduct {

	/**
	 * The computer picks atwo random integer from 10 to 99
	 * The computer adds those two integers together
	 * After each turn the computer tells the user if the number is:
	 * too big, too small or the same
	 * If the number is guessed the user wins,
	 * Otherwise the computer wins
	 * Print winning message
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Guess Product by Soroush Abdollahi");
		//pick a random integer
		int hiddenNumber = 10 + (int)(Math.random()*99);
		int tensPlace = hiddenNumber / 10;
		int onesPlace = hiddenNumber % 10;
		int hiddenProduct = tensPlace * onesPlace;
		System.out.println("I picked a number from 10 to 99 and multiplied the digits together.");
		System.out.println("The product of these two numbers is: "+ hiddenProduct);
		System.out.println("You have 3 turns to guess the product of these two digits.");
		//ask a user for the first guess
		Scanner scanner = new Scanner(System.in);
		System.out.print("Guess 1: ");
		String guess1Text = scanner.nextLine();
		int guess1 = Integer.parseInt(guess1Text);
		//if guessed user wins and stops the execution
		if (hiddenNumber == guess1) {
			System.out.println("You won!");
			scanner.close();
			return;
		}
		//if too big print too big message
		else if (guess1 > hiddenNumber) {
			System.out.println("Your number is too big.");
		} else { //else if too small print too small message
			System.out.println("Your number is too small.");
		}
		//repeat for second guess
		//ask user for second guess
		System.out.print("Guess 2: ");
		String guess2Text = scanner.nextLine();
		int guess2 = Integer.parseInt(guess2Text);
		//if guessed user wins and stops the execution
		if (hiddenNumber == guess2) {
			System.out.println("You won!");
			scanner.close();
			return;
		}
		//if too big user wins and stop execution
		else if (hiddenNumber < guess2) {
			System.out.println("Your number is too big.");
		} else { //else if too small print too small message
			System.out.println("Your number is too small.");
		}
		//repeat for third guess
		//ask user for third guess
		System.out.print("Guess 3: ");
		String guess3Text = scanner.nextLine();
		int guess3 = Integer.parseInt(guess3Text);
		//if guessed user wins and stops the execution
		if (hiddenNumber == guess3) {
			System.out.println("You won!");
			scanner.close();
			return;
		}		
		// otherwise computer wins
		System.out.println("I won. My number was: "+ hiddenNumber);

	} //end main

}// end GuessProduct
