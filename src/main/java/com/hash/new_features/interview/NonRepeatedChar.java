package com.hash.new_features.interview;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChar {

    public static void main(String[] args) {
        System.out.println(findFirstChar("acjhbcas"));
        System.out.println(findFirstChar("hharish"));
        System.out.println(findFirstChar("ggsshheevvssss"));
        System.out.println(findFirstChar("apple"));
        System.out.println(findFirstChar("racecars"));
        System.out.println(findFirstChar("ababdc"));

        System.out.println("**************");

        System.out.println(findFirst("acjhbcas"));
        System.out.println(findFirst("hharish"));
        System.out.println(findFirst("ggsshheevvssss"));
        System.out.println(findFirst("apple"));
        System.out.println(findFirst("racecars"));
        System.out.println(findFirst("ababdc"));


    }

    private static char findFirstChar(String str) {
        char res = '0';
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(i != j){
                    if(str.charAt(i) == str.charAt(j)){
                        break;
                    }else {
                        if(j == str.length()-1){
                            return str.charAt(i);
                        }
                    }
                }
            }
        }

        return res;
    }

    private static char findFirst(String str){

        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()){
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()){
            if(charMap.get(ch) == 1){
                return ch;
            }
        }

        return '0';
    }
}
