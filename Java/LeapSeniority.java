/**
 * Module 04: Texts and Scanners
 * Guided Activity 1: Boolean results for comparing numbers with dialog interaction
 * Program 1: Leap Seniority
 */
package m04a4p1;

import javax.swing.JOptionPane;
/**
 * Receives through a dialog the name and year of birth for two persons.
 * Computes the following conditions:
 * - the first person has seniority (born in an earlier year)
 * - the second person has seniority
 * - both have the same seniority (born in the same year)
 * Print the result in complete sentences like:
 *  - It is true that John has seniority
 * @author Soroush Abdollahi
 *
 */
public class LeapSeniority {

	/**
	 * Receives through a dialog the name and year of birth for two persons.
     * Computes the following conditions:
     * - the first person has seniority (born in an earlier year)
     * - the second person has seniority
     * - both have the same seniority (born in the same year)
     * Print the result in complete sentences like:
     *  - It is true that John has seniority
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Leap Seniority by Soroush Abdollahi");
		// Receives through a dialog the name and year of birth for both persons
		String name1 = JOptionPane.showInputDialog("Enter name of the first person: ");
		String yearText1 = JOptionPane.showInputDialog("Enter year of birth of the first person: ");
		int year1 = Integer.parseInt(yearText1);
		String name2 = JOptionPane.showInputDialog("Enter name of the second person: ");
		String yearText2 = JOptionPane.showInputDialog("Enter year of birth of the second person: ");
		int year2 = Integer.parseInt(yearText2);
		//Compute conditions
		
		//the first person has seniority (born in an earlier year)
		boolean seniority1 = year1 < year2;
		//the second person has seniority
		boolean seniority2 = year2 < year1;
		//- both have the same seniority (born in the same year)
		boolean seniorityNone = year2 == year1;
		
		//Compose the message
		String message;
		message = "First person is " +name1+" born in " +year1+ ".\n";
		message += "Second person is " +name2+" born in " +year2+ ".\n";
		message += "It is "+seniority1+" that  "+name1+" has seniority.\n";
		message += "It is "+seniority2+" that  "+name2+" has seniority.\n";
		message += "It is "+seniorityNone+" that  "+name1+" and "+name2+" have the same seniority.\n";
		
		//Print results
		JOptionPane.showMessageDialog(null, message);
	}// end main

}// end LeapSeniority
