package com.hash.new_features.interview;

public class ExtractNumbers {

    public static void main(String[] args) {
        String input = "a1b2c3!@#456";
        System.out.println(extractNumbers(input));
    }

    public static int extractNumbers(String input) {
        StringBuilder numberString = new StringBuilder();

        // Traverse the input string and collect numeric characters
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                numberString.append(ch);
            }
        }

        // If no digits were found, return 0
        if (numberString.isEmpty()) {
            return 0;
        }

        // Convert the collected digits into an integer and return
        return Integer.parseInt(numberString.toString());
    }
}
