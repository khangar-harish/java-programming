package com.hash.arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] shuffle(int[] nums, int n) {
	      int[] ans = new int[nums.length];
	      for(int i=0, j=n; i<n; i++, j++){
	        ans[i*2] = nums[i];
	        ans[i*2+1] = nums[j];
	      }
	      nums=null;
	      return ans;
	 }

}
