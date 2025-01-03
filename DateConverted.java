/**
 * Module 09: Other Loops and Conditionals
 * Activity 2: switch conditional 
 * Program 1: Date Converter
 */
package m09a2p1;

import java.util.Scanner;
/**
 * Read current date from the keyboard as a string
 * in the format MM/DD/YYYY (e.g 2/4/2020).
 * If the date is wrong provide an error message.
 * If the date is correct, convert it in the format:
 * MONTH DD, YYYY (e.g February 4, 2021; December 2, 2020).
 * You may need to check if their year is a leap year or not.
 * Do not use any predefined method for processing the date 
 * @author Soroush Abdollahi
 *
 */
public class DateConverted {

	/**
	 * Read current date from the keyboard as a string
	 * in the format MM/DD/YYYY (e.g 2/4/2020).
	 * If the date is wrong provide an error message.
	 * If the date is correct, convert it in the format:
	 * MONTH DD, YYYY (e.g February 4, 2021; December 2, 2020).
	 * You may need to check if their year is a leap year or not.
	 * Do not use any predefined method for processing the date 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Date Converter by Soroush Abdollahi");
		// Read a date in format MM/DD/YYYY
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a date in the format MM/DD/YYYY:");
		String dateInput = scanner.nextLine();
		
		// Extract the values of m, d, y
		int index1 = dateInput.indexOf('/');
		int index2 = dateInput.lastIndexOf('/');
		int month = Integer.parseInt(dateInput.substring(0,index1));
		int day = Integer.parseInt(dateInput.substring(index1+1,index2));
		int year = Integer.parseInt(dateInput.substring(index2+1));
		
		// Check a valid year
		boolean wrong; 
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			// all have 31 days
			wrong = day <1 || day > 31;
			break;
		case 4: case 6: case 9: case 11:
			//all have 30 days
			wrong = day < 1 || day > 30;
			break;
		case 2:
			//check if a leap year
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				//leap year
				wrong = day < 1 || day > 29;
			}
			else {
				wrong = day < 1 || day > 28;
			}
			break;
		default:
			wrong = true;
			break;
		}
		if (wrong) {
			System.out.println("Your date is wrong. Try again.");
			scanner.close();
			return;
		}
		// Generate the new format MONTH DD. YYYY
		String dateOutput = null;
		switch(month) {
		case 1: dateOutput = "January"; break;
		case 2: dateOutput = "February"; break;
		case 3: dateOutput = "March"; break;
		case 4: dateOutput = "April"; break;
		case 5: dateOutput = "May"; break;
		case 6: dateOutput = "June"; break;
		case 7: dateOutput = "July"; break;
		case 8: dateOutput = "August"; break;
		case 9: dateOutput = "September"; break;
		case 10: dateOutput = "October"; break;
		case 11: dateOutput = "November"; break;
		case 12: dateOutput = "December"; break;
		}
		dateOutput += " " + day + ", " + year;
		// Print the new format
		System.out.println("The date is: "+dateOutput);
		
		//close resources
		scanner.close();

	}

}
