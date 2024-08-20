package com.hash.new_features.interview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsMethod {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("apple", "banana", "blueberry", "cherry", "avacado", "gauva", "orange");

        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);

        String str = String.join(",", list);
        System.out.println(str);
        System.out.println(list.stream().collect(Collectors.joining(",")));

        Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
        map.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("*********************************************************");
        Map<Integer, List<String>> mapWithCapital = list.stream().collect(Collectors
                .groupingBy(String::length,
                        Collectors.mapping(String::toUpperCase,
                                Collectors.toList())));

        mapWithCapital.entrySet().forEach(System.out::println);

        System.out.println("*********************************************************");
        Map<Character, List<String>> mapStartChar = list.stream().collect(Collectors
                .groupingBy(name -> name.charAt(0)));
        mapStartChar.entrySet().forEach(System.out::println);

        Map<Character, Long> mapStartCharCount = list.stream().collect(Collectors
                .groupingBy(name -> name.charAt(0), Collectors.counting()));
        mapStartCharCount.entrySet().forEach(System.out::println);

        System.out.println("*********************************************************");
        Map<Character, List<Integer>> mapStartCharCaps = list.stream().collect(Collectors
                .groupingBy(name -> name.charAt(0),
                        Collectors.mapping(String::length, Collectors.toList())));
        mapStartCharCaps.entrySet().forEach(System.out::println);

        Optional<List<Integer>> a = mapStartCharCaps.entrySet().stream()
                .filter(e -> e.getKey().equals('a'))
                .map(Map.Entry::getValue).findFirst();
        System.out.println("*********************************************************");
        a.ifPresent(System.out::println);
    }
}
