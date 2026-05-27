/**
 * Class: Encryption Time Analysis
 */
package proj;

import alg.analysis.Stopwatch;
import alg.bags.TimeAnalysis;
import sort.insert.InsertionSort;
import util.array.ArrayUtility;

/**
 * Class that does a Time Analysis on the 3DES and AES encryption.
 * 
 * @author Soroush Abdollahi
 */
public class EncryptionTimeAnalysis {

	/**
	 * A Time Analysis of the AES encryption algorithm
	 * 
	 * @param name - name of the test 
	 * @param numberOfExecutions - amount of times executed
	 * @param intput - name of the input file
	 * @param output - name of the output file
	 * @return - the time analysis of the test
	 */
	   public static TimeAnalysis AESmeanTime(String name, int numberOfExecutions, String intput, String output) {
	        Stopwatch watch = new Stopwatch();
	        TimeAnalysis ta = new TimeAnalysis(name, numberOfExecutions);
	        for (int trial = 1; trial <= numberOfExecutions; trial++) {
	            watch.startWatch();
	            AES.doEncrypt(intput, output);
	            long time = watch.elapsedTime();
	            ta.add(time);
	        }
	        return ta;
	    }
	   
	   /**
	    *  A Time Analysis of the 3DES encryption algorithm
	    * 
	    * @param name - name of the test
	    * @param numberOfExecutions - amount of executions
	    * @param input - name of the input file
	    * @param output - name of the output file
	    * @param key - key used
	    * @return - time analysis of test 
	    */
	   public static TimeAnalysis TriDESmeanTime(String name, int numberOfExecutions, String input, String output, String key) {
	        Stopwatch watch = new Stopwatch();
	        TimeAnalysis ta = new TimeAnalysis(name, numberOfExecutions);
	        for (int trial = 1; trial <= numberOfExecutions; trial++) {
	        	watch.startWatch();
	            TripleDES.doEncrypt(input, output, key);
	            long time = watch.elapsedTime();
	            ta.add(time);
	        }
	        return ta;
	    }
	   
	   /**
	    * prints a table for the test
	    *
	    * @param numberOfExecutions - amount of executions
	    * @param input - name of the input file
	    * @param output - name of the output file
	    */
	   public static void printMeanEncryptionTimeAESTable (int numberOfExecutions,String input, String output) {
	        System.out.println("Mean execution time table");
	        System.out.println("  - Method: Encryption using AES");
	        System.out.println("  - Sample size for time estimation: "+numberOfExecutions);
	        System.out.println("|---------------------|---------|");
	        System.out.println("| Execution Round     |   Mean  |");
	        System.out.println("|---------------------|---------|");
	        for (int n=1; n<=numberOfExecutions;n++) {
	            String name = "AES test";
	            TimeAnalysis ta = AESmeanTime(name, 3, input, output);
	            System.out.printf("| %9d | %6.1f |\n", n,  ta.getMeanTime());
	        }
	        System.out.println("|---------------------|---------|");
	    }
	   
	   /**
	    * Prints a table for the test
	    * 
	    * @param numberOfExecutions - amount of executions
	    * @param input - name of the input file
	    * @param output - name of the output file
	    * @param key - key used
	    */
	   public static void printMeanEncryptionTime3DESTable (int numberOfExecutions,String input, String output, String key) {
	        System.out.println("Mean execution time table");
	        System.out.println("  - Method: Encryption using 3DES");
	        System.out.println("  - Sample size for time estimation: "+numberOfExecutions);
	        System.out.println("|-----------------|---------|");
	        System.out.println("| Execution Round |   Mean  |");
	        System.out.println("|-----------------|---------|");
	        for (int n=1; n<=numberOfExecutions;n++) {
	            String name = "3DES test";
	            TimeAnalysis ta = TriDESmeanTime(name, 3, input, output,key);
	            System.out.printf("| %15d | %6.1f |\n", n,  ta.getMeanTime());
	        }
	        System.out.println("|-----------------|---------|");
	   }
	   
	   public static void main(String[] args) {
//		   printMeanEncryptionTimeAESTable(10,
//				   "C:\\Users\\Soroush Abdollahi\\ait-512-2025-fall\\AIT512\\src\\proj\\AES_files\\Unencrypted.txt", 
//				   "C:\\Users\\Soroush Abdollahi\\ait-512-2025-fall\\AIT512\\src\\proj\\AES_files\\Encrypted.txt");

//		   printMeanEncryptionTime3DESTable(10,
//				   "C:\\Users\\Soroush Abdollahi\\ait-512-2025-fall\\AIT512\\src\\proj\\3DES\\Unencrypted.txt", 
//				   "C:\\Users\\Soroush Abdollahi\\ait-512-2025-fall\\AIT512\\src\\proj\\3DES\\Encrypted.txt",
//				   "123456789012345678901234");
	   }
	   
}
