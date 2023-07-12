package projects;

import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class SmallNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 8, 1, 2, 2, 3 };
		smallerNumbersThanCurrent(nums);
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int count = 0;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (j != i && nums[j] < nums[i]) {
					count++;
				}
			}
			arr[i] = count;
			count = 0;
		}
		return arr;

	}

}
