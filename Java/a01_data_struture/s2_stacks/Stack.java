/**
 * Module A01 Data Structures: Bags, Queues and Stacks.
 * Section A01-2: Stacks
 * Activity A01-230: Stacks Lecture
 */
package a01_data_struture.s2_stacks;

/**
 * A stack is keeping a collection of items
 * You generate items at the top of the stack
 * You can remove items from the top of the stack
 * When we iterate the elements of the stack we start with the base of the stack (ending with top)
 * 
 * @ author Soroush Abdollahi
 * 
 * @param <Item> The types of elements that are stored in the stack. Any Object.
 */
public interface Stack<Item> extends Iterable<Item> {
	
	/**
	 * Add the element item to the stack
	 * @param item
	 */
	public void push(Item item);
	
	/**
	 * Remove and return the last element added to the stack (top element).
	 * @return the top element, an Item
	 */
	public Item pop();
	
	/**
	 * Check if the stack is empty
	 * @return true if stack is empty
	 */
	default public boolean isEmpty() {
		return size()==0;
	}
	
	/**
	 * The number of elements (items) in the stack
	 * @return the size of the stack (an int)
	 */
	public int size();
	
	/**
	 * Creates a string representation of the stack, starting with the start string, ending with the end string
	 * and separating the with the separator.
	 * The method will display the elements starting with the base of the stack
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
