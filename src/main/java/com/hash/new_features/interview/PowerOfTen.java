package com.hash.new_features.interview;

public class PowerOfTen {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerOfTen(1));      // true, 10^0 = 1
        System.out.println(isPowerOfTen(10));     // true, 10^1 = 10
        System.out.println(isPowerOfTen(100));    // true, 10^2 = 100
        System.out.println(isPowerOfTen(50));     // false, not a power of 10
        System.out.println(isPowerOfTen(0));      // false, 0 is not a power of 10
        System.out.println(isPowerOfTen(-10));    // false, negative numbers are not powers of 10
    }

    private static boolean isPowerOfTen(int number) {

        if(number <= 0){
            return false;
        }

        while (number % 10 == 0){
            number = number/10;
        }
        return number == 1;
    }
}
