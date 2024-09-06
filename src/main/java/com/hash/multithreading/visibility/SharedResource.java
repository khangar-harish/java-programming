package com.hash.multithreading.visibility;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

    public volatile boolean flag = false;
    private final AtomicInteger count = new AtomicInteger(0);
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public int getCount() {
        return count.get();
    }
    public void increment() {
        this.count.incrementAndGet();
    }
}
