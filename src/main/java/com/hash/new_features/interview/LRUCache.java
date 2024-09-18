package com.hash.new_features.interview;

import java.util.LinkedHashSet;

public class LRUCache {

    private final Integer capacity;
    private LinkedHashSet<Integer> cache;

    public LRUCache(Integer capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashSet<>();
    }

    public void accessKey(Integer key ){

        if(cache.contains(key)){
            cache.remove(key);
        }else if (cache.size() == capacity){
            cache.remove(cache.getFirst());
        }
        cache.add(key);
    }

    public void display(){
        System.out.println(cache);
    }

    public static void main(String[] args) {
        LRUCache cache1 = new LRUCache(3);

        cache1.accessKey(10);
        cache1.accessKey(20);
        cache1.accessKey(30);
        cache1.accessKey(40);
        cache1.accessKey(30);
        cache1.accessKey(30);
        cache1.accessKey(30);

        cache1.display();

    }
}
