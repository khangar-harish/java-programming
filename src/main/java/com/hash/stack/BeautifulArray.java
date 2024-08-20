package com.hash.stack;

import java.util.Arrays;
import java.util.Stack;
public class BeautifulArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, -3, 9, -6, 8};
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }else{
                if(arr[i] < 0){
                    if(st.peek() < 0){
                        st.push(arr[i]);
                    }else {
                        st.pop();
                    }
                }else {
                    if(st.peek() > 0){
                        st.push(arr[i]);
                    }else {
                        st.pop();
                    }
                }
            }
        }

        int[] newArray = new int[st.size()];
        int i = st.size()-1;
        while (!st.isEmpty()){
            newArray[i] = st.pop();
            i--;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
