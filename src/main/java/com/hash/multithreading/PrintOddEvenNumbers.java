package com.hash.multithreading;

import com.hash.bitwise.OddOrEven;

public class PrintOddEvenNumbers {

    public int count = 0;
    public boolean isEven = false;

    public PrintOddEvenNumbers(int count) {
        this.count = count;
    }

//    public void printNumbers() throws InterruptedException {
//        while (count <= 50){
//            if(isEven){
//                System.out.println("Even Thread "+ count);
//                notify();
//            }else {
//
//            }
//        }
//    }
    public synchronized void printOddNo() throws InterruptedException {
        while (count <= 10) {
            if (count % 2 != 0) {
                System.out.println("Read by Odd "+count);
                count++;
                notify();
            } else {
                wait();
            }
        }
    }

    public synchronized void printEvenNo() throws InterruptedException {
        while (count < 10) {
            if (count % 2 != 0) {
                wait();
            } else {
                System.out.println(count++);
                notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        PrintOddEvenNumbers resource = new PrintOddEvenNumbers(5);

        OddThread p1 = new OddThread(resource);
        EvenThread p2 = new EvenThread(resource);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();

    }
}
