package com.hash.new_features;

public class LongestSubstring {

    public static void main(String[] args) {
        String input = "AAABBBBBBBBCCVV";
        char resultChar = input.charAt(0);
        int resultLength = 1;
        int resultIndex = 0;

        char currentChar = input.charAt(0);
        int currentLength = 1;
        int currentIndex = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                currentLength++;
            } else {
                if (currentLength > resultLength) {
                    resultChar = currentChar;
                    resultLength = currentLength;
                    resultIndex = currentIndex;
                }
                currentChar = input.charAt(i);
                currentLength = 1;
                currentIndex = i;
            }
        }

        // Final check for the last substring
        if (currentLength > resultLength) {
            resultChar = currentChar;
            resultLength = currentLength;
            resultIndex = currentIndex;
        }

        System.out.println("Character: " + resultChar + ", Length: " + resultLength + ", Index: " + resultIndex);
    }

}
