package com.hash.new_features.interview;

public class NonRepeatedChar {

    public static void main(String[] args) {
        System.out.println(findFirstChar("acjhbcas"));
        System.out.println(findFirstChar("hharish"));

        System.out.println(findFirstChar("apple"));
        System.out.println(findFirstChar("racecars"));
        System.out.println(findFirstChar("ababdc"));


    }

    private static char findFirstChar(String str) {
        char res = 0;
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
}
