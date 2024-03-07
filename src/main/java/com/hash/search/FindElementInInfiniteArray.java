package com.hash.search;

public class FindElementInInfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 5, 6, 7, 9, 10, 23, 33, 45, 56, 76, 88, 89, 90, 100};
		System.out.println(findRange(arr, 88));
	}
	
	public static int findRange(int[] arr, int target) {
		
		if(arr.length == 0) {
			return -1;
		}
		int start = 0, end = 1;
		while(target > arr[end]) {
			int newStart = end + 1;
			end = end + (end - start + 1) * 2;
			start = newStart;
		}
		return findElement(arr, target, start, end);
	}
	
	public static int findElement(int[] arr, int target, int start, int end) {
		
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
		
		return end;
	}

}
