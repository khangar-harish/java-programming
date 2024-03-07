package com.hash.new_features.lambda;

import com.hash.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaWithoutFunctional {

    interface Condition<T>{
        public boolean test(T t);
    }
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(32, "Hash", "Khan", "Edinburgh"),
                new Person(29, "Lado", "Mishra", "Pune"),
                new Person(30, "Palak", "Baniya", "Pune"),
                new Person(28, "Rahul", "Pawar", "Satara"),
                new Person(27, "Dany", "Shaikh", "Daund")
        );

        //print all persons
        System.out.println("***********Print All Persons*************");
        printOnConditionally(personList, p->true);

        //print who has age less than 30
        System.out.println("***********Print person has age less than 30*************");
        printOnConditionally(personList, p -> p.getAge() <= 30);

        //print who is in pune
        System.out.println("***********Print person who is in Pune*************");
        printConditionally(personList, p -> p.getCity().equals("Pune"));

    }

    //User defined generic method
    public static <T> void printOnConditionally(List<T> list, Condition<T> condition){
        for (T t : list) {
            if(condition.test(t)){
                System.out.println(t);
            }
        }
    }

    //Java 8 generic method
    public static <T> void printConditionally(List<T> list, Predicate<T> predicate){
        for (T t : list) {
            if(predicate.test(t)){
                System.out.println(t);
            }
        }
    }

}
