package com.hash.search;

public class FloorAndCeilingBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 4, 5, 7, 9};
		
		int[] arr1 = {42, 34, 25, 17, 9};
		//System.out.println(orderAgnosticBS(arr, 8));
		findFloorAndCeilingOfNumber(arr, 10);
	}
	
	public static void findFloorAndCeilingOfNumber(int[] arr, int target) {
		System.out.println(floorBinarySearch(arr, target));
		System.out.println(ceilingBinarySearch(arr, target));
	}
	
	private static int floorBinarySearch(int[] arr, int target) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		if(target < arr[0]) {
			return -1;
		}
		
		int start = 0, end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(arr[mid]  == target) {
				return  mid;
			}else if(arr[mid] > target) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
		return end;
	}


	private static int ceilingBinarySearch(int[] arr, int target) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		if(target > arr[arr.length-1]) {
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
		
		return start;
	}

}
