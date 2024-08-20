package com.hash.stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
        //1, 1, 1, 2, 1, 4, 6
        int[] arr = {100, 80, 55, 70, 60, 75, 85};  //O/P 6, 4, 1, 2, 1, 1, 1
        stockSpan(arr);
        stockSpan1(arr);
    }

    public static void stockSpan(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            ans[i] = -1;
        }

        for (int i = arr.length-1; i >= 0; i--){
            while (!st.isEmpty() && arr[i] > arr[st.peek()]){
                ans[st.peek()] = st.peek() - i;
                st.pop();
            }
            st.push(i);

        }

        while (!st.isEmpty()){
            ans[st.peek()] = st.peek()+1;
            st.pop();
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void stockSpan1(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        //100, 80, 55, 70, 60, 75, 85
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty())
                ans[i] =  i + 1;
            else
                ans[i] = i - st.peek();

            st.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
