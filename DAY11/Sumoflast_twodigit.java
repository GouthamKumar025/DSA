package myproject;

public class Sumoflast_twodigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = firstLast(7589);
		int b = secondLast(8467);
		System.out.println(a + b);

	}

	static int firstLast(int num) {
		int rem = num % 10;
		return rem;
	}

	static int secondLast(int num) {
		int rem = num % 10;
		return rem;
	}

}
