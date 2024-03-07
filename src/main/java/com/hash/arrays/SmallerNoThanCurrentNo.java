package com.hash.arrays;

public class SmallerNoThanCurrentNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){  
            int count = 0; 
            for(int j=0; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }ans[i] = count;
        }
       return ans;
	}
}
