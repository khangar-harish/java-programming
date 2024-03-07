package com.hash.search;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 6, 7, 9, 9, 9, 2, 3};
		
		System.out.println(findElementInRotatedArray(arr, 9));
	}
	
	public static int findPivotElement(int[] arr, int start, int end) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(start < mid && arr[mid - 1] > arr[mid]) {
				return mid - 1;
			}else if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}else if(arr[start] >= arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		 
		return -1;
	}
	
	public static int findPivotWithDuplicateElement(int[] arr, int start, int end) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(start < mid && arr[mid - 1] > arr[mid]) {
				return mid - 1;
			}
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			
			if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
				if(arr[start] > arr[start+1]) {
					return start;
				}start++;
				
				if(arr[end-1] > arr[end]) {
					return end-1;
				}end--;	  
			}else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		 
		return -1;
	}
	
	public static int findElementInRotatedArray(int[] arr, int target) {
		
		int start = 0, end = arr.length-1, ans = -1;
		//int pivot = findPivotElement(arr, start, end);
		int pivot = findPivotWithDuplicateElement(arr, start, end);
		System.out.println(pivot);
		
		if(pivot == -1) {
			binarySearch(arr, target, 0, arr.length-1);
		}
		
		if(arr[pivot] == target) {
			ans = pivot;
		}else if(arr[start] <= target) {
			ans = binarySearch(arr, target, start, pivot - 1);
		}else {
			ans =  binarySearch(arr, target, pivot + 1, end);
		}
		
		return ans;
		
	}
	
	public static int binarySearch(int[] arr, int target, int start, int end) {
		
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
