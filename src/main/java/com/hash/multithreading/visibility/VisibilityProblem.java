package com.hash.multithreading.visibility;

public class VisibilityProblem {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Runnable r1 = () -> {
            System.out.println("Thread 1");
            System.out.println("Thread 1 task running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.setFlag(true);
            System.out.println("Flag set to true by thread 1");
        };

        Runnable r2 = () -> {
            System.out.println("Thread 2");
            //Not running this while loop
            while (!sharedResource.isFlag()){
                System.out.println("Thread 2 task running");
            }
            System.out.println("Thread 2 task completed");
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t2.start();
        t1.start();

    }
}
