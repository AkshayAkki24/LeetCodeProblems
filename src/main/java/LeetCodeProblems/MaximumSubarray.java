package LeetCodeProblems;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
		int n = nums.length;
		int result = nums[0];
		int currSum = nums[0];
		System.out.println("size of the array : "+n);
		System.out.println("result : "+result+" , "+currSum);
		for(int i = 0;i<nums.length;i++) {
			currSum = Math.max(nums[i],currSum + nums[i]);
			result = Math.max(result, currSum);
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray sol = new MaximumSubarray();
		int ans = sol.maxSubArray(nums);
		System.out.println(ans);
	}

}
