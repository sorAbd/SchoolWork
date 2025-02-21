/**
 * Module A01 Data Structures: Bags, Queues and Stacks.
 * Section 1: Bags 
 */
package a01_data_struture.s1_bags;

import java.util.Iterator;

/**
 * A bag is a data structure that collects items and allows user to iterate over them.
 * but does not allow user to remove items
 * @ author Soroush Abdollahi
 * @param <Item> the type of elements stored in the bag
 */
public interface Bag<Item> extends Iterable<Item>{
	
	/**
	 * Adds various item to the bag. Duplicated items are allowed to be added
	 * @param item An item that to be added
	 */
	public void add (Item item);
	

	/**
	 * The number of elements bag
	 * @return the size of the bag, an integer that represents the numbers in the bag 
	 */
	public int size();
	
	default public boolean isSingleton() {
		return size()==1;
	}
	
	/**
	 * Creates a string representation of the bag, starting with the start string, ending with the end string
	 * and separating the with the separator.
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
	
	/**
	 * Check if the bag is empty
	 * @return true if the bag is empty, meaning nothing is in it
	 */
	default public boolean isEmpty() {
		return size()==0;
	}

	/**
	 * default method that is used to compute the maximum frequency of an item
	 * @return the maximum frequency
	 */
	default public int maxFreq() {
		int max = 0;
		for (Item countedItem: this) {
			int count = 0;
			for (Item item: this) {
				if (countedItem.equals(item)) {
					count++;
				}
			}
			if (count>max) {
				max = count;
			}
		}
		return max;
	}
}
