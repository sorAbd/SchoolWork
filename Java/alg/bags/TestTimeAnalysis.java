/**
 * 
 */
package alg.bags;

import java.util.Date;

import alg.analysis.Stopwatch;

/**
 * Test the {@link TimeAnalysis} class with a linear algorithm
 * @author Soroush Abdollahi
 */
public class TestTimeAnalysis {

	 
    /**
     * Analyzes the execution time for the addition of the first n integers (1 + 2+
     * ... + maxValueAdded).
     * 
     * @param name - name of experiment
     * @param numberOfExecutions - How many times the operation is repeated to get an estimation of the mean time.
     * @param maxValueAdded - The value up which the numbers are added
     */
    public static TimeAnalysis testAddition(String name, int numberOfExecutions, int maxValueAdded) {
        Stopwatch watch = new Stopwatch();
        TimeAnalysis ta = new TimeAnalysis(name, numberOfExecutions);
        for (int trial = 0; trial < numberOfExecutions; trial++) {
            watch.startWatch();
            // start of tested code
            @SuppressWarnings("unused")
            double sum = 0;
            for (int i = 1; i <= maxValueAdded; i++) {
                sum += i;
            }
            // end of tested code 
            long time = watch.elapsedTime();
            ta.add(time);
        }
        return ta;
    }
    /**
     * Makes a table regarding the trials and integer used
     * 
     * @param executions - number of times executed
     * @param maxValueAdded - The value up which the numbers are added
     */
    public static void printMeanExecutionTimeTable(int[] executions, int maxValueAdded) {
    	String name = "Add the first "+ maxValueAdded + " integers";
    	System.out.println("|------|------|------|-------|----------------|");
    	System.out.println("| Exec |  Min |  Max |  Mean |       CI       |");
    	System.out.println("|------|------|------|-------|----------------|");
    	for (int i=0; i<executions.length; i++) {
    		TimeAnalysis ta = testAddition(name, executions[i], maxValueAdded);
    		System.out.printf("| %4d | %4d | %4d | %5.1f | (%5.1f, %5.1f) |\n" ,
    				(long)ta.size(), ta.getMinTime(), ta.getMaxTime(), 
    				ta.getMeanTime(),ta.getMinMean999Confidence(), ta.getMaxMean999Confidence());
    	}
    	System.out.println("|------|------|------|-------|----------------|");
    }
    
    public static void testAdditionExecutionsTable(int maxValueAdded, int[] numberOfExecutions) {
        
    }

    /**
     * Test the stopwatch with computing the sum of the first 10 millions integers as
     * a double.
     * 
     * @param args - not used
     */
    public static void main(String[] args) {
    	//System.out.println("Stop Watch - Task 3 - by Soroush Abdollahi");
    	//System.out.println("Time analysis comparison - Task 4 - by Soroush Abdollahi");
    	//System.out.println("Time analysis comparison 100M - A31 Task 5a - adapted by Soroush Abdollahi");
    	//System.out.println("Time analysis comparison 1B - A31 Task 5b - adapted by Soroush Abdollahi");
//    	System.out.println("Time analysis comparison 10M - A31 Task 6 - adapted by Soroush Abdollahi");
    	//System.out.println("Time analysis comparison 100M - A31 Task 7 - adapted by Soroush Abdollahi");
    	System.out.println("Time analysis comparison 1B - A31 Task 8 - adapted by Soroush Abdollahi");
    	Date date = new Date();
	    System.out.println("Executed on: "+date.toString());
	    printMeanExecutionTimeTable(new int[] {11, 21, 41, 81, 101, 1001} ,1000000000); 
//    	TimeAnalysis ta11 = testAddition(11, 10000000);
//        ta11.printStatistics();
//    	TimeAnalysis ta101 = testAddition(101, 10000000);
//        ta101.printStatistics();
//    	TimeAnalysis ta1001 = testAddition(1001, 10000000);
//        ta1001.printStatistics();
//    	TimeAnalysis ta11 = testAddition(11, 1000000000);
//        ta11.printStatistics();
//    	TimeAnalysis ta101 = testAddition(101, 1000000000);
//        ta101.printStatistics();
//    	TimeAnalysis ta1001 = testAddition(1001, 1000000000);
//        ta1001.printStatistics();
//        TimeAnalysis ta21 = testAddition(21, 10000000);
 //       ta21.printStatistics();
 //       TimeAnalysis ta41 = testAddition(41, 10000000);
 //       ta41.printStatistics();
//        TimeAnalysis ta101 = testAddition(101, 10000000);
//        ta101.printStatistics();
    }
}
