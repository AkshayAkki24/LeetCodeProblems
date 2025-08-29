package LeetCodeProblems;

public class FindMinimumInRotatedSortedArray {

	public static void main(String args[]) {
		int[] nums = { 3, 4, 5, 1, 2 };
		int n = nums.length;
		int left = 0;
		int right = n - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > nums[right]) {
				left = (mid + 1);
			} else {
				right = mid;
			}
		}
		System.out.println(nums[right]);
	}
}
