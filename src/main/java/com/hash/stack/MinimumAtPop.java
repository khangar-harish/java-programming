package com.hash.stack;

import java.util.Iterator;
import java.util.Stack;

public class MinimumAtPop {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 0 , 6};
        getMinimumAtPop(arr);
    }

    private static void getMinimumAtPop(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }else {
                if(arr[i] < st.peek()){
                    st.push(arr[i]);
                }else {
                    st.push(st.peek());
                }
            }
        }
        display(st);
        for (int i = 0; i < arr.length; i++){
            System.out.print(st.pop()+ " -> ");
        }
        System.out.print("END");
    }

    private static void display(Stack<Integer> st) {
        Iterator itr = st.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" -> ");
        }
        System.out.println("END");
    }
}
