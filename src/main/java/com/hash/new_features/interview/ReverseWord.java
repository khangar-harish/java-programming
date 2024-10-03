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
            result.append(reverseAlphabetic(word)).append(" ");
        }

        return result.toString();
    }

    private static String reverseWord(String word) {

        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

    public static String reverseAlphabetic(String input) {


        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // If the left character is not alphabetic, move the left pointer
            if (!Character.isLetter(charArray[left])) {
                left++;
            }
            // If the right character is not alphabetic, move the right pointer
            else if (!Character.isLetter(charArray[right])) {
                right--;
            }
            // If both characters are alphabetic, swap them
            else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        // Convert the modified character array back to a string and return
        return new String(charArray);
    }

}
