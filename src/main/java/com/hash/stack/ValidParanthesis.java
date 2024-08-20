package com.hash.stack;

import java.util.Stack;
public class ValidParanthesis {

    public static void main(String[] args) {
        String str = ")))(()()()()";
        System.out.println(str);
        isValidParathesisWithStack(str);
        isValidParathesisWithoutStack(str);
        minToMakePValid(str);
    }

    public static void isValidParathesisWithStack(String str){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++){
            if(st.isEmpty() || str.charAt(i) == '('){
                st.push(str.charAt(i));
            }else {
                if(str.charAt(i) == st.peek()){
                    st.push(str.charAt(i));
                }else {
                    st.pop();
                }
            }
        }

        if(st.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void isValidParathesisWithoutStack(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                count++;
            }else {
                count--;
            }
        }
        if(count > 0)
            System.out.println(false);
        else
            System.out.println(true);

    }

    public static void minToMakePValid(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                count++;
            }else {
                count--;
            }
        }

        System.out.println(Math.abs(count));
    }
}
