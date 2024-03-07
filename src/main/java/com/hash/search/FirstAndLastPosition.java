package com.hash.search;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 5, 5, 5, 7, 9};
		
		System.out.println(Arrays.toString(firstAndLastPosition(arr, 5)));

	}
	
	public static int[] firstAndLastPosition(int[] arr, int target) {
		
		int[] ans = {-1, -1};
		if(arr.length == 0) {
			return ans;
		}
		
		ans[0] = firstOccurance(arr, target, true);
		if(ans[0] != -1) {
			ans[1] = firstOccurance(arr, target, false);
		}
		
		return ans;
	}
	
	private static int firstOccurance(int[] arr, int target, boolean isFirstOccurance) {
		
		int start = 0, end = arr.length-1, ans = -1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(arr[mid]  < target) {
				start = mid + 1;
			}else if(arr[mid] > target) {
				end = mid - 1;
			}else {
				ans = mid;
				if(isFirstOccurance) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}


}
