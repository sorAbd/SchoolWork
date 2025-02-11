/**
 * Module 04: Booleans and Dialogs
 * Activity 3: Comparing Strings
 * Program 2: Dictionary Order
 */
package m04a3p2;

import javax.swing.JOptionPane;

/**
 * Receive 3 words (all lowercase) in a dialog box
 * Computes if they are in dictionary order
 * Print out a statement if they are in order
 * @author Soroush Abdollahi
 *
 */
public class DictionaryOrder {

	/**
	 * Receive 3 words (all lowercase) in a dialog box
	 * Computes if they are in dictionary order
	 * Print out a statement if they are in order
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Dictionary Order by Soroush Abdollahi");
		//Receive 3 words (all lowercase) in a dialog box
		String word1 = JOptionPane.showInputDialog("Enter the first word (in lowercase):");
		String word2 = JOptionPane.showInputDialog("Enter the second word (in lowercase):");
		String word3 = JOptionPane.showInputDialog("Enter the third word (in lowercase):");
		
		//compute if they are in dictionary order
		boolean wordOrder = (word1.compareTo(word2)<0) && (word2.compareTo(word3)<0) && (word1.compareTo(word3)<0);
		
		//compute string
		String message = "The three words inputted are: "+word1+", "+word2+", and "+word3+".\n";
		message += "It is "+wordOrder+" that these three words are in dictionary order";
		
		//print statement
		JOptionPane.showMessageDialog(null, message);

	}//end main

}//end DictionaryOrder
