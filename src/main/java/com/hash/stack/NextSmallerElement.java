package com.hash.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

    public static void main(String[] args) {
        int[] arr1 = {7, 9, 12, 10, 14, 8, 3, 6, 9};
        int[] arr2 = {4, 13, 11, 5, 9, 7, 8, 6};
        smallerElement(arr1);
        smallerElementOnLeft(arr2);
    }

    private static void smallerElementOnLeft(int[] arr) {
        java.util.Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            ans[i] = -1;
        }

        for (int i = arr.length-1; i >= 0; i--){
            while (!st.isEmpty() && arr[i] < arr[st.peek()]){
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }

    private static void smallerElement(int[] arr) {
        java.util.Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            ans[i] = -1;
        }

        for (int i = 0; i < arr.length; i++){
            while (!st.isEmpty() && arr[i] < arr[st.peek()]){
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
