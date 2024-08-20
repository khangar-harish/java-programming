package com.hash.stack;

import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 7, 4, 9, 10, 8, 12};  //Output = 9, 7, 7, 9, 9, 10, 12, 12, -1
        greaterElement(arr);
        greaterElementLeft(arr);
    }

    public static void greaterElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            ans[i] = -1;
        }

        for (int i = 0; i < arr.length; i++){
            while (!st.isEmpty() && arr[i] > arr[st.peek()]){
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void greaterElementLeft(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            ans[i] = -1;
        }
        //8, 6, 4, 7, 4, 9, 10, 8, 12
        for(int i = arr.length-1; i >= 0; i--){
            while (!st.isEmpty()){
                if(arr[i] > arr[st.peek()])
                    st.pop();
                else
                    ans[i] = arr[st.peek()];
            }
            st.push(i);

        }System.out.println(Arrays.toString(ans));
    }
}
