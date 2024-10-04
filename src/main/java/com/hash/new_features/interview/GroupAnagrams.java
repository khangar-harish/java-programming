package com.hash.new_features.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] input = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(input);
    }

    public static List<List<String>> groupAnagrams(String [] strings){

        System.out.println("Group a string by sorted key");
        Map<String, List<String>> collect = Arrays.stream(strings)
                .collect(Collectors.groupingBy(GroupAnagrams::sortedStrings));

        collect.entrySet().forEach(System.out::println);

        System.out.println("Now change the keys by string to integer");
        System.out.println("key is calculated by no of string present in value list");
        Map<Integer, List<String>> newMap = collect.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getValue().size(), Map.Entry::getValue));

        newMap.entrySet().forEach(System.out::println);

        System.out.println("Reversed the key and map it to value");
        List<List<String>> collect1 = newMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        System.out.println(collect1);

//        List<List<String>> result = new ArrayList<>(collect.values());
//        result.forEach(System.out::println);
//        System.out.println(result);
//
//        result.forEach(list -> list.sort(Comparator.reverseOrder()));
//
//        result.forEach(System.out::println);
        return collect1;
    }

    private static String sortedStrings(String s) {
        char [] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
