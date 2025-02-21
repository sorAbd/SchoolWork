/**
 *Module A01 Data Structures: Bags, Queues and Stacks.
 *Section 2: Stacks
 */
package a01_data_struture.s2_stacks;

import java.util.Date;

/**
 * Class to test all the types of stacks
 * 
 * @author Soroush Abdollahi
 * @version 1
 * 
 */
public class TestStacks {

    /**
     * Test to push an item to a stack, printing the operation and the resulting stack.
     * @param stack - the stack in which the item is pushed
     * @param item - the item pushed
     */
    private static <Item> void testPushItem(Stack<Item> stack, Item item) {
    	System.out.println();
        System.out.println("Push item: "+item.toString());
        try {
            stack.push(item);
        } catch (Exception e) {
            System.out.println("Error pushing an item in the stack: "+e.getMessage());
        }
        System.out.println("Updated stack: "+stack.toString("<", "]", ", "));
    }
	
    /**
     * Perform a sequence of tests on an empty stack.
     * @param stack The stack of items
     * @param items An array of items to be added (pushed) to the stack
     * @param n the number of elements to be deleted from the stack
     * @param <Item> the generic type of the elements in the stack
     * @param s - the tested empty stack 
     */
    private static <Item> void testStack(Stack<Item> stack, Item[] items, int n) {
    	System.out.println("------------------------------------------");
        System.out.println("Empty stack: "+stack.toString("<", "]", ", "));
        for (Item item:items) {
        	testPushItem(stack, item);
        }
        for (int i=1; i<=n; i++) {
        	testPopItem(stack);
        }
    }
	
	/**
	 * Remove the top item from the stack
	 * @param <Item> - Item stored in the stack
	 * @param stack - tested stack of items
	 * @return - The item removed from the stack
	 */
    private static <Item> Item testPopItem(Stack<Item> stack) {
    	System.out.println();
    	System.out.println("Pop item from stack");
    	Item item = null;
    	try {
    		item = stack.pop();
    		System.out.println("Popped Item: "+item.toString());
    	}  catch (Exception e) {
    		System.out.println("Error popping an item from the stack: "+e.getMessage());
    	}
    	System.out.println("Updated stack: "+stack.toString("<", "]", ", "));
    	return item;
    }
	
	/**
	 * The main method calling the tests to execute
	 * @param args not used
	 */
	public static void main(String[] args) {
		//System.out.println("Fixed Capacity Stack - A21 Task 1 - adapted by Soroush Abdollahi");
		Date date = new Date();
		System.out.println("Executed on: "+date.toString());

//		FixedCapacityStack<String> nba = new FixedCapacityStack<>(3);
//		testStringStack(nba);
		
		//System.out.println("Fixed Capacity Stack - A22  Task 1 - adapted by Soroush Abdollahi");
//		DynamicCapacityStack<String> dy_nba = new DynamicCapacityStack<>(3);
//		testStringStack(dy_nba);
		
//		System.out.println("Dynamic Capacity Stack - A22 Task 2 - adapted by Soroush Abdollahi");
//		DynamicCapacityStack<String> dy_nba = new DynamicCapacityStack<>(3);
//		testStack(dy_nba, new String[] {"Kobe Bryant", "Lebron James", "Magic Johnson", "Karl Malone"}, 4);
//		DynamicCapacityStack<Integer> dy_int = new DynamicCapacityStack<>(3);
//		testStack(dy_int, new Integer[] {0,1,1,2,3,5,8,13}, 9);
		
		System.out.println("Linked List Stack - A23 Task 1 - adapted by Soroush Abdollahi");
		LinkedListStack<String> link_stack = new LinkedListStack<>();
		testStack(link_stack, new String[] {"Kobe Bryant", "Lebron James", "Magic Johnson", "Karl Malone"}, 4);
		LinkedListStack<Integer> li_int = new LinkedListStack<>();
		testStack(li_int, new Integer[] {0,1,1,2,3,5,8,13}, 9);
		}
	}
