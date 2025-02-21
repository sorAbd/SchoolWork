/**
 * Module A01 Data Structures: Bags, Queues and Stacks.
 * Section 2: Stacks
 * Activity 230: Linked list Stack lecture
 */
package a01_data_struture.s2_stacks;

import java.util.Iterator;

/**
 * A linked-list stack allowing adding and removing elements in an efficient way.
 * 
 * @param <Item> - A generic type for the elements in the stack, any Object
 * 
 * @author Soroush Abdollahi
 * 
 * @version 1
 * 
 */
public class LinkedListStack<Item> implements Stack<Item> {

	/**
	 * A node in the stack
	 */
	private class Node{
		/**
		 * The next node, following this node. Null if none.
		 */
		Node belowNode;
		
		/**
		 * The item stored at this node.
		 */
		Item item;
	}
	
	/**
	 * The top node in the stack of items.
	 */
	private Node topNode;
	
	/**
	 * The number of elements in the stack.
	 */
	private int numberOfElements;
	
	/**
	 * Creates an empty stack of items.
	 */
	public LinkedListStack() {
		topNode = null;
		numberOfElements=0;
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {
			
			private Node currentNode = topNode;
			
			public boolean hasNext() {
				return currentNode != null;
			}
			
			@Override
			public Item next() {
				Item item = currentNode.item;
				currentNode = currentNode.belowNode;
				return item;
			}
		};
	}
 
	@Override
	public void push(Item item) {
		Node itemNode = new Node();
		itemNode.belowNode = null;
		itemNode.item = item;
		numberOfElements++;
		//if stack is empty - create a stack with this new node
		if (topNode == null) {
			topNode = itemNode;
		}else {
			// the stack possesses elements, the top element is not null
			itemNode.belowNode = topNode;
			topNode = itemNode;
		}
		
	}

	@Override
	public Item pop() {
		if(topNode==null) {
			throw new RuntimeException("Stack is empty.");
		}
		Item top = topNode.item;
		topNode=topNode.belowNode;
		return top;
	}

	@Override
	public int size() {
		return numberOfElements;
	}

}
