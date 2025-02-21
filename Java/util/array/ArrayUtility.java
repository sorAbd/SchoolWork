/**
 * Class ArrayUtility
 */
package util.array;

/**
 * Methods for sorting out arrays
 * 
 * @author Soroush Abdollahi
 */
public class ArrayUtility {

	/**
	 * Method receives an array of int's, a start string, a separator string 
	 * and an end string. 
	 * 
	 * @param array - the array to be output
	 * @param start - the start of the output
	 * @param separator - the separator between elements
	 * @param end - the end of the string
	 * 
	 * @return a String starting with the start string, 
	 * followed by the array elements separated by the separator 
	 */
	public static String toString(int[] array, String start, String separator, String end) {
		String result = start;
		boolean needSeparator = false;
		for (int elem: array) {
			if (needSeparator) result += separator;
			result += elem;
			needSeparator = true;
		}
		result += end;
		return result;
	}
	
	/**
	 * method checks to see if two arrays are equal 
	 * @param array1 - an integer array
	 * @param array2 - an integer array
	 * @return - a boolean claiming whether the two arrays are the same
	 */
	public static boolean equals(int[] array1, int[] array2) {
		if (array1.length != array2.length) return false;
		for (int i=0;i<array1.length; i++) {
			if (array1[i]!=array2[i]) return false;
		}
		return true;
	}
	
	/**
	 * method checking to see if an array is sorted in order
	 * @param a - an integer array
	 * @return - a boolean claiming whether the array is already in order
	 */
	public static boolean isSorted(int[] a) {
		for (int i=0; i<a.length-1;i++) {
			if (a[i]>a[i+1]) return false;
		}
		return true;
	}
	
	/**
	 * Generates an array of random values
	 * @param length - length of array
	 * @param min - minimum value in the array
	 * @param max - maximum value in the array
	 * @return - an integer array
	 */
	public static int[] generateIntArray(int length, int min, int max) {
		int[] array = new int[length];
		for (int i=0; i<length; i++) {
			array[i]=(int) (min+Math.random()*(1.0+max-min));
		}
		return array;
	}
}
