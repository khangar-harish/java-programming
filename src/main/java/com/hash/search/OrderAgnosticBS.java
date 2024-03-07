package com.hash.search;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 5, 7, 9};
		
		int[] arr1 = {42, 34, 25, 17, 9};
		//System.out.println(orderAgnosticBS(arr, 8));
		System.out.println(orderAgnosticBS(arr1, 42));

	}
	
	public static int orderAgnosticBS(int[] arr, int target) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		if(arr[0] < arr[arr.length-1]) {
			return ascendingBinarySearch(arr, target);
		}else {
			return descendingBinarySearch(arr, target);
		}
		
	}
	
	public static int ascendingBinarySearch(int[] arr, int target) {
		
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
	
	public static int descendingBinarySearch(int[] arr, int target) {
		
		int start = 0, end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(arr[mid]  == target) {
				return mid;
			}else if(arr[mid] < target) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
		return -1;
	}

}
