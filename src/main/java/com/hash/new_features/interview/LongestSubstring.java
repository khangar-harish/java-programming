package com.hash.new_features.interview;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        // Example test case
        String input = "abcabcbb";

        // Find and print the length of the longest substring without repeating characters
        System.out.println("Length of Longest Substring: " + longestSubstring(input));  // Output should be 3
    }

    private static int longestSubstring(String input) {

        Set<Character> seen = new HashSet<>();
        int start = 0, maxLength = 0;
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            char ch;
            while (seen.contains(currentChar)){
                ch = input.charAt(start++);
                seen.remove(ch);
            }
            seen.add(currentChar);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
