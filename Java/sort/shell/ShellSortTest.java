/**
 * Class: ShellSortTest
 */
package sort.shell;

import java.util.Date;
import util.array.ArrayUtility;

/**
 * Tests out the shell sort class
 * 
 * @author Soroush Abdollahi
 */
public class ShellSortTest {

	/**
	 * tests out the shell sort method from ShellSort class
	 */
	public static void testShellSort() {
//		//0 elements
//		int[] a0 = ArrayUtility.generateIntArray(0, 1, 20);
//		System.out.printf("Random array with 0 elements, from 1 to 20: \n    %s\n",
//				ArrayUtility.toString(a0, "<", ", ", ">"));
//		ShellSort.sort(a0);
//		System.out.printf("Sorted array : \n    %s\n",
//				ArrayUtility.toString(a0, "<", ", ", ">"));
//		//5 elements
//		int[] a5 = ArrayUtility.generateIntArray(5, 1, 20);
//		System.out.printf("Random array with 5 elements, from 1 to 20: \n    %s\n",
//				ArrayUtility.toString(a5, "<", ", ", ">"));
//		ShellSort.sort(a5);
//		System.out.printf("Sorted array : \n    %s\n",
//				ArrayUtility.toString(a5, "<", ", ", ">"));
//		//15 elements
//		int[] a15 = ArrayUtility.generateIntArray(15, 1, 20);
//		System.out.printf("Random array with 15 elements, from 1 to 20: \n    %s\n",
//				ArrayUtility.toString(a15, "<", ", ", ">"));
//		ShellSort.sort(a15);
//		System.out.printf("Sorted array : \n    %s\n",
//				ArrayUtility.toString(a15, "<", ", ", ">"));
		//0 elements
		int[] a0 = ArrayUtility.generateIntArray(0, 1, 20);
		System.out.printf("Random array with 0 elements, from 1 to 20: \n    %s\n",
				ArrayUtility.toString(a0, "<", ", ", ">"));
		ShellSort.reverse(a0);
		System.out.printf("Sorted array : \n    %s\n",
				ArrayUtility.toString(a0, "<", ", ", ">"));
		//5 elements
		int[] a5 = ArrayUtility.generateIntArray(5, 1, 20);
		System.out.printf("Random array with 5 elements, from 1 to 20: \n    %s\n",
				ArrayUtility.toString(a5, "<", ", ", ">"));
		ShellSort.reverse(a5);
		System.out.printf("Sorted array : \n    %s\n",
				ArrayUtility.toString(a5, "<", ", ", ">"));
		//15 elements
		int[] a15 = ArrayUtility.generateIntArray(15, 1, 20);
		System.out.printf("Random array with 15 elements, from 1 to 20: \n    %s\n",
				ArrayUtility.toString(a15, "<", ", ", ">"));
		ShellSort.reverse(a15);
		System.out.printf("Sorted array : \n    %s\n",
				ArrayUtility.toString(a15, "<", ", ", ">"));
	}
	
	public static void main(String[] args) {
        System.out.println("Shell sort: int array test - B13 Task 1 - adapted by Soroush Abdollahi");
        Date date = new Date();
        System.out.println("Executed on: "+date.toString());
        testShellSort();
	}
}
