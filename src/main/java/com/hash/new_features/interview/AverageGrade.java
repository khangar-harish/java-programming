package com.hash.new_features.interview;

import java.util.*;
import java.util.stream.Collectors;

public class AverageGrade {

    public static void main(String[] args) {
        String[][] students= {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};

        System.out.println(calculateAvgGrade(students));

        List<Student> list = Arrays.stream(students)
                .map(student -> new Student(student[0], Integer.parseInt(student[1])))
                .toList();

        Map<String, Integer> collect = list.stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.collectingAndThen(Collectors.averagingInt(Student::getGrade),
                        avg -> (int) Math.round(avg))));

        Map.Entry<String, Integer> max = collect.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .orElseThrow(() -> new RuntimeException("Student Nof Found"));

        System.out.println(max.getKey());
        System.out.println(max.getValue());

    }

    private static int calculateAvgGrade(String[][] students) {

        Map<String, Integer[]> map = new HashMap<>();
        for (String [] student : students){
            String name = student[0];
            int grade = Integer.parseInt(student[1]);

            if(!map.containsKey(name)){
                map.put(name, new Integer[]{1, grade});
            }else {
                map.get(name)[0]++;
                map.get(name)[1] += grade;
            }
        }

        int max = Integer.MIN_VALUE;
        for (Integer [] marks : map.values()){
            max = Math.max(max, marks[1]/marks[0]);
        }
        return max;
    }
}

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}