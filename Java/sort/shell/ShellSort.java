/**
 *
 */
package sort.shell;

/**
 * class used to sort arrays using shell sort method
 * 
 * @ author Soroush Abdollahi
 */
public class ShellSort {
	
	/**
	 * sorts array using shell sort
	 * 
	 * @param a - an integer array
	 */
	  public static void sort(int[] a) {
	        int h = 1;
	        while (h < a.length/3) 
	            h = 3*h + 1; 
	        
	        while (h >= 1) {
	            for (int i = h; i < a.length; i++) {
	                int temp = a[i];
	                int j=i;
	                for (; j >= h && temp<a[j-h]; j -= h) {
	                    a[j]=a[j-h];
	                }
	                a[j]=temp;
	            }
	            h /= 3;
	        }
	    }
	  
		/**
		 * sorts array using shell sort
		 * 
		 * @param a - an integer array
		 */
		  public static void reverse(int[] a) {
		        int h = 1;
		        while (h < a.length/3) 
		            h = 3*h + 1; 
		        
		        while (h >= 1) {
		            for (int i = h; i < a.length; i++) {
		                int temp = a[i];
		                int j=i;
		                for (; j >= h && temp>a[j-h]; j -= h) {
		                    a[j]=a[j-h];
		                }
		                a[j]=temp;
		            }
		            h /= 3;
		        }
		    }
}
