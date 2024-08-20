package com.hash.stack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class BStringArray {

    public static void main(String[] args) {
        String[] strArray = {"ab", "ac", "da", "da", "ac", "db", "ea"};
        Stack<String> st = new Stack<>();

        for (int i = 0; i < strArray.length; i++){
            if(st.isEmpty()){
                st.push(strArray[i]);
            }else{
                if(strArray[i].equals(st.peek())){
                    st.pop();
                }else {
                    st.push(strArray[i]);
                }
            }
        }

        Iterator itr = st.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+ " -> ");

        System.out.println("END");
    }
}
