package com.hash.new_features.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class findNthHighest {

    public static void main(String[] args) {

        System.out.println("Find 2nd highest element in array");
        int [] numbers = {5, 9, 11, 2, 8, 21, 1};
        Integer secondHighest = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighest);

        System.out.println("Find longest string in array");
        String [] strArray = {"Harish", "Kanishk", "Shailesh", "Purab", "bajrangibhaijaan"};
        System.out.println(strArray[1]);
        String longestString = Arrays.stream(strArray)
                        .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);
        System.out.println();

        System.out.println("Find element in array which starting from 1");
        List<String> numberStringList =  Arrays.stream(numbers).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(numberStringList);

        System.out.println("print array element using -");
        List<String> numberString =  Arrays.stream(numbers).boxed()
                .map(s -> s + "")
                .collect(Collectors.toList());
        String printNumbers =  String.join("-", numberString);
        System.out.println(printNumbers);

        System.out.println("Print array element from 1 to 5");
        List<Integer> arrayElements = Arrays.stream(numbers).boxed().skip(1).limit(4).toList();
        System.out.println(arrayElements);

        //Collectors.mapping()
    }
}
