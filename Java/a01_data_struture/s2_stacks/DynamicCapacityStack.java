/**
 * Module A01 Data Structures: Bags, Queues and Stacks.
 * Section 2: Stacks
 */
package a01_data_struture.s2_stacks;

import java.util.Iterator;

/**
 * A stack with a dynamic capacity. The capacity is modified based on the current number of 
 * elements. It may increase or decrease as needed.
 * 
 * @author Soroush Abdollahi
 * @version 1
 */
public class DynamicCapacityStack<Item> implements Stack<Item> {

	/**
	 * The array of elements stored in the stack.
	 */
	private Item[] elements;
	
	/**
	 * The current number of elements stored in the stack.
	 */
	private int numberOfElements;
	
	/**
	 * Creates a stack with the specified initial capacity.
	 * @param initialCapacity The initial capacity of the stack
	 */
	@SuppressWarnings("unchecked")
	public DynamicCapacityStack(int initialCapacity) {
		elements = (Item[])new Object[initialCapacity];
		numberOfElements=0;
	}
	
	/**
	 * Creates a stack with the default initial capacity
	 */
	public DynamicCapacityStack() {
		this(10);
	}
	
	/**
	 * Double the capacity of the current stack
	 */
	private void doubleCapacity() {
		@SuppressWarnings("unchecked")
		Item[] newElements = (Item[])new Object[elements.length*2];
		for(int i=0; i<elements.length; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
	}
	
	/**
	 * Half the capacity of the current stack
	 */
	private void halfCapacity() {
		if (numberOfElements >= elements.length/2) {
			throw new RuntimeException("Stack is more than half full");
		}
		@SuppressWarnings("unchecked")
		Item[] newElements = (Item[])new Object[elements.length/2];
		for(int i=0; i<numberOfElements; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
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


	/**
	 * add an item to a stack
	 * if the stack is full, double the capacity
	 * 
	 * @param item - the item being added to the stack
	 */
	@Override
	public void push(Item item) {
		if (numberOfElements == elements.length)
				doubleCapacity();
		elements[numberOfElements++] = item;
		
	}
	
	/**
	 * takes an item out of the stack from the top
	 * shrinks the stack based on how many elements are in the stack
	 * 
	 * @return the top item removed from the stack
	 */
	@Override
	public Item pop() {
		if (numberOfElements==0)
			throw new RuntimeException("Stack is empty");
		numberOfElements--;
		Item top = elements[numberOfElements];
		elements[numberOfElements]=null;
		if (numberOfElements<elements.length/4 && elements.length>10) {
			halfCapacity();
		}
		return top;
	}
	
	/**
	 * gives the size of the stack
	 * 
	 * @return the size of the stack (integer)
	 */
	@Override
	public int size() {
		return numberOfElements;
	}

}
