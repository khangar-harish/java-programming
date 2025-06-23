package com.hash.fanduel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class GenericCache <A, R>{
    private final Map<A, R> cache = new ConcurrentHashMap<>();
    private final Function<A, R> generator;

    public GenericCache(Function<A, R> generator) {
        this.generator = generator;
    }

    public R getOrCreate(A key) {
        return cache.computeIfAbsent(key, generator);
    }
}
//Stores the function so it can be used later.
//Lazy loading: value is only created when needed.
//Atomicity: multiple threads won’t compute the same value at the same time.
//Thread safety: no manual locking or synchronization needed.
//Uses generics → reusable across systems
//Uses ConcurrentHashMap → thread-safe and scalable
//Uses computeIfAbsent → concise, avoids race conditions
//Encapsulates caching logic cleanly


//What is cache & what are the strategies and which one to use when?
//Cache eviction strategy and how to come up with it
//What is concurrency and concurrenthashmap?
//explain SOLID principles?
//What is the use of generic and why it is useful
//Multithreading or Executor framework
//What is Lambda & Java 8 stream API
//Ensure thread safety
//Exception Handling in this code
//How I ensure to think aloud like a peer doing a code review and Suggest practical improvements, not just theoretical ones