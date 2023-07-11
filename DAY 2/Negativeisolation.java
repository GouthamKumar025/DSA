package dsa;

import java.util.Arrays;

//Moving the negative element of the array along the side of an array
public class Negativeisolation {
// The above question can be solved by using the sorting technique
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, -1, 10, -5, 6, -7, 5, -3, -6 };
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
