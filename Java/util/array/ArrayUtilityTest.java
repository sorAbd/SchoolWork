/**
 *class: ArrayUtilityTest
 */
package util.array;

import java.util.Date;

/**
 * Class to test out methods in ArrayUtility class
 * @author Soroush Abdollahi
 */
public class ArrayUtilityTest {

	/**
	 * Method used to test out toString method from ArrayUtility
	 */
	public static void toStringTest() {
		int[] empty = {};
		System.out.println("Empty array: "+ArrayUtility.toString(empty, "|", " ", "|"));
		int[] singleton = { 1 };
		System.out.println("Singleton array: "+ArrayUtility.toString(singleton, "[", " | ", "]"));
		int[] twoElements = { 11, 12 };
		System.out.println("Two element array: "+ArrayUtility.toString(twoElements, ">", "; ", "<"));
		int[] fiveElements = { 1, 2, 3, 4, 5 };
		System.out.println("Five element array: "+ArrayUtility.toString(fiveElements, "<", ", ", ">"));
		int[] twentyElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println("Twenty element array: "+ArrayUtility.toString(twentyElements, "{", "/ ", "}"));
	}
	
	/**
	 * testing out the equalsTest method
	 */
	
	public static void equalsTest() {
		int[] empty1 = {};
		int[] empty2 = {};
		int[] singleton1 = {1};
		int[] singleton1Same = {1};
		int[] singleton2 = {2};
		int[] singleton2Same = {2};
		int[] array1 = {1,2};
		int[] array1Same = {1,2};
		int[] array2 = {2,3};
		int[] array2Same = {2,3};
		System.out.println("Two empty arrays "+ArrayUtility.toString(empty1, "[", " ", "]")+" and "
				+ArrayUtility.toString(empty2, "[", " ", "]")+" are equal? "+ ArrayUtility.equals(empty1, empty2));		
		System.out.println("One empty array "+ArrayUtility.toString(empty1, "[", " ", "]")+" and one singleton "
				+ArrayUtility.toString(singleton1, "[", " ", "]")+" are equal? "+ ArrayUtility.equals(empty1, singleton1));
		System.out.println("Two singleton with same elements "+ArrayUtility.toString(singleton1, "[", " ", "]")
				+ArrayUtility.toString(singleton1Same, "[", " ", "]")+" are equal? "+ ArrayUtility.equals(singleton1, singleton1Same));		
		System.out.println("Two singleton with different elements "+ArrayUtility.toString(singleton1, "[", " ", "]")
				+ArrayUtility.toString(singleton2, "[", " ", "]")+" are equal? "+ ArrayUtility.equals(singleton1, singleton2));
		System.out.println("Two arrays with same elements "+ArrayUtility.toString(array1, "[", " ", "]")
		+ArrayUtility.toString(array1Same, "[", " ", "]")+" are equal? "+ ArrayUtility.equals(array1, array1Same));		
		System.out.println("Two arrays with different elements "+ArrayUtility.toString(array1, "[", " ", "]")
		+ArrayUtility.toString(array2, "[", " ", "]")+" are equal? "+ ArrayUtility.equals(array1, array2));
	}
	
	public static void isSortedTest() {
		int[] empty1 = {};
		int[] twoElemArrayU = {5,2};
		int[] twoElemArrayS = {2,5};
		int[] variableElemArrayU = {5,3,1,8};
		int[] variableElemArrayS = {1,2,3,4,5,6};
		System.out.println("Empty array "+ArrayUtility.toString(empty1, "[", " ", "]")+" is sorted? "+ ArrayUtility.isSorted(empty1));	
		System.out.println("Unsorted 2 elements array "+ArrayUtility.toString(twoElemArrayU, "[", " ", "]")+" is sorted? "
				+ ArrayUtility.isSorted(twoElemArrayU));
		System.out.println("Sorted 2 elements array "+ArrayUtility.toString(twoElemArrayS, "[", " ", "]")+" is sorted? "
				+ ArrayUtility.isSorted(twoElemArrayS));
		System.out.println("Unsorted elements array "+ArrayUtility.toString(variableElemArrayU, "[", " ", "]")+" is sorted? "
				+ ArrayUtility.isSorted(variableElemArrayU));
		System.out.println("Unsorted elements array "+ArrayUtility.toString(variableElemArrayS, "[", " ", "]")+" is sorted? "
				+ ArrayUtility.isSorted(variableElemArrayS));
	}
	
	/**
	 * tests out the generateArray method
	 */
	public static void generateIntArrayTest() {
		int[] empty = ArrayUtility.generateIntArray(0, 0, 100);
		System.out.println("Generated empty array "+ArrayUtility.toString(empty, "<", ", ", ">"));
		int[] singletonArray = ArrayUtility.generateIntArray(1, 0, 100);
		System.out.println("Generated singleton array with elements from 0 to 100 "+ArrayUtility.toString(singletonArray , "<", ", ", ">"));
		int[] array10 = ArrayUtility.generateIntArray(10, 0, 100);
		System.out.println("Generated 10 elements array with elements from 0 to 100 "+ArrayUtility.toString(array10, "<", ", ", ">"));
		int[] array20 = ArrayUtility.generateIntArray(20, 0, 100);
		System.out.println("Generated 10 elements array with elements from 0 to 100 "+ArrayUtility.toString(array20, "<", ", ", ">"));
		int[] array30 = ArrayUtility.generateIntArray(30, 0, 100);
		System.out.println("Generated 10 elements array with elements from 0 to 100 "+ArrayUtility.toString(array30, "<", ", ", ">"));
	}
	
	public static void main(String[] args) {
		System.out.println("ArrayUtility toString test - B11 Task 1 S4 - adapted by Soroush Abdollahi");
	    Date date = new Date();
	    System.out.println("Executed on: "+date.toString());
		//toStringTest();
	    //equalsTest();
	    //isSortedTest();
	    generateIntArrayTest();
	}
}
