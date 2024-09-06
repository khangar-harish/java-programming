package com.hash.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProblemSolved {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer, Integer> entry = itr.next();
            System.out.println("Map value : " + entry.getKey());
            if(entry.getKey().equals(2)){
                map.remove(3); //Not removing element
                map.put(4, 40);
            }
            System.out.println("Map value : " + entry);
        }
        System.out.println(map);
    }
}
