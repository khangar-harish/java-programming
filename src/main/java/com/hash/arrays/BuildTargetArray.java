package com.hash.arrays;

import java.util.ArrayList;
import java.util.List;

public class BuildTargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        List<Integer> al = new ArrayList();
        for(int i=0; i<nums.length; i++){
            al.add(index[i], nums[i]);
        }
        for(int i=0; i<ans.length; i++){
            ans[i] = al.get(i);
        }return ans;
    }
}
