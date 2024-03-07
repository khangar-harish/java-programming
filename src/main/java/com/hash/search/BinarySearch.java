package com.hash.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int binarySearch(int[] arr, int target) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		int start = 0, end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(arr[mid]  == target) {
				return mid;
			}else if(arr[mid] > target) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
		return -1;
	}

}
