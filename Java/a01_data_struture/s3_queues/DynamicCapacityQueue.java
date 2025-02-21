/**
 * Module A02 Data Structures: Queues and Stack
 * Section A25: Dynamic Capacity Queue
 * Activity A25-PA1
 */
package a01_data_struture.s3_queues;

import java.util.Iterator;

/**
 * A queue using a circular array with a dynamic capacity.
 * The capacity is modified based on the current
 * number of elements. It may increase or decrease as needed
 * 
 * @author Soroush Abdollahi
 * @version 2
 */
public class DynamicCapacityQueue<Item> implements Queue<Item> {

	 /**
     * The array of elements stored in the queue. If the end of the array is
     * reached, and there is space at the beginning, the elements will be stored
     * from the beginning. The array is circular, after the last element we continue
     * with the first element. When full the capacity is doubled.
     */
    private Item[] elements;

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
     * Creates a queue with the specified initial capacity.
     * 
     * @param capacity the initial capacity (size) of the queue.
     */
    @SuppressWarnings("unchecked")
    public DynamicCapacityQueue(int capacity) {
        elements = (Item[]) new Object[capacity];
        numberOfElements = 0;
        startIndex = -1;
        endIndex = -1;
    }
    
    /**
     * Creates a queue with a default initial capacity.
     */
    public DynamicCapacityQueue() {
        this(10);
    }   
    
    /**
     * Double the capacity of the queue
     */
    private void doubleCapacity() {
    	@SuppressWarnings("unchecked")
    	Item[] newElements = (Item[]) new Object[elements.length*2];
    	int oldIndex = startIndex;
    	int newIndex = 0;
    	for (int i = 1; i <= numberOfElements; i++) {
    		newElements[newIndex++] = elements[oldIndex++];
    		 if (oldIndex==elements.length)
    			 oldIndex=0;
    	}
    	elements = newElements;
    	startIndex = 0;
    	endIndex = numberOfElements-1;
    }
    
    /**
     * half the capacity of the queue
     */
    private void halfCapacity() {
        if (numberOfElements >= elements.length/2) {
            throw new RuntimeException("Queue is half or more full");
        }
        @SuppressWarnings("unchecked")
        Item[] newElements = (Item[]) new Object[elements.length / 2];
        int oldIndex = startIndex;
        int newIndex = 0;
        for (int i = 1; i <= numberOfElements; i++) {
        	newElements[newIndex++] = elements[oldIndex++];
        	if (oldIndex==elements.length)
        		oldIndex=0;
        }
        elements = newElements;
        startIndex = 0;
        endIndex = numberOfElements-1;
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
                if (nextItem == endIndex)
                    nextItem = -1;
                else {
                    nextItem++;
                    if (nextItem == elements.length)
                        nextItem = 0;
                }
                return item;
            }
        };
    }

	/**
	 * add items to the queue
	 */
	@Override
	public void enqueue(Item item) {
        if (numberOfElements == elements.length)
            doubleCapacity();
        numberOfElements++;
        endIndex++; 
        if (endIndex>=elements.length) {
        	endIndex = 0;
        }
        if (startIndex==-1) {
        	startIndex=0;
        }
        elements[endIndex] = item;
	}

	/**
	 * remove items from the queue
	 */
	@Override
    public Item dequeue() {
        if (numberOfElements == 0) {
            throw new RuntimeException("Queue is empty");
        }
        Item item = elements[startIndex];
        elements[startIndex]=null;
        numberOfElements--;
        if (numberOfElements == 0) {
            startIndex = -1;
            endIndex = -1;
        } else {
            startIndex++;
            if (startIndex == elements.length)
                startIndex = 0;
        }
        if (numberOfElements>10&&numberOfElements<elements.length/4) {
        	halfCapacity();
        }
        return item;
    }

	@Override
	public int size() {
		return numberOfElements;
	}

}
