package com.hash.new_features.lambda;

import java.util.function.BiConsumer;

public class WrapperLamda {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 4};
        int key = 0;
        String str = null;
        String str1 = "Hash";

//        We can not change the value of str1, bcoz it is by default final
//        Closure -> If we are using not passing any local variable to lambda then
//        it will consider as final internally
        //str1 = "Harish";  Not allowed
        process(arr, key, wrapperLamda((v, k) -> System.out.println(v / k)));
        process1(str, wrapperLamda((s1, s2) -> System.out.println("Running "+str1)));
    }

    private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
        for(Integer v : arr){
            consumer.accept(v, key);
        }
    }

    private static void process1(String str1, BiConsumer<String, String> consumer) {
        System.out.println("1st");
        consumer.accept(str1, str1);
        System.out.println("3rd");
    }

    //Here we can manage exceptions so we can do this generic for all types of BiConsumer
    private static <T>BiConsumer<T, T> wrapperLamda(BiConsumer<T, T> consumer) {
        //create new lamda here
        return (a, b) -> {
            try {
                System.out.println("2nd");
                consumer.accept(a, b);
            }catch (Exception ex){
                System.out.println("Message = "+ex.getMessage());
            }
        };
    }
}
