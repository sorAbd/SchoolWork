/**
 * A33 memory analysis
 */

package alg.analysis.memory;
import alg.bags.*;
import alg.analysis.linear.*;
import alg.analysis.quadratic.*;
import alg.analysis.Stopwatch;
import java.util.Date;


/**
 * Class to test memory analysis
 * @ author Soroush Abdollahi
 */
public class TestMemoryAnalysis {
	
	/**
	 * method to calculate memory needed for 100 ints
	 * 
	 * @return double that represents bytes taken up by memory
	 */
	public static int sumInts(int integers) {
		//double value counts as 8 bytes
		int sum=8;
		for (int i=1; i<=integers; i++) {
			//each int = 4 bytes
			sum+=4;
		}
		return sum;
	}
	
	/** 
	 * calculate the sum 
	 * @param arrayCon - number of contents in the array
	 * @param intUsed - number of times an integer has been declared
	 * @return
	 */
	public static int twoSumInt(int references, int intUsed) {
		//initialize the int byte value at 0
		int intDec = 4*intUsed;
		references = references*8;
		int sum = intDec + references;
		return sum;
	}
	
	/**
	 * returns byte value for a fixed capacity bag
	 * @param objInst - amount of instances of an object
	 * @param arrayInst - amount of array instances
	 * @param arrayNum - amount values (int) in the array 
	 * @param references - amount of values referenced
	 * @param intInst - amount of times an integer is created
	 * @param integerInst - <instances of Integer>
	 * @return
	 */
	public static int fixBagInt(int objInst, int arrayInst, int arrayNum, int references, int intInst, int integerInst) {
		objInst *=16;
		arrayInst *=24;
		arrayNum *=4;
		references *=8;
		intInst *=4;
		integerInst *=24;
		//add everything up including the object padding
		int sum = objInst+arrayInst+arrayNum+references+intInst+integerInst+32;
		return sum;
	}
	
	/**
	 * returns byte value for a fixed capacity bag
	 * @param objInst - amount of instances of an object
	 * @param arrayInst - amount of array instances
	 * @param arrayNum - amount values (int) in the array 
	 * @param references - amount of values referenced
	 * @param elInst - amount of times an element is added
	 * @param intInst - amount of time an integer is initialized
	 * @return an int representing the bytes in the 
	 */
	public static int dynBagInt(int objInst, int arrayInst, int arrayNum, int references, int elInst, int intInst, int longInst) {
		objInst *=16;
		arrayInst *=24;
		arrayNum *=4;
		references *=8;
		elInst *=24;
		intInst *=4;
		longInst *=24;
		//add everything up including the object padding
		int sum = objInst+arrayInst+arrayNum+references+elInst+longInst+intInst+32;
		return sum;
	}
	
	/**
	 * returns byte value for a linked list bag
	 * @param objInst - amount of instances of an object
	 * @param arrayInst - amount of array instances
	 * @param arrayNum - amount values (int) in the array 
	 * @param references - amount of values referenced
	 * @param charInst - amount of times an element is added
	 * @param intInst - amount of time an integer is initialized
	 * @return an int representing the bytes in the 
	 */
	public static int linkedBagInt(int objInst, int arrayInst, int arrayNum, int references, int elInst, int intInst, int charInst) {
		objInst *=16;
		arrayInst *=24;
		arrayNum *=4;
		references *=8;
		charInst *=2; 
		elInst *=24*charInst;
		intInst *=4;
		//add everything up including the object padding
		int sum = objInst+arrayInst+arrayNum+references+elInst+charInst+intInst+32;
		return sum;
	}
	
	public static void main(String[] args) {
		//System.out.println("Memory Analysis - Task 1 - by Soroush Abdollahi");
		//System.out.println("Memory Analysis - Task 2 - by Soroush Abdollahi");
		//System.out.println("Memory Analysis - Task 3 - by Soroush Abdollahi");
		//System.out.println("Memory Analysis - Task 4 - by Soroush Abdollahi");
		//System.out.println("Memory Analysis - Task 5 - by Soroush Abdollahi");
		//System.out.println("Memory Analysis - Task 6 - by Soroush Abdollahi");
		System.out.println("Memory Analysis - Task 7 - by Soroush Abdollahi");
		Date date = new Date();
        System.out.println("Executed on: "+date.toString());
        //System.out.println("The amount of memory needed for 100 integers is "+sumInts(100)+ " bytes");
        //System.out.println("The amount of memory needed for the twoSum is "+twoSumInt(1,4)+ " bytes");
        //System.out.println("The amount of memory needed for the threeSum is "+twoSumInt(1,5)+ " bytes");
        //System.out.println("The amount of memory needed for the fixed capacity bag with a capacity"
        	//	+ " of 100 ints is "+fixBagInt(1,1,100,1,2,100)+ " bytes");
        //System.out.println("The amount of memory needed for the dynamic capacity bag with 23 elements added is "+ dynBagInt(1,1,10,1,23,1,23)+ " bytes");
        
        //I set this up so that each String will be 2 characters
        //System.out.println("The amount of memory needed for the linked list bag with 17 string added is "+linkedBagInt(5,1,0,1,17,1,2));
        System.out.println("The amount of memory needed for the dynamic capacity bag with 23 elements added is "+ dynBagInt(1,1,10,1,42,0,0)+ " bytes");
	}
}
