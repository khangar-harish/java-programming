package com.hash.arrays.practice;

public class SlidingWindowMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3,4,1,2,1,5,4};
		//SlidingWindowMaxSum.findMaxSum(arr, 3);
		SlidingWindowMaxSum.findMaxSumOptimized(arr, 3);
	}
	
	public static void findMaxSum(int[] arr, int size) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length - size; i++) {
			int sum = 0;
			for (int j = i; j < i + size; j++) {
				sum = sum + arr[j];
			}
			max = Math.max(max, sum);
			System.out.println(sum);
		}
		System.out.println(max);
	}
	
	public static void findMaxSumOptimized(int[] arr, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i]; 
		}
		int max = sum;
		
		for (int i = size; i < arr.length; i++) {
			sum = sum + arr[i];
			sum = sum - arr[i - size];
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

}
