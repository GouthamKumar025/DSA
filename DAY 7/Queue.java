package college;

public class Queue {

	private static int front, rear, capacity;
	private static int queue[];

	Queue(int size) {
		front = rear = 0;
		capacity = size;
		queue = new int[capacity];
	}

	// insertion of elements to the queue
	static void enqueue(int item) {
		if (capacity == rear) {
			System.out.println("\nQueue is full ");
			return;
		} else {
			queue[rear] = item;
			rear++;
		}
		return;
	}

	// removal of element from an queue
	static void dequeue() {
		if (front == rear) {
			System.out.println("\nQueue is Empty");
			return;
		} else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			if (rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		}
		return;
	}

	static void queueDisplay() {
		if (front == rear) {
			System.out.println("\nQueue is Empty");
			return;
		}
		for (int i = front; i < rear; i++) {
			System.out.printf("%d,", queue[i]);
		}
		return;
	}

	static void queueFront() {
		if (front == rear) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.printf("\nFront Element of the queue: %d", queue[front]);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(4);
		System.out.println("Initial Queue:");
		// print Queue elements
		Queue.queueDisplay();

		// inserting elements in the queue
		Queue.enqueue(10);
		Queue.enqueue(30);
		Queue.enqueue(50);
		Queue.enqueue(70);

		// print Queue elements
		System.out.println("\nQueue after Enqueue Operation:");
		Queue.queueDisplay();

		// print front of the queue
		Queue.queueFront();

		// insert element in the queue
		Queue.enqueue(90);

		// print Queue elements
		Queue.queueDisplay();

		Queue.dequeue();
		Queue.dequeue();
		System.out.printf("\nQueue after two dequeue operations:");

		// print Queue elements
		Queue.queueDisplay();

		// print front of the queue
		Queue.queueFront();

	}

}
