/**
 * Module 04: Boolean and Dialogs
 * Activity 2: Boolean operator and expressions
 * Program 1: LeapYear
 */
package M04a2p1;

import javax.swing.JOptionPane;

/**
 * Receives through a dialog the name and year of birth for two persons.
 * Computes the following conditions:
 * - the first person is born in a leap year
 * - the second person is born in a leap year
 * - both are born in a leap year
 * - none is born in a leap year
 * - any of them is born in a leap year
 * - exactly one if them is born in a leap year
 * Print the result in complete sentences like:
 * - It is true that John is born in a leap year.
 * - It is false that both Mary and John are born in a leap year.
 * @author Soroush Abdollahi
 *
 */
public class LeapYear {

	/**
	 * Receives through a dialog the name and year of birth for two persons.
     * Computes the following conditions:
     * - the first person is born in a leap year
     * - the second person is born in a leap year
     * - both are born in a leap year
     * - none is born in a leap year
     * - any of them is born in a leap year
     * - exactly one if them is born in a leap year
     * Print the result in complete sentences like:
     * - It is true that John is born in a leap year.
     * - It is false that both Mary and John are born in a leap year.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Leap Year by Soroush Abdollahi");
		// Receives through a dialog the name and year of birth for both persons
		String name1 = JOptionPane.showInputDialog("Enter name of the first person: ");
		String yearText1 = JOptionPane.showInputDialog("Enter year of birth of the first person: ");
		int year1 = Integer.parseInt(yearText1);
		String name2 = JOptionPane.showInputDialog("Enter name of the second person: ");
		String yearText2 = JOptionPane.showInputDialog("Enter year of birth of the second person: ");
		int year2 = Integer.parseInt(yearText2);
		
		//Compute conditions
		
		//first person is born in a leap year
		// year divisible by 4; year not divisible by 100; or year divisible by 400
		boolean leap1 = (year1 % 400 == 0) || ((year1 % 4 == 0) &&(year1 %100!=0));
		
		//second person is born in a leap year
		// order of execution: ! ; % ; == != ; && ; ^ ; ||
		boolean leap2 = year2 % 400 == 0 || year2 % 4 == 0 && !(year2 %100!=0);
		
		//both are born in a leap year (AND: &&)
		boolean leapBoth = leap1 && leap2;
		//none is born in a leap year
		boolean leapNone = !leap1 && !leap2;
		//any of them is born in a leap year (OR: ||)
		boolean leapAny = leap1 || leap2;
		//exactly one of them is born in a leap year (XOR: ^)
		boolean leapJustOne =  leap1 ^ leap2;
		
		//compose the message
		String message;
		message = "First person is " +name1+" born in " +year1+ ".\n";
		message += "Second person is " +name2+" born in " +year2+ ".\n";
		message += "It is "+leap1+" that "+name1+" is born in a leap year.\n";
		message += "It is "+leap2+" that "+name2+" is born in a leap year.\n";
		message += "It is "+leapBoth+" that "+name1+" and "+name2+" are born in a leap year.\n";
		message += "It is "+leapNone+" that neither "+name1+" and "+name2+" are born in a leap year.\n";
		message += "It is "+leapAny+" that either "+name1+" or "+name2+" are born in a leap year.\n";
		message += "It is "+leapJustOne+" that exactly one of "+name1+" or "+name2+" are born in a leap year.\n";
		//Print results
		JOptionPane.showMessageDialog(null, message);
	}// end main

}// end LeapYear
