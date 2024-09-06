package com.hash.multithreading;

public class OddEvenMethods {

    private boolean isOdd = true;
    public synchronized String oddNo(int no) throws InterruptedException {
        while (!isOdd){
            wait();
        }
        isOdd = false;
        notifyAll();
        return "Odd"+no;
    }

    public synchronized String evenNo(int no) throws InterruptedException {
        while(isOdd) {
              wait();
        }
        isOdd = true;
        notifyAll();
        return "Even"+no;
    }
}
