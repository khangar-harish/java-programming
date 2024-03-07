package com.hash.arrays.practice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 1, 2};
		ReverseArray.reverseArray(arr);
	}
	
	public static void reverseArray(int[] arr) {
		if(arr != null) {
			int temp = 0;
			for (int i = 0, j = arr.length-1; i < j; i++, j--) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
