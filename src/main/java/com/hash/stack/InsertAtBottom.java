package com.hash.stack;

import java.util.Stack;
import java.util.Iterator;

public class InsertAtBottom {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i = 1; i < 5; i++){
            st.push(i+2);
        }
        display(st);

        addAtBottom(st, 10);
    }

    public static void addAtBottom(Stack st, Integer data){
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()){
            temp.push((Integer)st.pop());
        }
        st.push(data);
        while (!temp.isEmpty()){
            st.push((Integer)temp.pop());
        }
        display(st);
    }

    public static void display(Stack st){
        Iterator itr = st.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" -> ");
        }System.out.println("END");
    }
}
