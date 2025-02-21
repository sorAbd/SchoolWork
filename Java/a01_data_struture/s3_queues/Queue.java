/**
 * Module A01 Data Structures: Bags, Queues and Stacks.
 * Section A01-3: Queue
 * Activity A01-310: Fixed Capacity 
 */
package a01_data_struture.s3_queues;

/**
 * A queue is keeping a collection of items.
 * You can add items at the end of the queue.
 * You can remove items from the beginning of the queue.
 * First In First Out (FIFO) policy.
 * When we iterate the elements of the queue we will start from
 * the beginning of the queue and end with the end of the queue.
 * 
 * @param <Item> The type of elements in the queue. Any Object.
 * 
 * @author Soroush Abdollahi
 * @version 1
 * 
 */
public interface Queue<Item> extends Iterable<Item> {
	
	/**
	 * Add an item at the end of the queue.
	 * @param item the Item to be added
	 */
	public void enqueue(Item item);
	
	/**
	 * Remove and return the item from the beginning of the queue.
	 * @return the next item in the queue (from the beginning)
	 */
	public Item dequeue();
	
	/**
	 * The number of elements in the queue is named the sized of the queue
	 * @param the size of the queue
	 */
	public int size();
	
	/**
	 * Check if a queue is empty (no elements in the queue)
	 * @return true if the queue is empty
	 */
	default public boolean isEmpty() {
		return size()==0;
	}
	
	/**
	 * Creates a string representation of the queue, starting with the start queue, 
	 * ending with the end queue and separating the with the separator.
	 * The method will display the elements starting with the base of the queue
	 * (first element added).
	 * 
	 * @param start - included at the beginning
	 * @param end - included at the end
	 * @param separator = included between elements
	 * @return the generated string
	 */
	default public String toString(String start, String end, String separator) {
		String result = start;
		boolean needSeparator = false;
		for (Item item: this) {
			if(needSeparator) {
				result+=separator;
			} else {
				needSeparator=true;
			}
			result+= item.toString();
		}
		result+=end;
		return result;
	}
}
