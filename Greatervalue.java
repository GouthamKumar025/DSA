package prat;

import java.util.*;

public class Greatervalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println(max);
		in.close();
	}

}
