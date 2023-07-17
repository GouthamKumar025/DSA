package myproject;

import java.util.*;

public class Stackops {
	static void stack_push(Stack<Integer>stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Stack pop");
		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	static void stack_peek(Stack<Integer> stack) {
		System.out.println("Peek element");
		Integer z = (Integer) stack.peek();
		System.out.println(z);
	}

	static void stack_search(Stack<Integer> stack, int element) {
		System.out.println("Searching for an element in an stack");
		Integer pos = (Integer) stack.search(element);
		if (pos == -1) {
			System.out.println("Element is not found in the stack");
		} else {
			System.out.println(pos);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack_push(stack);
		// stack_pop(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 4);
	}

}
