/**
 * class: SelectionSort
 */
package sort.select;

/**
 * class filled with sorting methods
 * @author Soroush Abdollahi
 */
public class SelectionSort {

	/**
	 * sort the array using the selection sort method
	 * @param array an array of integers
	 */
	public static void sort(int[] array) {     
		for (int i=0; i<array.length-1; i++) {
			int iMin = i;
			int min  = array[i];
			for (int j=i+1; j<array.length; j++) {
				if (array[j]<min) {
					iMin = j;
					min = array[j];
				}
			}
			array[iMin] = array[i];
			array[i] = min;
		}
	}
}
