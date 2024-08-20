package com.hash.recursion;
public class PrintArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 9};
        printArray(arr, arr.length-1);
    }

    private static void printArray(int[] arr, int n) {
        if(n == 0){
            System.out.print(" "+arr[n]);
            return;
        }

        printArray(arr, n-1);
        System.out.print(" "+arr[n]);
    }
}
