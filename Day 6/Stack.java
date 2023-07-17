package myproject;

public class Stack {
	private int arr[];
	private int top;
	private int capacity;

	Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack Overflow");

		} else {
			System.out.println("Inserting " + x);
			arr[++top] = x;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");

		}
		return arr[top--];
	}

	public int getSize() {
		return top + 1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(5);
		stack.push(3);
		stack.push(7);
		stack.push(9);
		System.out.println("After pushing");
		stack.printStack();
		System.out.println("After Popping");
		stack.pop();
		stack.printStack();
	}

}
