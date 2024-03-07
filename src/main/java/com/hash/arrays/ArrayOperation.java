package com.hash.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperation {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 2};
		addElement(arr, 3, 10);
		addElement1(arr, 3, 10);
		deleteElement(arr, 6);
	}

	public static void addElement(int[] arr1, int index, int element) {
		System.out.println(arr1.length);
		System.out.println("Before "+Arrays.toString(arr1));
		for (int i = arr1.length-1; i > index; i--) {
			arr1[i] = arr1[i-1];
		}
		arr1[index] = element;
		System.out.println("After "+Arrays.toString(arr1));
	}
	
	public static void addElement1(int[] arr1, int index, int element) {
		int[] arr2 = new int[arr1.length+1];
		System.out.println(arr2.length);
		System.out.println("Before "+Arrays.toString(arr1));
		for (int i = 0, j = 0; i < arr2.length; i++) {
			if(i == index)
				arr2[i] = element;
			else
				arr2[i] = arr1[j++];
		}
		arr1[index] = element;
		System.out.println("After "+Arrays.toString(arr2));
	}
	
	public static void deleteElement(int[] arr, int element) {
		System.out.println("Before "+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				for (int j = i; j < arr.length-1; j++) {
					arr[j] = arr[j+1];
				}break;
			}
		}
		System.out.println("After "+Arrays.toString(arr));
	}
	
}
