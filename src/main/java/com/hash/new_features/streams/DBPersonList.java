package com.hash.new_features.streams;

import com.hash.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DBPersonList {

    static List<Person> personList = Arrays.asList(
            new Person(18, "Raj", "Patel", "Surat"),
            new Person(20, "Jay", "Rana", "Delhi"),
            new Person(16, "Rahul", "Roy", "Mumbai"),
            new Person(25, "Tina", "Singh", "Patna"),
            new Person(28, "Rose", "Cena", "Goa"),
            new Person(22, "Aman", "Sen", "Pune")
    );

    public static List<Person> getPersonList() {
        return personList;
    }

    public static Map<Person, Integer> getPersonMap(){
        Map<Person, Integer> personMap = new TreeMap<>((p1, p2) -> p1.getAge() - p2.getAge());
        personMap.put(new Person(18, "Raj", "Patel", "Surat"), 10);
        personMap.put(new Person(20, "Jay", "Rana", "Delhi"), 40);
        personMap.put(new Person(16, "Rahul", "Roy", "Mumbai"), 20);
        personMap.put(new Person(25, "Tina", "Singh", "Patna"), 60);
        personMap.put(new Person(28, "Rose", "Cena", "Goa"), 20);
        personMap.put(new Person(22, "Aman", "Sen", "Pune"), 30);
        return personMap;
    }


}
