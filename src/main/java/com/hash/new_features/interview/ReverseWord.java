package com.hash.new_features.interview;

import java.util.Arrays;

public class ReverseWord {

    public static void main(String[] args) {
        String input = "I am, Robot!";
        String output = reverseWordsWithCaseAndSpecialChars(input);
        System.out.println(output);
    }

    private static String reverseWordsWithCaseAndSpecialChars(String input) {

        String [] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words){
            result.append(reverseWord(word)).append(" ");
        }

        return result.toString();
    }

    private static String reverseWord(String word) {

        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

}
