/**
 * Class: InsertionSort
 */
package sort.insert;

/**
 * Class used to do insertion sorting
 * 
 * @author Soroush Abdollahi
 */
public class InsertionSort {

	/**
	 * insertion sort method
	 * rearranges integers into ascending order
	 * 
	 * @param a - an integer array
	 */
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;           
            for (; j > 0 && temp<a[j-1]; j--) {
                a[j]=a[j-1];
            }
            a[j]=temp;
        }
    }
    
    /**
     * puts an array in descending order
     * 
     * @param a - an int array
     */
    public static void reverse(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;           
            for (; j > 0 && temp>a[j-1]; j--) {
                a[j]=a[j-1];
            }
            a[j]=temp;
        }
    }
}
