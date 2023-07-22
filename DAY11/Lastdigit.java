package myproject;

public class Lastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lastDigit(7584));
		System.out.println(secondLastDigit(7584));
		

	}

	static int lastDigit(int num) {
		while (num > 0) {
			int rem = num % 10;
			return rem;
		}
		return 0;
	}
	static int secondLastDigit(int n) {
		while(n>0){
			n/=10;
			int rem=n%10;
			return rem;
		}
		return 0;
	}

}
