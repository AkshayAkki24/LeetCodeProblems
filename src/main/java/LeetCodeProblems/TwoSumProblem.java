package LeetCodeProblems;

import java.util.Arrays;

public class TwoSumProblem {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 5, 3 };
		int target = 9;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {//comparing the two numbers sum is equals to target value
					int[] result = new int[] { i, j };
					System.out.println(Arrays.toString(result));
				}
			}
		}
	}

}
