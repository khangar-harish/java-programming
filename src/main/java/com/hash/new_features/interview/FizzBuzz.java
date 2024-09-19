package com.hash.new_features.interview;

public class FizzBuzz {

    // Function to print FizzBuzz for numbers from 1 to n
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Multiple of 3
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Multiple of 5
            } else {
                System.out.println(i); // Not a multiple of 3 or 5
            }
        }
    }

    public static void main(String[] args) {
        int n = 20; // Example: FizzBuzz up to 20
        fizzBuzz(n); // Call the function
    }
}

