package a01_data_struture.s1_bags;

import java.util.Date;

/**
 * Testing class for various types of bags.
 * @ author Soroush Abdollahi
 */

public class TestBags {
	
	/**
	 * Basic test of a fixed capacity bag.
	 */
	public static void testFixedCapacityBag() {
		//create bag with String objects
		System.out.println("Create an empty bag with capacity 5");
		FixedCapacityBag<String> bag = new FixedCapacityBag<>(5);
		System.out.println("Bag " +bag.toString());
		System.out.println("Add the item: book");
		bag.add("book");
		System.out.println("Bag: "+ bag.toString());
		System.out.println("Add the item: bag, computer, phone, key");
		bag.add("bag");
		bag.add("computer");
		bag.add("phone");
		bag.add("key");
		System.out.println("Bag: "+ bag.toString());
		//check to see if only one item is in the bag
		System.out.println("Bag is singleton: "+bag.isSingleton());
		//check to see how many items in the bag start with "b"
		System.out.println("How many items start with b?");
		int count=0;
		for (String item: bag) {
			if(item.charAt(0)=='b') count++;
		}
		System.out.println("There are "+count+" items that start with b.");
	}
	
	/**
	 * Basic test of a dynamic capacity bag.
	 */
	public static void testDynamicCapacityBag() {
		//create bag with String objects
		System.out.println("Create an empty bag with capacity 5");
		Bag<String> bag = new DynamicCapacityBag<>();
		System.out.println("Bag " +bag.toString());
		System.out.println("Add the item: book");
		bag.add("book");
		System.out.println("Bag: "+ bag.toString());
		System.out.println("Add the item: bag, computer, phone, key");
		bag.add("bag");
		bag.add("computer");
		bag.add("phone");
		bag.add("key");
		System.out.println("Bag: "+ bag.toString());
		System.out.println("Add the sixth item: money");
		bag.add("money");
		System.out.println("Bag: "+ bag.toString());
		//check to see if only one item is in the bag
		System.out.println("Bag is singleton: "+bag.isSingleton());
		//check to see how many items in the bag start with "b"
		System.out.println("How many items start with b?");
		int count=0;
		for (String item: bag) {
			if(item.charAt(0)=='b') count++;
		}
		System.out.println("There are "+count+" items that start with b.");
		System.out.println(bag.toString("Bag: ", ".",", "));
	}
	
	/**
	 * Test of a Fixed Capacity Bag
	 */
	public static void testFixedIntegerBag() {
		System.out.println("Create an integer empty bag with capacity 6");
		FixedCapacityBag<Integer> bag = new FixedCapacityBag<>(6);
		System.out.println("Bag " +bag.toString());
		System.out.println("Add the item: 69");
		bag.add(69);
		System.out.println("Bag: "+ bag.toString());
		System.out.println("Add the item: 96, 12, 78, 58, 55");
		bag.add(96);
		bag.add(12);
		bag.add(78);
		bag.add(58);
		bag.add(55);
		System.out.println("Bag: "+ bag.toString());
	}
	
	/**
	 * Method used to test a fixed capacity bag of doubles
	 */
	public static void testFixedDouble() {
		System.out.println("Create an empty of doubles bag with capacity 6");
		FixedCapacityBag<Double> bag = new FixedCapacityBag<>(7);
		System.out.println("Bag " +bag.toString());
		System.out.println("Add the item: 69.69");
		bag.add(69.69);
		System.out.println("Bag: "+ bag.toString());
		System.out.println("Add the item: 96.96, 12.12, 78.78, 58.58, 55.55");
		bag.add(96.96);
		bag.add(12.12);
		bag.add(78.78);
		bag.add(58.58);
		bag.add(55.55);
		System.out.println("Bag: "+ bag.toString());
	}
	
	/**
	 * Method used to test 
	 */
	public static void test4() {
		System.out.println("Create an empty of longs bag with capacity 6");
		FixedCapacityBag<Long> bag = new FixedCapacityBag<>(5);
		System.out.println("Bag " +bag.toString());
		System.out.println("Add the item: 1*10^10");
		bag.add(1*10000000000L);
		System.out.println("Bag: "+ bag.toString());
		System.out.println("Add the items: 2*10^10, 3*10^10, 4*10^10");
		bag.add(2*10000000000L);
		bag.add(3*10000000000L);
		bag.add(4*10000000000L);
		System.out.println("Bag: "+ bag.toString());
		System.out.println("Bag is singleton: "+bag.isSingleton());
		if (bag.isSingleton()) System.out.println("size of bag is " + bag.size());
	}
	
	/**
	 * test of a bag of any kind
	 */
	public static void testBag(Bag<String> bag) {
		System.out.println("Bag " +bag.toString());
		System.out.println("Add the item: book");
		bag.add("book");
		System.out.println("Bag: "+ bag.toString());
		System.out.println("Add the item: bag, computer, phone, key");
		bag.add("bag");
		bag.add("computer");
		bag.add("phone");
		bag.add("key");
		System.out.println("Bag: "+ bag.toString());
		try {
			System.out.println("Add the sixth item: money");
			bag.add("money");
			System.out.println("Bag: "+ bag.toString());
		}catch(Exception e) {
			System.out.println("Error trying to add the sixth item: "+e.getMessage());
		}
		//check to see if only one item is in the bag
		System.out.println("Bag is singleton: "+bag.isSingleton());
		//check to see how many items in the bag start with "b"
		System.out.println("How many items start with b?");
		int count=0;
		for (String item: bag) {
			if(item.charAt(0)=='b') count++;
		}
		System.out.println("There are "+count+" items that start with b.");
		System.out.println(bag.toString("Bag: ", ".",", "));
	}
	
	public static void testStrings(String name1, String name2, String name3, String name4, String name5) {
		System.out.println("Create an empty bag of strings with capacity 5");
		FixedCapacityBag<String> bag = new FixedCapacityBag<>(5);		
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
	 * Main methods for performing all the tests
	 * @param arguments - not used
	 */
	public static void main(String[] arguments) {
		//System.out.println("Fixed Capacity Bag - Task 1a - adapted by Soroush Abdollahi");
		Date date = new Date();
		//System.out.println("Executed on: "+date.toString());
		//testFixedCapacityBag();
		//System.out.println("Fixed Integer Bag - Task 1b - adapted by Soroush Abdollahi");
		//System.out.println("Executed on: "+date.toString());
		//testFixedIntegerBag();
		//System.out.println("Fixed Capacity Bag - Task 2.b - adapted by Soroush Abdollahi");
		//System.out.println("Executed on: "+date.toString());
		//testFixedDouble();
		//System.out.println("Fixed Capacity Bag - Task 3a - adapted by Soroush Abdollahi");
		//System.out.println("Executed on: "+date.toString());
		//System.out.println("Fixed Capacity Bag - Task 3b - adapted by Soroush Abdollahi");
		//System.out.println("Executed on: "+date.toString());
		//test4();
//		System.out.println("Fixed Capacity Bag - Task 4a - adapted by Soroush Abdollahi");
//		System.out.println("Executed on: "+date.toString());
//		testStrings("phone", "cap", "computer", "book", "key");
//		testDynamicCapacityBag();
		Bag<String> b1 = new FixedCapacityBag<>(5);
		Bag<String> b2 = new DynamicCapacityBag<>(5);
		Bag<String> b3 = new LinkedListBag<>();
		testBag(b3);
		
	}
}
