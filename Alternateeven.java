package prat;

public class Alternateeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 100; i = i + 2) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Reverse Order");
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Reverse Order by skipping 2 numbers");
		for (int i = 100; i >= 0; i = i - 3) {
			System.out.println(i);
		}
	}

}
