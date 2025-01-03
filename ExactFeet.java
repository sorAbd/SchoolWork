/**
 * Module 04: Boolean and Dialogs
 * Activity 2: Boolean operator and expressions
 * Program 1: ExactFeet
 */
package m04a2p2;

import javax.swing.JOptionPane;

/**
 ** Receives through a dialog the name and height (in inches) for two persons.
 * Computes the following conditions:
 * - computes the heights in feet and inches
 * - the first person's height is in exact feet
 * - the second person's height is in exact feet
 * - both have heights in exact feet
 * - none have heights in exact feet
 * - any of them have height in exact feet
 * - exactly one if them is born in a leap year
 * Print the result in complete sentences like:
 * - It is true that John's height is in exact feet.
 * - It is false that both Mary and John have height in exact feet.
 * @author Soroush Abdollahi
 *
 */
public class ExactFeet {

	/**
	 ** Receives through a dialog the name and height (in inches) for two persons.
     * Computes the following conditions:
     * - the first person's height is in exact feet
     * - the second person's height is in exact feet
     * - both have heights in exact feet
     * - none have heights in exact feet
     * - any of them have height in exact feet
     * - exactly one if them is born in a leap year
     * Print the result in complete sentences like:
     * - It is true that John's height is in exact feet.
     * - It is false that both Mary and John have height in exact feet.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Exact Feet by Soroush Abdollahi");
		// Receives through a dialog the name and year of birth for both persons
		String name1 = JOptionPane.showInputDialog("Enter name of the first person: ");
		String tallText1 = JOptionPane.showInputDialog("Enter the hieght (in inches) for the first person: ");
		int height1 = Integer.parseInt(tallText1);
		String name2 = JOptionPane.showInputDialog("Enter name of the second person: ");
		String tallText2 = JOptionPane.showInputDialog("Enter the hieght (in inches) for the second person: ");
		int height2 = Integer.parseInt(tallText2);
		//Compute conditions
		
		//Compute the height in feet and inches
		int heightFeet1 = height1 / 12;
		int heightInches1 = height1 % 12;
		int heightFeet2 = height2 / 12;
		int heightInches2 = height2 % 12;
		//First person height in exact feet
		boolean exactHeight1 = heightInches1 == 0;
		//Second person height in exact feet
		boolean exactHeight2 = heightInches2 == 0;
		//Both have height in exact feet
		boolean exactBoth = exactHeight1 && exactHeight2;
		//None have height in exact feet
		boolean exactNone = !exactHeight1 && !exactHeight2;
		//At least one of them has height in exact feet
		boolean exactAtLeastOne = exactHeight1 || exactHeight2;
		//Exactly one of them has height in exact feet
		boolean exactXOR = exactHeight1 ^ exactHeight2;
		
		//Compose the message
		String message;
		message = "First person, " +name1+", is " +heightFeet1+ " feet and " +heightInches1+" inches tall.\n";
		message += "Second person, " +name2+", is "+heightFeet2+ " feet and " +heightInches2+ " inches tall.\n";
		message += "It is "+exactHeight1+" that "+name1+" has a height in exact feet.\n";
		message += "It is "+exactHeight2+" that "+name2+"  has a height in exact feet.\n";
		message += "It is "+exactBoth+" that both "+name1+" and "+name2+" have a height in exact feet.\n";
		message += "It is "+exactNone+" that neither "+name1+" and "+name2+" have height in exact feet.\n";
		message += "It is "+exactAtLeastOne+" that either "+name1+" or "+name2+" have height in exact feet.\n";
		message += "It is "+exactXOR+" that exactly one of "+name1+" or "+name2+" have height in exact feet.\n";
		
		//Print message
		JOptionPane.showMessageDialog(null, message);
	}// end main

}// end ExactFeet
