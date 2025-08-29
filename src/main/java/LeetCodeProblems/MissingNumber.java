package LeetCodeProblems;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = { 3, 0, 1 };
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			n = n + i - nums[i];
		}
		System.out.println(n);
	}
}
