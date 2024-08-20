package com.hash.new_features.streams;

import com.hash.model.Person;

import java.util.*;

public class SortingMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(31,"Hash");
        map.put(22,"Lado");
        map.put(13,"Palak");
        map.put(54,"Rahul");
        map.put(45,"Dany");

        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
       // Collections.sort(entries, (e1, e2) -> e1.getKey() - e2.getKey());
        entries.sort((e1, e2) -> Integer.compare(e2.getKey(), e1.getKey()));
        System.out.println(entries);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("************ Before sorting ************");
        Map<Person, Integer> pMap = DBPersonList.getPersonMap();
        for (Map.Entry<Person, Integer> e : pMap.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println("************ After sorting based on Key ************");
        pMap.entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByKey((p1, p2) -> p1.getAge() - p2.getAge()))
                .sorted(Map.Entry.comparingByKey((p1, p2) -> p2.getCity().compareTo(p1.getCity())))
                .forEach(System.out::println);
        System.out.println("************ After sorting based on Key ************");
        pMap.entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByKey((p1, p2) -> p1.getAge() - p2.getAge()))
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Person::getCity).reversed()))
                .forEach(System.out::println);
        System.out.println("************ After sorting based on Key ************");
        pMap.entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByKey((p1, p2) -> p1.getAge() - p2.getAge()))
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Person::getCity, Comparator.reverseOrder())))
                .forEach(System.out::println);

    }
}
