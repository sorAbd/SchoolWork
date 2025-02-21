/**
 * Module A01 Data Structures: Bags, Queues and Stacks.
 * Section A01-03: Queue
 * Activity A01-310: Fixed Capacity Queue Lecture
 */
package a01_data_struture.s3_queues;

import java.util.Iterator;

/**
 * A fixed Capacity queue has a specified maximum capacity. When full, new
 * elements cannot be added. It will throw an error of enqueue is called.
 * 
 * @param <Item> The type of elements in the queue.
 * 
 * @author Soroush Abdollahi
 * @version 1
 */
public class FixedCapacityQueue<Item> implements Queue<Item> {

	
	/**
	 * The array of elements stored in the queue. If the end of the array is
	 * reached, and there is space at the beginning, the elements will be stored
	 * the beginning. The array is circular, after the last element we continue
	 * with the first element
	 */
	private final Item[] elements;
	
	/**
	 * The current number of elements stored in the queue. The size of the stack.
	 */
	private int numberOfElements;
	
	/**
	 * The index of the first element in the queue. -1 if empty. When reaches the
	 * end of the array, resets to the beginning.
	 */
	private int startIndex;
	
	/**
	 * The index of the last element in the queue. -1 if empty. When reaches the end
	 * of the array, resets to the beginning.
	 */
	private int endIndex;
	
	/**
	 * Creates a fixed capacity queue.
	 * 
	 * @param capacity the maximum capacity (size) of the queue.
	 */
	@SuppressWarnings("unchecked")
	public FixedCapacityQueue(int capacity) {
		elements = (Item[]) new Object[capacity];
		numberOfElements = 0;
		startIndex = -1;
		endIndex = -1;
	}
	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {
			
			int nextItem = startIndex;
			
			@Override
			public boolean hasNext() {
				return nextItem != -1;
			}
			
			@Override
			public Item next() {
				if (nextItem == -1) 
					throw new RuntimeException("No more elements");
				Item item = elements[nextItem];
				if(nextItem == endIndex)
					nextItem = -1;
				else {
					nextItem++;
					if(nextItem == elements.length)
						nextItem = 0;
				}
				return item;
			}
		};
	}

	@Override
	public void enqueue(Item item) {
		if (numberOfElements == elements.length) {
			throw new RuntimeException("Queue us full");
		}
		if (numberOfElements==0) {
			startIndex=0;
			endIndex=0;
		}else {
			endIndex++;
			if(endIndex==elements.length)
				endIndex=0;
		}
		elements[endIndex] = item;
		numberOfElements++;
		
	}

	@Override
	public Item dequeue() {
		if (numberOfElements == 0) {
			throw new RuntimeException("Queue us empty");
		}
		Item item = elements[startIndex];
		elements[startIndex]=null;
		numberOfElements--;
		if (numberOfElements == 0) {
			startIndex = -1;
			endIndex = -1;
		}else {
			startIndex++;
			if (startIndex==elements.length)
				startIndex=0;
		}
		return item;
	}

	@Override
	public int size() {
		return numberOfElements;
	}

}
