package com.hash.new_features.streams;

import com.hash.model.Person;

import java.util.*;

public class LambdaSorting {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry");
        fruits.sort(Comparator.naturalOrder());
        fruits.sort(Comparator.reverseOrder());
        System.out.println(fruits);

       // DBPersonList db = new DBPersonList();
        List<Person> pList = DBPersonList.getPersonList();
        //pList.sort(new MyComparator());
        //System.out.println(pList);

        pList.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
        System.out.println(pList);

        pList.stream().sorted((p1, p2) -> p1.getCity().compareTo(p2.getCity())).forEach(System.out::println);

        pList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);

    }
}

//class MyComparator implements Comparator<Person>{
//
//    @Override
//    public int compare(Person p1, Person p2) {
//        return p2.getAge() - p1.getAge();
//    }
//}