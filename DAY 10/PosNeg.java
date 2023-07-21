package prat;

import java.util.*;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if (a > 0) {
			System.out.println("Positive");
		} else if (a < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		in.close();

	}

}
