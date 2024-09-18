package com.hash.new_features.interview;

import java.util.HashMap;
import java.util.Map;

public class StringFraction {

    public static void main(String[] args) {
        // Test cases
        System.out.println(fractionExpansion(1, 2));       // Output: "0.5"
        System.out.println(fractionExpansion(1, 3));       // Output: "0.(3)"
        System.out.println(fractionExpansion(22, 7));      // Output: "3.(142857)"
        System.out.println(fractionExpansion(1, 6));       // Output: "0.1(6)"
        System.out.println(fractionExpansion(1, 7));       // Output: "0.(142857)"
        System.out.println(fractionExpansion(50, 8));      // Output: "6.25"
        System.out.println(fractionExpansion(1, 333));     // Output: "0.(003)"
    }

    private static String fractionExpansion(long numerator, long denominator) {

        if (denominator == 0){
            throw new ArithmeticException("Cant divide by 0");
        }
        StringBuilder result = new StringBuilder();
        if(numerator<0 && denominator > 0 || numerator > 0 && denominator < 0){
            result.append("-");
        }

        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        result.append(numerator/denominator);
        long remainder = numerator%denominator;

        if(remainder == 0) return result.toString();

        result.append(".");
        Map<Long, Integer> remainderMap = new HashMap<>();
        StringBuilder fraction = new StringBuilder();
        int count = 0;
        long fr;

        while (remainder != 0){
            if(remainderMap.containsKey(remainder)){
                int repeat = remainderMap.get(remainder);
                fraction.insert(repeat, "(");
                fraction.append(")");
                result.append(fraction);
                return result.toString();
            }

            remainderMap.put(remainder, count++);

            remainder *= 10;
            fraction.append(remainder/denominator);
            remainder = remainder  % denominator;
        }


        return result.append(fraction).toString();
    }
}
