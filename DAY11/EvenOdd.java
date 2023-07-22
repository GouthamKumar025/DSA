package myproject;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEven(7));
		System.out.println(isOdd(8));

	}

	static int isEven(int num) {
		if (num % 2 == 0) {
			return 2;
		}
		return 1;
	}
	
	static int isOdd(int n) {
		if(n%2==0) {
			return 1;
		}
		return 2;
	}

}
