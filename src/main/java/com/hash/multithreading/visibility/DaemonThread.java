package com.hash.multithreading.visibility;

import com.hash.multithreading.pcproblem.Notepad;

public class DaemonThread {

    public static void main(String[] args) {

        System.out.println("Main thread started");

        Runnable r1 = () -> {
            System.out.println("Thread 1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 task completed");
        };

        System.out.println(Thread.currentThread());

        Thread t1 = new Thread(r1);
        t1.setDaemon(true);
        t1.start();

        System.out.println("Main thread ended");
    }
}
