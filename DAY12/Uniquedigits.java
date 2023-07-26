package myproject;

public class Uniquedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2234262;
		uniques(n);

	}

	static void uniques(int n) {
		int res = 0;
		int count[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		while (n > 0) {
			int rem = n % 10;
			count[rem]++;
			n = n / 10;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 1) {
				res++;
			}
		}
		System.out.println(res);
	}

}
