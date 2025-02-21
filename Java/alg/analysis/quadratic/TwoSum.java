/**
 * Quadratic equation for twoSum
 */
package alg.analysis.quadratic;

import java.util.Arrays;

/**
 * counts n^2 running time and reads n integers and counts number of pairs that sum exactly to 0
 * @ author Soroush Abdollahi
 */
public class TwoSum {

//	/**
//	 * counts number of inverses (e.g 1 and -1 or 4 and -4) in an array
//	 * 
//	 * @param a - an array of ints
//	 * @return - the number of inverses
//	 */
//    public static int count(int[] a) {
//        int n = a.length;
//        Arrays.sort(a);
//        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            int j = Arrays.binarySearch(a, -a[i]);
//            if (j > i) count++;
//        }
//        return count;
//    }

    /**
     * returns the amount of triples that are the same (a[i] + a[k] + a[j] = 0)
     * @param a - array of integers
     * @return - the amount of triples
     */
    public static int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) count++;
            }
        }
        return count;
    }
	
    /**
     * checks arrays for duplicate values
     * 
     * @param a - an array of ints
     * @return - true or false depending on if there are duplicates
     */
    private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] == a[i-1]) return true;
        return false;
    }
}
