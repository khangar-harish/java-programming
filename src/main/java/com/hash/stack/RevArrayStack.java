package com.hash.stack;

import java.util.Arrays;

public class RevArrayStack {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 3, 9, 6};
        int index = 0;
        System.out.println(Arrays.toString(arr));
        Stack st = new Stack(arr.length);
        for (int i = 0; i < arr.length; i++){
            st.push(arr[i]);
        }
        while (!st.isEmpty()){
            arr[index++] = st.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
