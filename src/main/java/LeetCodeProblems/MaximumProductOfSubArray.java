package LeetCodeProblems;

public class MaximumProductOfSubArray {
	
	public int maxProduct(int[] nums) {
		int maxSoFar = nums[0];
		int minSoFar = nums[0];
		int result = nums[0];
		
		for(int i = 1;i<nums.length;i++) {
			int curr = nums[i];
			int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
			minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
			maxSoFar = tempMax;
			
			result = Math.max(result, maxSoFar);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {2,3,-2,4};
		MaximumProductOfSubArray sol = new MaximumProductOfSubArray();
		int ans = sol.maxProduct(nums);
		System.out.println(ans);
	}

}
