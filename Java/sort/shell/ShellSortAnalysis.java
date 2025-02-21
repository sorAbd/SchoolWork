/**
 * Class: ShellSortAnalysis
 */
package sort.shell;

import alg.analysis.Stopwatch;
import alg.bags.TimeAnalysis;
import util.array.ArrayUtility;
import java.util.Date;

/**
 * @author Soroush Abdollahi
 */
public class ShellSortAnalysis {

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
            ShellSort.sort(array);
            long time = watch.elapsedTime();
            ta.add(time);
        }
        return ta;
    }
    
	/**
	 * Times how long it takes to sort a reversed array
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
        	ShellSort.reverse(array);
            watch.startWatch();
            ShellSort.sort(array);
            long time = watch.elapsedTime();
            ta.add(time);
        }
        return ta;
    }
    
    /**
     * prints a table with information 
     * @param numberOfExecutions - number of times the sort gets executed
     * @param minArrayLength - minimum length of the array
     * @param arrayIncrementLength - amount the array increments by
     * @param maxArrayLength - maximum length of the array
     * @param minArrayValue - minimum value able to be placed in array
     * @param maxArrayValue - maximum value able to be placed in array
     */
    public static void printMeanExecutionTimeGrowthTable(int numberOfExecutions, 
    		int minArrayLength, int arrayIncrementLength, int maxArrayLength, 
    		int minArrayValue, int maxArrayValue) {
        System.out.println("Mean execution time growth table");
        System.out.println("  - Method: Shell sort of N integers");
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
     * prints a table with information for reversed time analysis
     * @param numberOfExecutions - number of times the sort gets executed
     * @param minArrayLength - minimum length of the array
     * @param arrayIncrementLength - amount the array increments by
     * @param maxArrayLength - maximum length of the array
     * @param minArrayValue - minimum value able to be placed in array
     * @param maxArrayValue - maximum value able to be placed in array
     */
    public static void printRevMeanExecutionTimeGrowthTable(int numberOfExecutions, 
    		int minArrayLength, int arrayIncrementLength, int maxArrayLength, 
    		int minArrayValue, int maxArrayValue) {
        System.out.println("Mean execution time growth table");
        System.out.println("  - Method: Shell sort of N integers");
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
        System.out.println("Shell sort: int array analysis - B13 Task 4 - adapted by Soroush Abdollahi");
        Date date = new Date();
        System.out.println("Executed on: "+date.toString());
        printRevMeanExecutionTimeGrowthTable(21,1000000,1000000,10000000,0,1000000000);
        //printMeanExecutionTimeGrowthTable(21,100000,100000,1000000,0,1000000000);
	}     
}
