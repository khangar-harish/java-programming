package com.hash.arrays;

import java.util.Arrays;

public class ConcateArray {

	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		System.out.println(Arrays.toString(getConcatenation(nums)));

	}
	
	public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        if(nums.length < 0 || nums.length > 1000)
            return null;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 || nums[i] < nums.length){
                ans[i] = nums[i];
                ans[i + nums.length] = nums[i];
            }
            
        }
        return ans;
    }

}
