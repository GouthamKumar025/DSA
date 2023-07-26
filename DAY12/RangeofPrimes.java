package myproject;

public class RangeofPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 4, 2, 9, 8, 6 };
		totalPrimes(arr);

	}

	static void totalPrimes(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}
		}
		System.out.println(count);

	}

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		int a = 2;
		while (a * a <= n) {
			if (n % a == 0) {
				return false;
			}
			a++;
		}
		return a * a > n;
	}

}
