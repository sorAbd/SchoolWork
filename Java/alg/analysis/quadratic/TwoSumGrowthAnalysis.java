package alg.analysis.quadratic;

import java.util.Date;

import alg.analysis.Stopwatch;
import alg.bags.TimeAnalysis;

/**
 * analyzes the quadratics of the TwoSum
 * 
 * @author Soroush Abdollahi
 */
public class TwoSumGrowthAnalysis {

    /**
     * converts an int array as a string
     * @param a - an int array
     * @return - an array of ints as a string
     */
	public static String arrayToString(int[] a) {
        String result = "[";
        String separator = "";
        for (int item: a) {
            result += separator + item;
            separator = " ";
        }
        result += "]";
        return result;
    }
	
	/**
	 * method to generate a random array
	 * @param numberOfElements - number of elements to be in the array
	 * @param startNumber - lower bound of numbers (inclusive)
	 * @param endNumber - upper bound of numbers (inclusive)
	 * @return - a random array
	 */
    public static int[] generateRandomArray(int numberOfElements, int startNumber, int endNumber) {
        if (endNumber-startNumber<numberOfElements) throw new RuntimeException("Too small interval");
        int[] a = new int[numberOfElements];
        for (int i=0; i<numberOfElements; i++) {
            int val;
            boolean found;
            do {
                val = (int)(Math.random()*(1.0+endNumber-startNumber)) + startNumber;
                found = false;
                for (int j=0; !found && j<i; j++) {
                    found = (val == a[j]);
                }
            } while (found);
            a[i]=val;
        }
        return a;
    }
    
    /**
     * performs a time analysis for the count method in twoSum, given a number of executions
     * 
     * @param name - name of the test
     * @param numberOfExecutions - number of times the test is ran
     * @param numberOfElements - number of elements in the array
     * @return - a time analysis
     */
    public static TimeAnalysis testTwoSum(String name, int numberOfExecutions, int numberOfElements) {
        Stopwatch watch = new Stopwatch();
        TimeAnalysis ta = new TimeAnalysis(name, numberOfExecutions);
        for (int trial = 0; trial < numberOfExecutions; trial++) {
            // building the test array
            int[] a = generateRandomArray(numberOfElements, -numberOfElements, numberOfElements);
            watch.startWatch();
            // start of the tested code
            TwoSum.count(a);
            // end of the tested code
            long time = watch.elapsedTime();
            ta.add(time);
        }
        return ta;
    }
    
    
    /**
     * prints out a table for the execution time growth
     * @param numberOfExecutions - number of trials
     * @param minValue - value it starts at
     * @param increment - increment from start value
     * @param maxValue - end value, where incrementing stops
     */
    public static void printMeanExecutionTimeGrowthTable(int numberOfExecutions, int minValue, int increment,
            int maxValue) {
        System.out.println("Mean execution time growth table");
        System.out.println("  - Method: Two sum for a random array of size N");
        System.out.println("  - Sample size for time estimation: "+numberOfExecutions);
        System.out.println("|-----------|--------|------|------|------------------|");
        System.out.println("|         N |   Mean |  Min |  Max |         CI 99.9% |");
        System.out.println("|-----------|--------|------|------|------------------|");
        for (int n=minValue; n<=maxValue; n+=increment) {
            String name = "Add the first " + n + " integers";
            TimeAnalysis ta = testTwoSum(name, numberOfExecutions, n);
            System.out.printf("| %9d | %6.1f | %4d | %4d | (%6.1f, %6.1f) |\n", n,  ta.getMeanTime(), 
                    ta.getMinTime(), ta.getMaxTime(), ta.getMinMean999Confidence(), ta.getMaxMean999Confidence());
        }
        System.out.println("|-----------|--------|------|------|------------------|");
    }
    
    public static void main(String[] args) {
    	
//        System.out.println("Test random arrays:");
//        for (int n=5; n<26; n+=5) {
//            int[] a = generateRandomArray(n, -25, 25);
//            System.out.println("Size "+n+": "+arrayToString(a));
 //       }
//        TimeAnalysis ta = testTwoSum("test1", 41, 10000);
//        ta.printStatistics();
		//System.out.println("Quadratic Growth - Task 4 - by Soroush Abdollahi");
    	//System.out.println("Quadratic Growth - Task 5 - by Soroush Abdollahi");
    	//System.out.println("Quadratic Growth - Task 6 - by Soroush Abdollahi");
    	//System.out.println("Cubic Growth - Task 7 - by Soroush Abdollahi");
    	//System.out.println("Cubic Growth - Task 8 - by Soroush Abdollahi");
    	System.out.println("Cubic Growth - Task 9 - by Soroush Abdollahi");
    	Date date = new Date();
        System.out.println("Executed on: "+date.toString());
        printMeanExecutionTimeGrowthTable(31, 500, 500, 5000);
      }
}
