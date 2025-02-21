/**
 * Class: InsertionSortAnalysis
 */

package sort.insert;

import java.util.Date;
import alg.analysis.Stopwatch;
import alg.bags.TimeAnalysis;
import util.array.ArrayUtility;

/**
 * use time analysis to time the insertion sort
 * 
 * @author Soroush Abdollahi
 */
public class InsertionSortAnalysis {

	/**
	 * Times how long it takes to sort an array
	 * @param name - name of the test
	 * @param numberOfExecutions - number of trials
	 * @param numberOfElements - number of elements in the array
	 * @param min - minimum possible number in the array
	 * @param max - maximum possible number in the array
	 * @return - a time analysis of the sort
	 */
	   public static TimeAnalysis meanTime(String name, int numberOfExecutions, int numberOfElements, int min, int max) {
	        Stopwatch watch = new Stopwatch();
	        TimeAnalysis ta = new TimeAnalysis(name, numberOfExecutions);
	        for (int trial = 0; trial < numberOfExecutions; trial++) {
	        		int[] array = ArrayUtility.generateIntArray(numberOfElements, min, max);
	            watch.startWatch();
	            InsertionSort.sort(array);
	            long time = watch.elapsedTime();
	            ta.add(time);
	        }
	        return ta;
	    }	
	   
		/**
		 * Times how long it takes to sort an array once it has been reversed
		 * @param name - name of the test
		 * @param numberOfExecutions - number of trials
		 * @param numberOfElements - number of elements in the array
		 * @param min - minimum possible number in the array
		 * @param max - maximum possible number in the array
		 * @return - a time analysis of the sort
		 */
		   public static TimeAnalysis revMeanTime(String name, int numberOfExecutions, int numberOfElements, int min, int max) {
		        Stopwatch watch = new Stopwatch();
		        TimeAnalysis ta = new TimeAnalysis(name, numberOfExecutions);
		        for (int trial = 0; trial < numberOfExecutions; trial++) {
		        	int[] array = ArrayUtility.generateIntArray(numberOfElements, min, max);
		            InsertionSort.reverse(array);
		        	watch.startWatch();
		            InsertionSort.sort(array);
		            long time = watch.elapsedTime();
		            ta.add(time);
		        }
		        return ta;
		    }	
	   
	   /**
	    * prints out a table for the executions.
	    * @param numberOfExecutions - amount of times trial is done
	    * @param minArrayLength - shortest the array can be
	    * @param arrayIncrementLength - incrementation of the array sizes
	    * @param maxArrayLength - longest an array can be
	    * @param minArrayValue - minimum possible value in an array
	    * @param maxArrayValue - maximum possible value in array
	    */
	    public static void printMeanExecutionTimeGrowthTable(int numberOfExecutions, 
	    		int minArrayLength, int arrayIncrementLength, int maxArrayLength, 
	    		int minArrayValue, int maxArrayValue) {
	        System.out.println("Mean execution time growth table");
	        System.out.println("  - Method: Insertion sort of N integers");
	        System.out.println("  - Sample size for time estimation: "+numberOfExecutions);
	        System.out.println("|-----------|--------|------|------|------------------|");
	        System.out.println("|         N |   Mean |  Min |  Max |         CI 99.9% |");
	        System.out.println("|-----------|--------|------|------|------------------|");
	        for (int n=minArrayLength; n<=maxArrayLength; n+=arrayIncrementLength) {
	            String name = "Sort " + n + " integers";
	            TimeAnalysis ta = meanTime(name, numberOfExecutions, n, minArrayValue, maxArrayValue);
	            System.out.printf("| %9d | %6.1f | %4d | %4d | (%6.1f, %6.1f) |\n", n,  ta.getMeanTime(), 
	                    ta.getMinTime(), ta.getMaxTime(), ta.getMinMean999Confidence(), ta.getMaxMean999Confidence());
	        }
	        System.out.println("|-----------|--------|------|------|------------------|");
	    }   
	    
	    /**
		    * prints out a table for the worst case scenario executions.
		    * @param numberOfExecutions - amount of times trial is done
		    * @param minArrayLength - shortest the array can be
		    * @param arrayIncrementLength - incrementation of the array sizes
		    * @param maxArrayLength - longest an array can be
		    * @param minArrayValue - minimum possible value in an array
		    * @param maxArrayValue - maximum possible value in array
		    */
		    public static void printRevMeanExecutionTimeGrowthTable(int numberOfExecutions, 
		    		int minArrayLength, int arrayIncrementLength, int maxArrayLength, 
		    		int minArrayValue, int maxArrayValue) {
		        System.out.println("Mean execution time growth table");
		        System.out.println("  - Method: Insertion sort of N integers");
		        System.out.println("  - Sample size for time estimation: "+numberOfExecutions);
		        System.out.println("|-----------|--------|------|------|------------------|");
		        System.out.println("|         N |   Mean |  Min |  Max |         CI 99.9% |");
		        System.out.println("|-----------|--------|------|------|------------------|");
		        for (int n=minArrayLength; n<=maxArrayLength; n+=arrayIncrementLength) {
		            String name = "Sort " + n + " integers";
		            TimeAnalysis ta = revMeanTime(name, numberOfExecutions, n, minArrayValue, maxArrayValue);
		            System.out.printf("| %9d | %6.1f | %4d | %4d | (%6.1f, %6.1f) |\n", n,  ta.getMeanTime(), 
		                    ta.getMinTime(), ta.getMaxTime(), ta.getMinMean999Confidence(), ta.getMaxMean999Confidence());
		        }
		        System.out.println("|-----------|--------|------|------|------------------|");
		    }   
	    
		public static void main(String[] args) {
	        System.out.println("Insertion sort: int array analysis - B12 Task 4 - adapted by Soroush Abdollahi");
	        Date date = new Date();
	        System.out.println("Executed on: "+date.toString());
	        //printMeanExecutionTimeGrowthTable(20,10000,10000,100000,0,1000000000);
	        printRevMeanExecutionTimeGrowthTable(21,10000 ,10000 ,100000,0,1000000000);
		}   
}
