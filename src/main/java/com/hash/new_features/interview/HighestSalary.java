package com.hash.new_features.interview;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalary {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Hash", 60000);
        map.put("Lado", 50000);
        map.put("Palak", 30000);
        map.put("Rahul", 40000);
        map.put("Dany", 55000);

        map.entrySet().forEach(System.out::println);
        map.forEach((k, v) -> System.out.println(k +" "+ v));

        System.out.println("Print highest salary");
        Map.Entry<String, Integer> highSal = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .toList()
                .getFirst();
        System.out.println(highSal.getKey() +" "+ highSal.getValue());

        System.out.println("Print highest nth salary");
        System.out.println(getNthSalary(3, map).getValue());

        Map<String, Integer> map1 = new HashMap<>();
        map.put("Hash", 60000);
        map.put("Lado", 50000);
        map.put("Palak", 50000);
        map.put("Rahul", 40000);
        map.put("Dany", 55000);
        map.put("Raj", 40000);

        Map<Integer, List<String>> newMap = map.entrySet().stream()
                .collect(Collectors
                        .groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        newMap.entrySet().forEach(System.out::println);
        System.out.println(getNthSalaryFromDuplicates(2, newMap));



    }

    public static Map.Entry<String, Integer> getNthSalary(Integer num, Map<String, Integer> map){
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList()
                .get(num-1);
    }

    public static Map.Entry<Integer, List<String>> getNthSalaryFromDuplicates(Integer num, Map<Integer, List<String>> map){
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(num - 1);
    }

    //public static M
}
