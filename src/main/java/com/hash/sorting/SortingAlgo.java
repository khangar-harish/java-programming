package com.hash.sorting;

import java.util.Arrays;

public class SortingAlgo {

    public static void main(String[] args) {
        int [] arr = {5, 4, 7, 3, 9, 6, 1};
        SortingAlgo.bubbleSort(arr);
        SortingAlgo.selectionSort(arr);
        SortingAlgo._selectionSort(arr);
        SortingAlgo.insertionSort(arr);
        SortingAlgo._insertionSort(arr);
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 2; i++ ){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }System.out.println(Arrays.toString(arr));
    }

    public static void _insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++ ){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            swap(arr, maxIndex(arr, 0, arr.length-1-i), arr.length-1-i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void _selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                if(min > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        if(arr == null)
            return;

        boolean swapFlag = true;

        for (int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapFlag = false;
                }
            }
            if(swapFlag){
                System.out.println("Array is already sorted");
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int maxIndex(int[] arr, int start, int end){
        for(int i = start; i < end; i++){
            int max = arr[start];
            if(max < arr[i + 1]){
                max = arr[i + 1];
                start = i+1;
            }
        }return start;
    }
}
