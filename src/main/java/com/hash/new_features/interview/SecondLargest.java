package com.hash.new_features.interview;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {3, 1, 4, 5, 2};
        System.out.println("Second largest: " + findSecondLargest(arr1));  // Output: 4
        System.out.println("Second Smallest: " + findSecondSmallest(arr1));  // Output: 2

        int[] arr2 = {10, 10, 9};
        System.out.println("Second largest: " + findSecondLargest(arr2));  // Output: 9

        int[] arr3 = {1};  // Not enough elements
        System.out.println("Second largest: " + findSecondLargest(arr3));  // Output: null

        int[] arr4 = {5, 5, 5};  // All elements are the same
        System.out.println("Second largest: " + findSecondLargest(arr4));  // Output: null
    }

    private static Integer findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    }

    private static Integer findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        return Arrays.stream(arr).distinct().boxed().sorted().skip(1).findFirst().orElse(null);
    }
}
