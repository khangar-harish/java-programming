package com.hash.new_features.interview;

import java.util.HashSet;
import java.util.Set;

public class ReturnSubstring {

    public static void main(String[] args) {
        // Test case 1
        String str1 = "abcabcabc";
        int L1 = 3;
        Set<String> result1 = findUniqueSubstrings(str1, L1);
        System.out.println("Unique substrings of length " + L1 + ": " + result1);

        // Test case 2
        String str2 = "aaaaaa";
        int L2 = 2;
        Set<String> result2 = findUniqueSubstrings(str2, L2);
        System.out.println("Unique substrings of length " + L2 + ": " + result2);

        // Test case 3 (Edge case)
        String str3 = "abc";
        int L3 = 4;  // Length greater than string length
        Set<String> result3 = findUniqueSubstrings(str3, L3);
        System.out.println("Unique substrings of length " + L3 + ": " + result3);

        String str5 = "aaaa";
        int L5 = 3;
        Set<String> result5 = findUniqueSubstrings(str5, L5);
        System.out.println("Unique substrings of length " + L5 + ": " + result5);

        String str6 = "aab";
        int L6 = 2;
        Set<String> result6 = findUniqueSubstrings(str6, L6);
        System.out.println("Unique substrings of length " + L6 + ": " + result6);
    }

    private static Set<String> findUniqueSubstrings(String str1, int L1) {

        HashSet<String> uniqueSubstring = new HashSet<>();
        if (str1 == null || str1.length() < L1){
            return uniqueSubstring;
        }

        for (int i = 0; i <= str1.length() - L1; i++) {
            String subString = str1.substring(i, i+L1);
            uniqueSubstring.add(subString);
        }
        return uniqueSubstring;
    }
}
