/**
 * 
 */
package a01_data_struture.s1_bags;

import java.util.Iterator;

/**
 * A fixed capacity bag. The capacity may be specified when the bag is created and cannot be changed
 * @author Soroush Abdollahi
 * 
 * @param <Item> the type of elements stored in the bag
 */
public class FixedCapacityBag<Item> implements  Bag<Item>{

	/**
	 * The array of items stored in the bag
	 */
	private final Item[] elements;
	
	/**
	 * The current number of elements stored in the bag
	 */
	private int numberOfElements;
	
	/**
	 * creates an empty bag with the given capacity
	 * @param capacity - the maximum capacity of the bag
	 */
	@SuppressWarnings("unchecked")
	public FixedCapacityBag(int capacity) {
		elements = (Item[]) new Object[capacity];
		numberOfElements = 0;
	}

	/**
	 * adds and item to the bag
	 * @param item - Item that is to be added to the bag
	 */
	@Override
	public void add(Item item) {
		if(numberOfElements == elements.length)
			throw new RuntimeException("Bag is full");
		elements[numberOfElements]=item;
		numberOfElements++;
	}

	/**
	 * checks the size of the bag
	 * return an integer that indicates the number of elements in the bag
	 */
	@Override
	public int size() {
		return numberOfElements;
	}
	
	/**
	 * iterates over the items in the bag
	 */
	@Override
	public Iterator<Item> iterator(){
		return new Iterator<Item>() {
			int index=0;
			
			/**
			 * checks to see if we are able to go to the next item in the bag
			 */
			@Override
			public boolean hasNext() {
				return index<numberOfElements;
			}

			/**
			 * checks to see if we are able to add a new item to the bag
			 * returns an error if we try to add a new item to a full bag
			 */
			@Override
			public Item next() {
				if(hasNext()) return elements[index++];
				throw new RuntimeException("No more elements.");
			}
			
		};
	}
	
	/**
	 * converts the list to a string
	 * returns the bag as a string
	 */
	@Override
	public String toString() {
		return toString("[", "]", " ");
	}

}
