/**
 * Module A02: Analysis of Algorithms
 * Section 2: Time Growth Analysis
 * Task 1a: Sum of Integers Linear Growth Analysis
 */
package alg.analysis.linear;

import java.util.Date;

import alg.analysis.Stopwatch;
import alg.bags.TimeAnalysis;

/**
 * Analyze the execution time growth for the sum of first N integers, when
 * we modify the number if integers added N. Check linear order of growth
 * 
 * @author Soroush Abdollahi
 * @version 1
 */
public class SumGrowthAnalysis {
    
	/**
     * Analyzes the execution time for the addition of the first n integers (1 + 2+
     * ... + maxValueAdded).
     * 
     * @param name - name of experiment
     * @param numberOfExecutions - How many times the operation is repeated to get an estimation of the mean time.
     * @param maxValueAdded - The value up which the numbers are added
     */
    public static TimeAnalysis testAddition(String name, int numberOfExecutions, int lastValueAdded) {
        Stopwatch watch = new Stopwatch();
        TimeAnalysis ta = new TimeAnalysis(name, numberOfExecutions);
        for (int trial = 0; trial < numberOfExecutions; trial++) {
            watch.startWatch();
            // tested code - start
            @SuppressWarnings("unused")
            double sum = 0;
            for (int i = 1; i <= lastValueAdded; i++) {
                sum += i;
            }
            // tested code - end
            long time = watch.elapsedTime();
            ta.add(time);
        }
        return ta;
    }

	
	/**
	 * prints out a table of our trials
	 * 
	 * @param numberOfExecutions - number of times trial is ran
	 * @param minValueAdded - our start number
	 * @param increment - how ever much we increment our minValueAdded until it reaches max
	 * @param maxValueAdded - The value up which the numbers are added up to
	 */
    public static void printMeanExecutionTimeGrowthTable(int numberOfExecutions, int minValueAdded, int increment, int maxValueAdded) {
    	System.out.println("Mean execution time growth table");
    	System.out.println(" - Method: Sum of first N integers");
    	System.out.println(" - Sample size for time estimation: "+numberOfExecutions);
    	System.out.println("|-----------|--------|------|------|------------------|");
    	System.out.println("|         N |   Mean |  Min |  Max |       CI 99.9%   |");
    	System.out.println("|-----------|--------|------|------|------------------|");
    	for (int n=minValueAdded; n<=maxValueAdded; n+=increment) {
    		String name = "Add the first "+n+" integers";
    		TimeAnalysis ta = testAddition(name, numberOfExecutions, n);
    		System.out.printf("| %9d | %6.1f | %4d | %4d | (%6.1f, %6.1f) |\n" ,
    				n, ta.getMeanTime(), ta.getMinTime(), ta.getMaxTime(), 
    				ta.getMinMean999Confidence(), ta.getMaxMean999Confidence());
    	}
    	System.out.println("|-----------|--------|------|-----|------------------|");
    }   
    
	public static void main(String[] args) {
        //System.out.println("Growth table 10M to 100M in 10M increment - A32 Task 1 - adapted by Soroush Abdollahi");
		//System.out.println("Growth table 100M to 200M in 10M increment - A32 Task 2 - adapted by Soroush Abdollahi");
		//System.out.println("Growth table 100M to 1B in 100M increment - A32 Task 3 - adapted by Soroush Abdollahi");
		System.out.println("Growth table 100M to 1B in 100M increment - A32 Task 3 - adapted by Soroush Abdollahi");
		Date date = new Date();
        System.out.println("Executed on: "+date.toString());
        //printMeanExecutionTimeGrowthTable(41, 10000000, 10000000, 100000000);
//        printMeanExecutionTimeGrowthTable(41, 100000000, 10000000, 200000000);
        printMeanExecutionTimeGrowthTable(10, 100000000, 100000000, 1000000000);
	}
}
