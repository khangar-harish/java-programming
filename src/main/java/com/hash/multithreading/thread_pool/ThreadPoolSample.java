package com.hash.multithreading.thread_pool;

import java.util.concurrent.*;

public class ThreadPoolSample {

    public static void main(String[] args) {

        RejectedExecutionHandler handler = (r, tp) -> {
            System.out.println("Rejected task = "+r.toString());
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), handler);

        for (int i = 0; i < 6; i++) {
            Future<?> future = executor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task processed by "+Thread.currentThread());
            });

        }
        executor.shutdown();

    }



}
