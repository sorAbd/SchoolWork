
package a01_data_struture.s1_bags;
import java.util.Date;

/**
 * Test methods for any type of bag
 * @ author Soroush Abdollahi
 */
public class TestBag {

	/**
	 * Generic test for the method isEmpty
	 * @param <Item> The generic type of elements in the bag
	 * @param bag The initial bag
	 * @param items An array of items to be added
	 */
	public static <Item> void testIsEmpty(Bag<Item> bag, Item[] items) {
		System.out.println("Initial Bag: "+bag.toString());
		System.out.println("Bag is emtpy: "+bag.isEmpty());
		for (int i=0; i<items.length; i++) {
			System.out.println("Add item: "+items[i]);
			bag.add(items[i]);
			System.out.println("Bag: "+bag.toString());
			System.out.println("Bag is emtpy: "+bag.isEmpty());
		}
	}
	
	/**
	 * Generic test for the method isSingleton
	 * @param <Item> The generic type of elements in the bag
	 * @param bag The initial bag
	 * @param items An array of items to be added
	 */
	public static <Item> void testIsSingleton(Bag<Item> bag, Item[] items) {
		System.out.println("Initial Bag: "+bag.toString());
		System.out.println("Bag is singleton: "+bag.isSingleton());
		for (int i=0; i<items.length; i++) {
			System.out.println("Add item: "+items[i]);
			bag.add(items[i]);
			System.out.println("Bag: "+bag.toString());
			System.out.println("Bag is singleton: "+bag.isSingleton());
		}
	}	
	
	/**
	 * Generic test for the method add
	 * @param <Item> The generic type of elements in the bag
	 * @param bag The initial bag
	 * @param items An array of items to be added
	 */
	public static <Item> void testAdd(Bag<Item> bag, Item[] items) {
		System.out.println("Initial Bag: "+bag.toString());
		for (int i=0; i<items.length; i++) {
			System.out.println("Add item: "+items[i]);
			bag.add(items[i]);
			System.out.println("Bag: "+bag.toString());
		}
	}		

	public static <Item> void testMaxFreq(Bag<Item> bag, Item[] items) {
		System.out.println("Initial Bag: "+bag.toString());
		System.out.println("Max Freq: "+bag.maxFreq());
		for (int i=0; i<items.length; i++) {
			System.out.println("Add item: "+items[i]);
			bag.add(items[i]);
			System.out.println("Bag: "+bag.toString());
			System.out.println("Max Freq: "+bag.maxFreq());
		}
	}
	
	/**
	 * Main method performing all the tests.
	 * @param args - not used
	 */	
	public static void main(String[] args) {
//		System.out.println("Dynamic Capacity Bag - A12 Task 2a - by Soroush Abdollahi");
		Date date = new Date();
		System.out.println("Executed on: "+date.toString());
//		String[] items = {"ab", "bc", "cd", "de", "ef"};
//		FixedCapacityBag<String> fixed1 = new FixedCapacityBag<>(5);
//		testIsEmpty(fixed1,items);
//		Double[] items2 = {22.2, 11.1, 33.3, 44.4, 55.5};
//		DynamicCapacityBag<Double> dcb = new DynamicCapacityBag<>(2);
//		testIsSingleton(dcb,items2);
//		System.out.println("Dynamic Capacity Bag - A13 Task 1a - by Soroush Abdollahi");
//		String[] items3 = {"ab", "bc", "cd", "de", "ef", "fg"};
//		LinkedListBag<String> llb = new LinkedListBag<>();
//		testAdd(llb,items3);
		System.out.println("Linked List Bag - A13 Task 2a - by Soroush Abdollahi");
		String[] items = {"one", "two", "three", "four", "two", "three", "four", "three", "four", "four", "four"};
		FixedCapacityBag<String> fixBag = new FixedCapacityBag<>(11);
		testMaxFreq(fixBag, items);
		DynamicCapacityBag<String> dynBag = new DynamicCapacityBag<>(2);
		testMaxFreq(dynBag, items);
		LinkedListBag<String> linkBag = new LinkedListBag<>();
		testMaxFreq(linkBag, items);		
	}		
}
