/**
 * library : algs
 */
package alg.bags;

import java.util.Iterator;

/**
 * A Bag with a dynamic capacity. Th
 * @ author Soroush Abdollahi
 */
public class DynamicCapacityBag<Item> implements Bag<Item> {

	/**
	 * The array of elements stored in the bag
	 */
	private Item[] elements;
	
	/**
	 * The current number of elements stored in the bag.
	 */
	private int numberOfElements;
	
	/**
	 * Creates a bag with the specified initial capacity.
	 * @param initialCapacity The initial capacity of the bag
	 */
	@SuppressWarnings("unchecked")
	public DynamicCapacityBag(int initialCapacity) {
		elements = (Item[]) new Object[initialCapacity];
		numberOfElements = 0;
	}
	
	/**
	 * Creates a bag with a default initial capacity (e.g 10)
	 */
	public DynamicCapacityBag() {
		this(10);
	}
	
	@Override
	public Iterator<Item> iterator() {
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
	 * Double the capacity of the current bag
	 */
	private void doubleCapacity() {
		@SuppressWarnings("unchecked")
		Item[] newElements = (Item[])new Object[elements.length*2];
		for(int i=0; i<elements.length; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
	}
	
	@Override
	public void add(Item item) {
		if (numberOfElements==elements.length)
			doubleCapacity();
		elements[numberOfElements++]=item;
	}

	@Override
	public int size() {
		return numberOfElements;
	}
	
	/**
	 * converts the list to a string
	 * returns the bag as a string
	 */
    @Override
    public String toString() {
        String result = "[";
        for (Item item : this) {
            result += item.toString() + " ";
        }
        result += "]";
        return result;
    }

}
