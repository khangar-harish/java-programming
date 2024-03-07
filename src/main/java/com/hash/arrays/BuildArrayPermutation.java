package com.hash.arrays;

import java.util.Arrays;

public class BuildArrayPermutation {

	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray(nums)));
	}
	
	public static int[] buildArray(int[] nums) {

        if(nums.length < 0 || nums.length > 1000)
            return null;

        int temp;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0 || nums[i] < nums.length){
                temp = nums[i];
                ans[i] = nums[temp];
            }      
        }
        return ans;
    }

}
