/**
 * Module A02: Analysis of Algorithms
 * Section 1 : Measure Execution Time
 * Task 2a : Mean Execution Time
 */

package alg.bags;
import java.util.Iterator;


/**
 * Record and analyze the duration of a set of repeated execution of the same algorithm.
 * Stored as a fixed capacity bag of long values. Works in two phases.
 * First phase - collects the results of execution.
 * Second phase - analyzes the results using on-demand strategy
 * no thread safe is implemented
 * 
 * @author Soroush Abdollahi
 */
public class TimeAnalysis extends FixedCapacityBag<Long>{

	/**
	 * name of the method to be tested
	 */
	private String name;
	
	/**
	 * True if statistics are already computed
	 */
	private boolean statComputed = false;
	
	/**
	 * The minimum execution time
	 */
	private long min;
	
	/**
	 * Maximum execution time
	 */
	private long max;
	
	/**
	 * The sum of execution times as a double
	 */
	private double sum;
	
	/**
	 * The sample mean execution time
	 */
	private double mean;
	
	/**
	 * sample of variance of the execution time
	 */
	private double variance;
	
	/**
	 * sample of std. dev. of the execution time
	 */
	private double standardDeviation;
	
	/**
	 * minimum mean execution time with 99.9% confidence. left value of confidence interval.
	 */
	private double minMean999Confidence;
	
	/**
	 * maximum mean execution time with 99.9% confidence. left value of the confidence interval.
	 */
	private double maxMean999Confidence;
	
	/**
	 * constructor class for the timeAnalysis; time class for provided number of executions
	 * 
	 * @param name - name of method tested
	 * @param numberOfExecutions - number of executions to be tested
	 */
	
	public TimeAnalysis(String name,int numberOfExecutions) {
		super(numberOfExecutions);
		if(numberOfExecutions<1)
			throw new RuntimeException("At least one execution expected");
		this.name=name;
	}

	/**
	 * Creates a full bag with the provided execution times
	 * @param name - name of the method that is tested
	 * @param executionTimes - array of longs with the execution times in ms
	 */
	public TimeAnalysis(String name, long[] executionTimes) {
		this(name,executionTimes.length);
		for (long v : executionTimes) {
			add(v);
		}
		computeStatistics();
	}
	
	/**
	 * Check if the execution phase ended and the analysis may be performed. The
	 * execution is done when all the execution times are collected
	 */
	private void checkExecutionEnded() {
		if (size() < getCapacity())
			throw new RuntimeException("Not all experiements performed (only "+size()+ " out of ");
	}
	
	/**
	 * Compute the following statistics if the executions ended and they are not already computed:
	 * 
	 * minimum execution time
	 * maximum execution time
	 * mean execution time
	 * sample standard deviation
	 * 99.9% conf. interval
	 */
	private void computeStatistics() {
		checkExecutionEnded();
		if(statComputed)
			return;
		Iterator<Long> iterator = iterator();
		long firstValue = iterator.next();
		min=firstValue;
		max=firstValue;
		sum=firstValue;
		while(iterator.hasNext()) {
			long value = iterator.next();
			if(min>value)
				min = value;
			else if (max < value)
				max=value;
			sum += value;
		}
		mean = sum/getCapacity();
		
		variance = 0;
		for(long value :this) {
			variance += (value - mean) * (value - mean);
		}
		variance = variance / (getCapacity() - 1);
		standardDeviation = Math.sqrt(variance);
		
		double e = tValue999(getCapacity()-1) * standardDeviation / Math.sqrt(getCapacity());
		minMean999Confidence = mean-e;
		maxMean999Confidence = mean+e;
		
		statComputed = true;
		}
	
	/**
	 * Computer (if needed) and return the minimum execution time recorded
	 * 
	 * @return the minimum execution time in milliseconds as a long
	 */
	public long getMinTime() {
		computeStatistics();
		return min;
	}
	
	/**
	 * Computer (if needed) and return the max execution time recorded
	 * 
	 * @return the max execution time in milliseconds as a long
	 */
	public long getMaxTime() {
		computeStatistics();
		return max;
	}
	
	/**
	 * Computer (if needed) and return the mean execution time recorded
	 * 
	 * @return the mean execution time in milliseconds as a long
	 */
	public double getMeanTime() {
		computeStatistics();
		return mean;
	}
	/**
     * Compute (if needed) and return the sample standard deviation.
     * 
     * @return the sample standard deviation in milliseconds as a double
     */
    public double getTimeStandardDeviation() {
        computeStatistics();
        return standardDeviation;

    }

    /**
     * Compute (if needed) and return the estimated minimum mean execution time with
     * 99.9% confidence.
     * 
     * @return the estimated minimum mean execution time in milliseconds as a double
     */
    public double getMinMean999Confidence() {
        computeStatistics();
        return minMean999Confidence;
    }

    /**
     * Compute (if needed) and return the estimated minimum mean execution time with
     * 99.9% confidence.
     * 
     * @return the estimated minimum mean execution time in milliseconds as a double
     */
    public double getMaxMean999Confidence() {
        computeStatistics();
        return maxMean999Confidence;
    }

    /**
     * Print the statistics related to the stored execution times.
     */
    public void printStatistics() {
        computeStatistics();
        System.out.println("Execution Time Analysis for: " + name);
        System.out.println("  - Sample number of values       = " + size());
        System.out.println("  - Sample minimum execution time = " + min);
        System.out.println("  - Sample maximum execution time = " + max);
        System.out.println("  - Sample mean value             = " + mean);
        System.out.println("  - Sample standard deviation     = " + standardDeviation);
        System.out.println(
                "  - Mean 99.9% confidence interval: (" + minMean999Confidence + ", " + maxMean999Confidence + ")");
    }
    
    /**
     * T test value based on the degree of freedoms (keep at index 0 the value for 1
     * degree of freedom) Constants from 1 to 30 for 99.9% confidence level.
     */
    public static final double t999[] = { 636.6, 31.60, 12.92, 8.610, 6.869, 5.959, 5.408, 5.041, 4.781, 4.587, 4.437,
            4.318, 4.221, 4.140, 4.073, 4.015, 3.965, 3.922, 3.883, 3.850, 3.819, 3.792, 3.768, 3.745, 3.725, 3.707,
            3.690, 3.674, 3.659, 3.646 };
    
    /**
     * Return the T test value based on the degree of freedom.
     * 
     * @param df the degree of freedom.
     * @return the t Test value as a double
     */
    private static double tValue999(int df) {
        if (df < 1)
            throw new RuntimeException("Invalid degree of freedoms");
        if (df >= 1000)
            return 3.3;
        if (df >= 100)
            return 3.39;

        if (df >= 80)
            return 3.416;
        if (df >= 60)
            return 3.460;
        if (df >= 50)
            return 3.496;
        if (df >= 40)
            return 3.551;
        if (df >= 30)
            return 3.646;
        return t999[df - 1];
    }

    /**
     * Local test with a sample list of execution times.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        long[] a = { 1025, 1017, 1031, 1009, 1005, 1022 };
        TimeAnalysis ta = new TimeAnalysis("test", a);
        ta.printStatistics();
    }

}
	
