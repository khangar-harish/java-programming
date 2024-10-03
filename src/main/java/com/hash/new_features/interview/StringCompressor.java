package com.hash.new_features.interview;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class StringCompressor {

    public static void main(String[] args) {
        System.out.println(compressStringRegular("AABBBCCCD")); // Output: A2B3C3D1
        System.out.println(compressStringRegular("KKKKK"));     // Output: K5
        System.out.println(compressStringRegular("AABCA"));    // Output: A2B1C1A1

        System.out.println(compressString("AABBBCCCD")); // Output: A2B3C3D1
        System.out.println(compressString("KKKKK"));     // Output: K5
        System.out.println(compressString("AABCA"));    // Output: A2B1C1A1
    }

    public static String compressString(String str){

        StringBuilder compressed = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);
        IntStream.range(0, str.length())
                .forEach(i -> {

                    if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)){
                        count.getAndIncrement();
                    }else {
                        compressed.append(str.charAt(i));
                        compressed.append(count.get());
                        count.set(1);
                    }
                });
        return compressed.toString();
    }

    public static String compressStringRegular1(String str){

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char current = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char next = str.charAt(i);
            if(next == current){
                count++;
            }else {
                compressed.append(current).append(count);
                current = next;
                count = 1;
            }
        }
        compressed.append(current).append(count);
        return compressed.toString();
    }

    public static String compressStringRegular(String str){

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char current = str.charAt(0);
        compressed.append(current);
        for (int i = 1; i < str.length(); i++) {
            char next = str.charAt(i);
            if(next == current){
                count++;
            }else {
                current = next;
                compressed.append(count).append(current);
                count = 1;
            }
        }
        compressed.append(count);
        return compressed.toString();
    }
}
