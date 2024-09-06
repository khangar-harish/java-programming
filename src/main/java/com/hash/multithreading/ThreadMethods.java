package com.hash.multithreading;

public class ThreadMethods implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " +i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods tm1 = new ThreadMethods();

        Thread t1 = new Thread(tm1);
        Thread t2 = new Thread(tm1);

        t1.start();
        t2.start();
        t1.join(2000);
    }

}
