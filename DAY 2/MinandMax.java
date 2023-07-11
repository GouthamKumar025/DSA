package dsa;

//finding the min and max from the given array using ternary operator
public class MinandMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 123, 45, 67, 1 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			min = arr[i] < arr[min] ? arr[i] : min;
			max = arr[i] > arr[max] ? arr[i] : max;
		}
		System.out.println("The minimum element is " + min);
		System.out.println("The maximum element is " + max);
	}

}
