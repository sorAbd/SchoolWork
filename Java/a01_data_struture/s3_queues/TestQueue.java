/**
 * Module A01 Data Structures: Bags, Queues, and Stacks.
 * Section A01-3: Queue
 * Activity A01-310: Fixed Capacity Queue
 */
package a01_data_struture.s3_queues;

import java.util.Date;

/**
 * Class to test all types of queues
 * 
 * @author Soroush Abdollahi
 * @version 1
 */
public class TestQueue {

	/**
	 * Print a detailed description of the queue.
	 */
	private static <Item> void printQueue(Queue<Item> queue, String name) {
		System.out.println("Queue: "+name);
		System.out.println("  - elements = "+queue.toString("<< ", " <<", ", "));
		System.out.println("  - size = "+queue.size());
		System.out.println("  - isEmpty = "+queue.isEmpty());
	}
	
	/**
	 * print out how the enqueue works, starts with an empty line
	 * 
	 * @param <Item> Generic type for the elements in the queue
	 * @param queue the tested queue
	 * @param item the item added
	 */
	private static<Item> void testEnqueueItem(Queue<Item> queue, String name, Item item) {
		System.out.println("\nEnqueue (add) an item to a queue");
		System.out.println("  - queue = "+name);
		System.out.println("  - item = "+item);
		try {
			queue.enqueue(item);
			System.out.println("  - add successfull");
		}catch (Exception e) {
			System.out.println("  - runtime exception: "+e.getMessage());
		}
		printQueue(queue, name);
	}
	/**
	 * print out how the dequeue works, starts with an empty line
	 * 
	 * @param <Item> Generic type for the elements in the queue
	 * @param queue queue to be tested
	 * @param name name of the queue
	 */
	private static <Item> void testDequeueItem(Queue<Item> queue, String name) {
		System.out.println("\nDequeue (remove and return) the next item from a queue");
		System.out.println("  - queue = "+name);
		try {
			Item item = queue.dequeue();
			System.out.println("  - dequeue successful");
			System.out.println("  - item = "+item.toString());
		} catch (Exception e) {
			System.out.println("  - runtime exception: "+e.getMessage());
		}
		printQueue(queue, name);
	}
	
	/**
	 * method to test string queue
	 */
	public static void testWithStrings() {
//		Queue<String> nba = new FixedCapacityQueue<>(3);
//		String nbaName = "fixed capacity queue of 3 elements";
//		printQueue(nba,nbaName);
//		testEnqueueItem(nba,nbaName, "Lebron");
//		testEnqueueItem(nba,nbaName, "Kobe");
//		testEnqueueItem(nba,nbaName, "Kareem");
//		testEnqueueItem(nba,nbaName, "Magic");
//		testDequeueItem(nba,nbaName);
//		testDequeueItem(nba,nbaName);
//		testEnqueueItem(nba,nbaName, "Magic");
//		testEnqueueItem(nba,nbaName, "Luka");
//		testDequeueItem(nba,nbaName);
//		testDequeueItem(nba,nbaName);
//		testDequeueItem(nba,nbaName);
//		testDequeueItem(nba,nbaName);
	}
	
	/**
	 * method to test integer queue
	 */
	public static void testWithIntegers() {
//        Queue<Integer> inte = new FixedCapacityQueue<>(3);
//        String inteName = "fixed capacity queue of 3 integers";
//        printQueue(inte, inteName);
//        testEnqueueItem(inte, inteName, 11);
//        testEnqueueItem(inte, inteName, 22);
//        testEnqueueItem(inte, inteName, 33);
//        testEnqueueItem(inte, inteName, 44);
//        testDequeueItem(inte, inteName);
//        testDequeueItem(inte, inteName);
//        testEnqueueItem(inte, inteName, 44);
//        testEnqueueItem(inte, inteName, 55);
//        testDequeueItem(inte, inteName);
//        testDequeueItem(inte, inteName);
//        testDequeueItem(inte, inteName);
//        testDequeueItem(inte, inteName);
	}
	
	private static <Item> void testQueue(Queue<Item> queue, String name, 
    		Item[] items1, int dequeue1, Item[] items2, int dequeue2) {
    	System.out.println("----------------------------------------");
    	System.out.println("Queue = "+name);
    	printQueue(queue, name);
        for (Item item: items1) {
        	testEnqueueItem(queue, name, item);
        }
        for (int i=1; i<=dequeue1; i++) {
        	testDequeueItem(queue, name);
        }
        for (Item item: items2) {
        	testEnqueueItem(queue, name, item);
        }
        for (int i=1; i<=dequeue2; i++) {
        	testDequeueItem(queue, name);
        }
    }
	
    /**
     * The main method for above tests.
     */
    public static void main(String[] args) {
    	//System.out.println("Fixed Capacity Queue - Task 2 - by Soroush Abdollahi");
		//System.out.println("Dynamic Capacity Queue - Task 1 - by Soroush Abdollahi");
    	System.out.println("Linked List Queue - Task 1 - by Soroush Abdollahi");
    	Date date = new Date();
		System.out.println("Executed on: "+date.toString());
//    	testWithStrings();
//    	testWithIntegers();
//    	DynamicCapacityQueue<String> nba = new DynamicCapacityQueue<>(3);
//    	testQueue(nba, "dynamic queue of strings with initial capacity 3",
//        		new String[] {"Lebron", "Kobe",  "Charles", "Paul"}, 2,
//        		new String[] {"Michael", "Scottie"}, 5
//        		);
//    	DynamicCapacityQueue<Integer> nba_num = new DynamicCapacityQueue<>(3);
//        testQueue(nba_num, "dynamic queue of integers with initial capacity 3",
//        		new Integer[] {6,23,2,3,13,33,77,4,8}, 9,
//        		new Integer[] {78,25,64,25}, 3);
		LinkedListQueue<String> l_nba= new LinkedListQueue<>();
    	testQueue(l_nba, "linked list queue of strings",
        		new String[] {"Lebron", "Kobe",  "Shaq", "Kareem"}, 2,
        		new String[] {"James", "Magic"}, 5
        		);
    	LinkedListQueue<Integer> llqi = new LinkedListQueue<>();
        testQueue(llqi, "linked list queue of integers",
        		new Integer[] {1,2,3,4,5,6,7,8}, 9,
        		new Integer[] {9,10,11,12,13}, 3);   
    }
}
