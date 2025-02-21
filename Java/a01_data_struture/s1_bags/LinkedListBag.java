/**
 * Module A01 Data Structures: Bags, Queues and Stacks.
 * Section 1: Bags
 */
package a01_data_struture.s1_bags;

import java.util.Iterator;

/**
 * A linked-list bag allowing new elements in an efficient way.
 * @author Soroush Abdollahi
 */
public class LinkedListBag<Item> implements Bag<Item> {
	/**
	 * A node in the list 
	 */
	private class Node<Item> {
		/**
		 * The next node, following after this node.
		 * Null if none.
		 */
		Node nextNode;
		
		/**
		 * The item stored at this node
		 */
		Item item;
	}
	
	/**
	 * The start node in the list of items.
	 */
	private Node startNode;
	
	/**
	 * The end node in the list of items
	 */
	private Node endNode;
	
	/**
	 * The number of elements in the list
	 */
	private int numberOfElements;
	
	/**
	 * Creates an empty list of items
	 */
	public LinkedListBag() {
		startNode=null;
		endNode=null;
		numberOfElements=0;
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {

			private Node currentNode=startNode;
			
			public boolean hasNext() {
				return currentNode !=null;
			}

			@Override
			public Item next() {
				Item item=(Item) currentNode.item;
				currentNode=currentNode.nextNode;
				return item;
			}
		};
	}

	@Override
	public void add(Item item) {
		Node itemNode = new Node();
		itemNode.nextNode = null;
		itemNode.item = item;
		numberOfElements++;
		if (startNode == null) {
			startNode = itemNode;
			endNode = itemNode;
		} else {
			endNode.nextNode = itemNode;
			endNode = itemNode;
		}
	}	

	@Override
	public int size() {
		return numberOfElements;
	}
	
	@Override
	public String toString() {
		return toString("[", "]", " ");
	}
}
