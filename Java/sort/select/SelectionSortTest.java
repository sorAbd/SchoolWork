/**
 * class SelectionSortTest
 */
package sort.select;

import java.util.Date;

import util.array.*;

/**
 * testing the selection sort class
 * @ author Soroush Abdollahi
 */
public class SelectionSortTest {

	public static void testSelectionSort() {
		int[] a0 = ArrayUtility.generateIntArray(0, 1, 20);
		System.out.printf("Random array with 0 elements, from 1 to 20: \n%s\n    ",
				ArrayUtility.toString(a0, "<", ", ", ">"));
		SelectionSort.sort(a0);
		System.out.printf("Sorted array : \n%s\n    ",
				ArrayUtility.toString(a0, "<", ", ", ">"));
		int[] a1 = ArrayUtility.generateIntArray(1, 1, 20);
		System.out.printf("Random array with 1 element, from 1 to 20: \n%s\n    ",
				ArrayUtility.toString(a1, "<", ", ", ">"));
		SelectionSort.sort(a1);
		System.out.printf("Sorted array : \n%s\n    ",
				ArrayUtility.toString(a1, "<", ", ", ">"));
		int[] a2 = ArrayUtility.generateIntArray(2, 1, 20);
		System.out.printf("Random array with 2 elements, from 1 to 20: \n%s\n    ",
				ArrayUtility.toString(a2, "<", ", ", ">"));
		SelectionSort.sort(a2);
		System.out.printf("Sorted array : \n%s\n    ",
				ArrayUtility.toString(a2, "<", ", ", ">"));
		int[] a5 = ArrayUtility.generateIntArray(5, 1, 20);
		System.out.printf("Random array with 5 elements, from 1 to 20: \n%s\n    ",
				ArrayUtility.toString(a5, "<", ", ", ">"));
		SelectionSort.sort(a5);
		System.out.printf("Sorted array : \n%s\n    ",
				ArrayUtility.toString(a5, "<", ", ", ">"));
		int[] a10 = ArrayUtility.generateIntArray(10, 1, 20);
		System.out.printf("Random array with 10 elements, from 1 to 20: \n%s\n    ",
				ArrayUtility.toString(a10, "<", ", ", ">"));
		SelectionSort.sort(a10);
		System.out.printf("Sorted array : \n%s\n    ",
				ArrayUtility.toString(a10, "<", ", ", ">"));
	}
	
	public static void main(String[] args) {
		// info
        System.out.println("Selection sort: int array test - B11 Task 2 - adapted by Soroush Abdollahi");
        Date date = new Date();
        System.out.println("Executed on: "+date.toString());
        // tests
        testSelectionSort();
	}
}
