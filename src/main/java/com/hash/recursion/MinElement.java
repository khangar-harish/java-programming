package com.hash.recursion;

import static java.lang.Math.min;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 7, 9};
        int sum = 0;

        System.out.println(minElement(arr, arr.length-1));
    }

    private static int minElement(int[] arr, int n) {
        if(n == 0){
            return arr[n];
        }
        return Math.min(arr[n], minElement(arr, n-1));
    }
}
