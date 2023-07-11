package dsa;

import java.util.Arrays;

//sort the 0's,1's and 2's
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 0, 1, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
