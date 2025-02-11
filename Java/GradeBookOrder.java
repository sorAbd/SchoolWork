/**
 * Module 04: Booleans and Dialogs
 * Activity 3: Comparing Strings
 * Program 1: Grade Book Order
 */
package m04a3p1;

import javax.swing.JOptionPane;

/**
 * Read the first and last name of two students using dialog windows.
 * Check if they have the same last name.
 * Check if they have the same first name.
 * Check if they have the same name.
 * Check if the first one must appear first in the grade book.
 * Check if the second must appear first in the grade book.
 * @author Soroush Abdollahi
 *
 */
public class GradeBookOrder {

	/**
	 * Read the first and last name of two students using dialog windows.
	 * Check if they have the same last name.
	 * Check if they have the same first name.
	 * Check if they have the same name.
	 * Check if the first one must appear first in the grade book.
	 * Check if the second must appear first in the grade book.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Grade Book Order by Soroush Abdollahi");
		//Read the first and last name of two students using dialog windows
		String firstName1 = JOptionPane.showInputDialog("Enter the first name of the first student:");
		String lastName1 = JOptionPane.showInputDialog("Enter the last name of the first student:");
		String firstName2 = JOptionPane.showInputDialog("Enter the first name of the second student:");
		String lastName2 = JOptionPane.showInputDialog("Enter the last name of the second student:");
		
		//*** Compute conditions
		
		//Check if they have the same last name.
		boolean sameLastName = lastName1.equals(lastName2);
		//Check if they have the same first name.
		boolean sameFirstName = firstName1.equals(firstName2);
		//Check if they have the same name.
		boolean sameName = sameLastName && sameFirstName;
		//Check if the first one must appear first in the grade book.
		boolean firstIsFirst = (lastName1.compareTo(lastName2)<0) || sameLastName&&(firstName1.compareTo(firstName1)<0);
		//Check if the second must appear first in the grade book.
		boolean secondIsFirst = !firstIsFirst && !sameName;
		// *** Compute the result message
		String message;
		message = "The name of first student is: "+firstName1+" "+lastName1+".\n";
		message += "The name of second student is: "+firstName2+" "+lastName2+".\n";
		message += "It is "+sameLastName+" that the students have the same last name.\n";
		message += "It is "+sameFirstName+" that the students have the same first name. \n";
		message += "It is "+sameName+" that the students have the same name.\n";
		message += "It is "+firstIsFirst+" that the first student must appear first in the gradebook.\n";
		message += "It is "+secondIsFirst+" that the second student must appear first in the gradebook.\n";
		
		//Print outputs
		JOptionPane.showMessageDialog(null, message);

	}//end main

}// end GradeBookOrder
