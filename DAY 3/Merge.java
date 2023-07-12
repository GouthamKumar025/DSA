package projects;

import java.util.Arrays;

public class Merge {
//objective: to merge two sorted array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		merge(a, b);
	}

	static void merge(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		int c[] = new int[n + m];
		for (int i = 0; i < n; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < m; j++) {
			c[n + j] = b[j];
		}
		for (int k = 0; k < (n + m); k++) {
			System.out.print(c[k]);
		}
	}

}
