/**
 * Module 1A bags 
 */
package a01_data_struture.s1_bags;

import java.util.Date;
/**
 * Tests for the Dynamic Capacity Bag Class
 * @ author Soroush Abdollahi
 */
public class TestDynamicCapacityBag {
	
	/**
	 * Basic test of a dynamic capacity bag of 5 strings.
	 */
	public static void test1() {
		System.out.println("Create an empty bag of strings with capacity 2");
		DynamicCapacityBag<String> bag = new DynamicCapacityBag<String>(2);		
		System.out.println("Bag: "+bag.toString());
		System.out.println("Bag is singleton: "+bag.isSingleton());
		
		System.out.println("Add the item: book");
		bag.add("book");
		System.out.println("Bag: "+bag.toString());
		System.out.println("Bag is singleton: "+bag.isSingleton());
		
		System.out.println("Add the items: bag, computer, phone, key");
		bag.add("bag");
		bag.add("computer");
		bag.add("phone");
		bag.add("key");
		System.out.println("Bag: "+bag.toString());
		System.out.println("Bag is singleton: "+bag.isSingleton());
		
		System.out.println("How many items start with b?");
		int count=0;
		// We can use this form of for statement because Bag is iterable.
		for (String item: bag) {
			if (item.charAt(0)=='b') count++;
		}
		System.out.println("There are "+count+" items that start with b.");
	}
	
	/**
	 * Basic test of a dynamic capacity bag of strings.
	 * @param name1 The first item in the test
	 * @param name2 The second item in the test
	 * @param name3 The third item in the test
	 * @param name4 The fourth item in the test
	 * @param name5 The fifth item in the test
	 */
	public static void testStrings(String name1, String name2, String name3, String name4, String name5) {
		System.out.println("Create an empty bag of strings with capacity 5");
		DynamicCapacityBag<String> bag = new DynamicCapacityBag<>(2);			
		System.out.println("Bag: "+bag.toString());
		System.out.println("Bag is singleton: "+bag.isSingleton());
		System.out.println("Add the item: "+name1);
		bag.add(name1);
		System.out.println("Bag: "+bag.toString());
		System.out.println("Bag is singleton: "+bag.isSingleton());
		System.out.println("Add the items: "+name2+", "+name3+", "+name4+", "+name5);
		bag.add(name2);
		bag.add(name3);
		bag.add(name4);
		bag.add(name5);
		System.out.println("Bag: "+bag.toString());
		System.out.println("Bag is singleton: "+bag.isSingleton());
		System.out.println("How many items start with b?");
		int count=0;
		for (String item: bag) {
			if (item.charAt(0)=='b') count++;
		}
		System.out.println("There are "+count+" items that start with b.");
	}
	
	/**
	 * Main method performing all the tests.
	 * @param args - not used
	 */
	public static void main(String[] args) {
		//System.out.println("Dynamic Capacity Bag - A12 Task 1a - adapted by Soroush Abdollahi");
		Date date = new Date();
		System.out.println("Executed on: "+date.toString());
		//test1();
		System.out.println("Dynamic Capacity Bag - A12 Task 1b - adapted by Soroush Abdollahi");
		testStrings("ab", "bc", "cd", "de", "ef");
	}
	
}
