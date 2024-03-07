package com.hash.search;

public class PeakInMountainArray {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 5, 6, 7, 4, 2, 1};
		System.out.println(findPeakIndex(arr));
	}
	
	public static int findPeakIndex(int[] arr) {
		int peak = 0;
		int start = 0, end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid - 1] > arr[mid]) {
				end = mid - 1;
			}else if(arr[mid] < arr[mid + 1]){
				start = mid + 1; 
			}else {
				return arr[mid];
			}
		}
		return arr[peak];
	}

}
