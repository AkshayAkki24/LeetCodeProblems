package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums) {
	       HashSet<List<Integer>> set=new HashSet<>();
	       Arrays.sort(nums);
	       int n=nums.length;
	        if(n==0){
	        return new ArrayList<>();
	       }
	       for(int i=0; i<n-2; i++){
	        int j=i+1;
	        int k=n-1;
	        while(j<k){
	            int sum=nums[j]+nums[k];
	            if(sum==-nums[i]){
	                set.add(Arrays.asList(nums[i],nums[j++], nums[k--]));
	            }
	            else if(sum<-nums[i]){
	                j++;
	            }
	            else if(sum>-nums[i]){
	                k--;

	            }
	        }
	       }
	       return new ArrayList<>(set);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		ThreeSum sol = new ThreeSum();
		List<List<Integer>> result = sol.threeSum(nums);
		System.out.println(result);
	}

}
