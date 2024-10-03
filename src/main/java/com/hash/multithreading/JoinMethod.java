package com.hash.multithreading;

public class JoinMethod {

        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
//                try {
//                    Thread.sleep(500);  // Simulate work with sleep
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        };
        public static void main(String[] args) {
            JoinMethod join = new JoinMethod();

            Thread t1 = new Thread(join.r, "First");
            Thread t2 = new Thread(join.r, "Second");

            t1.start();
            t2.start();

            try {
                //t1.join();  // Wait for t1 to finish
                t2.join();  // Wait for t2 to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Both threads have finished execution.");
        }
}

