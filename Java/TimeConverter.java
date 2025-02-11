/**
 * Module 09: Other Loops and Conditionals
 * Activity 2: switch conditional 
 * Program 2: Time Converter
 */
package m09a2p2;

import java.util.Scanner;

/**
 * Read from the keyboard a duration as a string
 * in the format HH:MM:SS (e.g 05:55:57).
 * Convert it to seconds and print it
 * You may need to check if their year is a leap year or not.
 * Do not use any predefined method for processing the date 
 * @author Soroush Abdollahi
 *
 */
public class TimeConverter {

	/**
	 * Read from the keyboard a duration as a string
	 * in the format HH:MM:SS (e.g 05:55:57).
	 * Convert it to seconds and print it
	 * You may need to check if their year is a leap year or not.
	 * Do not use any predefined method for processing the date
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Time Converter by Soroush Abdollahi");
		// Read a date in format MM/DD/YYYY
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a time duration in the format HH:MM:SS: ");
		String dateInput = scanner.nextLine();
		
		// Extract the values of m, d, y
		int index1 = dateInput.indexOf(':');
		int index2 = dateInput.lastIndexOf(':');
		int hour = Integer.parseInt(dateInput.substring(0,index1));
		int minute = Integer.parseInt(dateInput.substring(index1+1,index2));
		int second = Integer.parseInt(dateInput.substring(index2+1));
		
		// Check a valid time
		boolean wrong = false; 
		if (minute < 0 || minute >= 60) {
			wrong = true;
		}
		if (second < 0 || second>= 60) {
			wrong = true;
		}
		if (wrong) {
			System.out.println("Your time is wrong. Try again.");
			scanner.close();
			return;
		}
		// Compute the duration in seconds
		int durationHours = hour*60*60;
		int durationMinutes = minute*60;
		int totalDuration = durationHours + durationMinutes + second;
		// Print the new format
		System.out.println("The time in seconds is: "+totalDuration);
		
		//close resources
		scanner.close();


	}

}
