/**
 * Module 04: Texts and Scanners
 * Guided Activity 4: Boolean results for comparing numbers with dialog interaction
 * Program 2: Taller
 */
package m04a4p2;

import javax.swing.JOptionPane;

/**
 * Receives through a dialog the name and height (in inches) for two persons.
 * Computes the following conditions:
 * - the first person is taller (in inches)
 * - the second person is taller
 * - both are the same height
 * Print the result in complete sentences like:
 *  - It is true that John is taller
 * @author Soroush Abdollahi
 *
 */
public class Taller {

	/**
	 * Receives through a dialog the name and height (in inches) for two persons.
     * Computes the following conditions:
     * - the first person is taller (in inches)
     * - the second person is taller
     * - both are the same height
     * Print the result in complete sentences like:
     *  - It is true that John is taller
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Taller by Soroush Abdollahi");
		// Receives through a dialog the name and year of birth for both persons
		String name1 = JOptionPane.showInputDialog("Enter name of the first person: ");
		String tallText1 = JOptionPane.showInputDialog("Enter the hieght (in inches) for the first person: ");
		int height1 = Integer.parseInt(tallText1);
		String name2 = JOptionPane.showInputDialog("Enter name of the second person: ");
		String tallText2 = JOptionPane.showInputDialog("Enter the hieght (in inches) for the second person: ");
		int height2 = Integer.parseInt(tallText2);
		//Compute conditions
		
		//the first person has seniority (born in an earlier year)
		boolean tall1 = height1 > height2;
		//the second person has seniority
		boolean tall2 = height2 > height1;
		//- both have the same seniority (born in the same year)
		boolean tallNone = height2 == height1;
		
		//Compose the message
		String message;
		message = "First person, " +name1+", is " +height1+ " inches tall.\n";
		message += "Second person, " +name2+", is " +height2+ " inches tall.\n";
		message += "It is "+tall1+" that  "+name1+" is taller.\n";
		message += "It is "+tall2+" that  "+name2+" is taller.\n";
		message += "It is "+tallNone+" that  "+name1+" and "+name2+" have the same seniority.\n";
		
		//Print results
		JOptionPane.showMessageDialog(null, message);

	} //end main

} //end Taller
