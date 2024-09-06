package com.hash.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentProblem {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer, Integer> entry = itr.next();
            System.out.println("Map value : " + entry.getKey());
            if(entry.getKey().equals(2)){
                //map.remove(entry.getKey());
                itr.remove();
            }
            System.out.println("Map value : " + entry);
        }
        System.out.println(map);
    }
}
