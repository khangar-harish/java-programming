package com.hash.new_features.interview;

import java.util.stream.Stream;

public class FibonacciSeries {

    public static void fibonacciSeries(int n) {
        int a = 0, b = 1; // Initial values F(0) = 0, F(1) = 1

        System.out.print("Fibonacci series up to " + n + ": ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // Print current Fibonacci number
            int next = a + b; // Calculate the next Fibonacci number
            a = b; // Update a to b
            b = next; // Update b to the next Fibonacci number
        }
    }

    public static void fibonacciSeries1(int n) {
        // Generate Fibonacci series using Stream.iterate()
        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(n)  // Limit the number of Fibonacci numbers to 'n'
                .forEach(fib -> System.out.print(fib[0] + " ")); // Print the Fibonacci number
    }


    public static void main(String[] args) {
        int n = 10; // Example: First 10 Fibonacci numbers
        fibonacciSeries(n); // Call the function to print Fibonacci series
        System.out.println();
        System.out.println("*************************");
        fibonacciSeries1(n);
    }
}
