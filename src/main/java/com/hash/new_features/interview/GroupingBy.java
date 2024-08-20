package com.hash.new_features.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {
        String input = "Ilovejavanewfeatures";

        char[] charArray = input.toCharArray();
        String [] stringArray = input.split("");

        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(stringArray));

        Map<String, List<String>> charMap = Arrays.stream(stringArray).collect(Collectors
                .groupingBy(s -> s)
        );
        System.out.println(charMap);

        System.out.println("Printing  characters and its count");
        Map<String, Long> charCountMap = Arrays.stream(stringArray).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting())
        );
        System.out.println(charCountMap);

        System.out.println("Printing  characters counts in a array");
        List<Long> countArray = new ArrayList<>(charCountMap.values());
        System.out.println(countArray);

        System.out.println("Printing  keys of map");
        List<String> keyArray = new ArrayList<>(charCountMap.keySet());
        System.out.println(keyArray);

        System.out.println("Printing  duplicate elements");
        Map<String, Long> map = Arrays.stream(stringArray).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));

        List<String> duplicates = map.entrySet().stream()
                .filter(mapValue -> mapValue.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicates);

        System.out.println("Printing  unique elements");
        List<String> unique = map.entrySet().stream()
                .filter(mapValue -> mapValue.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(unique);

        System.out.println("First  Non repeat element elements");
        Map<String, Long> linkedMap = Arrays.stream(stringArray).collect(Collectors
                .groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        String firstNonRepeat = linkedMap.entrySet().stream()
                .filter(mapValue -> mapValue.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(firstNonRepeat);
    }
}
