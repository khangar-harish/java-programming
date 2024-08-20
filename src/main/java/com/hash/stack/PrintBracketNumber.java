package com.hash.stack;

import java.util.Stack;
public class PrintBracketNumber {

    public static void main(String[] args) {
        String str = "(abc(dca)ba(nj)n(j)sdf)";
        //12233441
        printBracketNumber(str);
    }

    public static void printBracketNumber(String str){
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                count++;
                st.push(count);
                System.out.print(count+" -> ");
            }else if(str.charAt(i) == ')'){
                System.out.print(st.pop()+" -> ");
            }
        }
        System.out.println("END");
    }
}
