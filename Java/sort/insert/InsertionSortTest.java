/**
 * Class: InsertionSort
 */

package sort.insert;
import java.util.Date;
import util.array.ArrayUtility;
import sort.select.SelectionSort;

/**
 * tests insertionSort class
 * 
 * @ author Soroush Abdollahi
 */
public class InsertionSortTest {
	
	public static void testInsertionSort() {
		int[] a0 = ArrayUtility.generateIntArray(0, 1, 20);
		int[] a1 = ArrayUtility.generateIntArray(1, 1, 20);
		int[] a2 = ArrayUtility.generateIntArray(2, 1, 20);
		int[] a5 = ArrayUtility.generateIntArray(5, 1, 20);
		int[] a10 = ArrayUtility.generateIntArray(10, 1, 20);
		//with 0 elements
//		System.out.printf("Random array with 0 elements, from 1 to 20: \n    %s\n",
//				ArrayUtility.toString(a0, "<", ", ", ">"));
//		InsertionSort.sort(a0);
//		System.out.printf("Sorted array : \n    %s\n",
//				ArrayUtility.toString(a0, "{", ", ", "}"));
//		//with 1 element
//		System.out.printf("Random array with 1 elements, from 1 to 20: \n    %s\n",
//				ArrayUtility.toString(a1, "<", ", ", ">"));
//		InsertionSort.sort(a1);
//		System.out.printf("Sorted array : \n    %s\n",
//				ArrayUtility.toString(a1, "<", ", ", ">"));
		//with 2 elements
		System.out.printf("Random array with 2 elements, from 1 to 20: \n    %s\n",
				ArrayUtility.toString(a2, "<", ", ", ">"));
		InsertionSort.reverse(a2);
		System.out.printf("Sorted array : \n    %s\n",
				ArrayUtility.toString(a2, "<", ", ", ">"));
		//with 5 elements
		System.out.printf("Random array with 5 elements, from 1 to 20: \n    %s\n",
				ArrayUtility.toString(a5, "<", ", ", ">"));
		InsertionSort.reverse(a5);
		System.out.printf("Sorted array : \n    %s\n",
				ArrayUtility.toString(a5, "<", ", ", ">"));
		//with 10 elements
		System.out.printf("Random array with 10 elements, from 1 to 20: \n    %s\n",
				ArrayUtility.toString(a10, "<", ", ", ">"));
		InsertionSort.reverse(a10);
		System.out.printf("Sorted array : \n    %s\n",
				ArrayUtility.toString(a10, "<", ", ", ">"));
	}
	
	public static void main(String[] args) {
        System.out.println("Insertion sort: int array test - B12 Task 1 - adapted by Soroush Abdollahi");
        Date date = new Date();
        System.out.println("Executed on: "+date.toString());
        testInsertionSort();
	}
}
