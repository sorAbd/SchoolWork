/**
 * Module A01: Data Structures: Bags, Queues, and Stacks.
 * Section 2: Stacks
 */
package a01_data_struture.s2_stacks;

import java.util.Iterator;

/**
 * A fixed capacity stack has a specified maximum capacity
 * When fill new elements cannot be added.
 * It will throw an error if push is called
 * @author Soroush Abdollahi
 * @version1
 * 
 * @param <Item> The type of elements in the stack
 */
public class FixedCapacityStack<Item> implements Stack<Item> {

	/**
	 * The array of elements stored in the stack
	 */
	private final Item[] elements;
	
	/**
	 * The current number of elements stored in the stack
	 * The size of the stack
	 */
	private int numberOfElements;
	
	/**
	 * Creates an empty stack with the given capacity
	 * 
	 * @param capacity - the maximum capacity of the stack
	 */
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int capacity) {
		elements = (Item[]) new Object[capacity];
		numberOfElements=0;
	}
	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {
			int index=numberOfElements-1;
			
			@Override
			public boolean hasNext() {
				return index >=0;
			}
			
			@Override
			public Item next() {
				if(hasNext())
					return elements[index--];
				throw new RuntimeException("No more elements in the stack.");
			}
		};
	}

	@Override
	public void push(Item item) {
		if (numberOfElements == elements.length)
			throw new RuntimeException("Stack is full");
		elements[numberOfElements++] = item;
	}

	@Override
	public Item pop() {
		if (numberOfElements==0)
			throw new RuntimeException("Stack is empty");
		numberOfElements--;
		Item top = elements[numberOfElements];
		elements[numberOfElements]=null;
		return top;
	}

	@Override
	public int size() {
		return numberOfElements;
	}

}
