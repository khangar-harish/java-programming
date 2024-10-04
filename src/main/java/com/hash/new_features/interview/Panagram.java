package com.hash.new_features.interview;

import java.util.Set;
import java.util.stream.Collectors;

public class Panagram {

    public static void main(String[] args) {
        // Test cases
        String input1 = "The quick brown fox jumps over a lazy dog";
        System.out.println("Missing letters: " + findMissingAlphabets(input1));  // Output: ""

        String input2 = "Hello World";
        System.out.println("Missing letters: " + findMissingAlphabets(input2));  // Output: "abcfjkmnpqstuvwxyz"
    }

    private static String findMissingAlphabets(String input1) {

        if (input1 == null || input1.isEmpty()) {
            return null; // Handle edge cases
        }

        Set<Character> aTozChar = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
        Set<Character> inputChars = input1.toLowerCase().chars().filter(Character::isLetter).mapToObj(c -> (char)c).collect(Collectors.toSet());

        aTozChar.removeAll(inputChars);

        return aTozChar.stream().map(String::valueOf).collect(Collectors.joining());

    }
}
