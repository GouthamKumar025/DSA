package prat;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 24;
		isEven(a);
		sum(a, b);
	}

	static void isEven(int num) {
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	static void sum(int a, int b) {
		int c = a + b;
		if (c % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
