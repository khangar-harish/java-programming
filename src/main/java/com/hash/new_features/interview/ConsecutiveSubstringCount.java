package com.hash.new_features.interview;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConsecutiveSubstringCount {

    public static void main(String[] args) {

        System.out.println(subStringCount("AAABBBBBBBBCCCCCCCCCCCCCCCCCCCCVVXXXXXXXXXXXX"));
    }

    private static String subStringCount(String input) {

        StringBuilder compressed = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);
        AtomicInteger maxCount = new AtomicInteger(1);

        IntStream.range(0, input.length())
                .forEach(i -> {
                    if(i+1 < input.length() && input.charAt(i) == input.charAt(i+1)){
                        count.incrementAndGet();
                    }else {
                        if(maxCount.get() < count.get()){
                            maxCount.set(count.get());
                            compressed.delete(0, compressed.length());
                            compressed.append(input.charAt(i)).append(maxCount.get());
                        }
                        count.set(1);
                    }
                });
        return compressed.toString();
    }
}
