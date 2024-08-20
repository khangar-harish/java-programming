package com.hash.recursion;

public class SumofArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 9};
        int sum = 0;
        sum = arraySum(arr, arr.length-1);
        System.out.println(sum);
    }

    private static int arraySum(int[] arr, int n) {
        if(n == 0){
             return arr[n];
        }
        return arr[n] + arraySum(arr, n-1);
    }
}
