package com.hash.arrays.practice;

public class FindMinMax {

	public static void main(String[] args) {
		// To find Min & Max Value at a same time we need find each value at a time
		//int[] arr = {3, 5, 4, 1, 9};
		int[] arr = {9, 1, 4, 5, 3};
		
		FindMinMax.printMinAndMaxNo(arr);
	}
	
	public static void printMinAndMaxNo(int[] arr) {
		
		if(arr != null) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println("Min Value = "+min);
			System.out.println("Max Value = "+max);
		}
	}

}
