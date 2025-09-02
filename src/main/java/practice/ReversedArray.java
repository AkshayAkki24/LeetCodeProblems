package practice;

import java.util.Arrays;

public class ReversedArray {
	public int[] reversedArray(int[] nums) {
		int temp;
		int start = 0, end = nums.length - 1;
		while (start < end) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };
		ReversedArray sol = new ReversedArray();
		int[] reversed = sol.reversedArray(nums);
		System.out.println(Arrays.toString(reversed));

	}

}
