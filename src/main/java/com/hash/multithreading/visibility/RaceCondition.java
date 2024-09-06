package com.hash.multithreading.visibility;

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {

        SharedResource sharedResource = new SharedResource();

        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++) {
                sharedResource.increment();
            }
            System.out.println("Thread 1 task completed "+sharedResource.getCount());
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 10000; i++) {
                sharedResource.increment();
            }
            System.out.println("Thread 2 task completed "+sharedResource.getCount());
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count " +sharedResource.getCount());

    }
}
