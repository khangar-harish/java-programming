package com.hash.multithreading;

public class EvenThread implements Runnable{
    PrintOddEvenNumbers printOddEvenNumbers;

    public EvenThread(PrintOddEvenNumbers printOddEvenNumbers) {
        this.printOddEvenNumbers = printOddEvenNumbers;
    }

    @Override
    public void run() {
        try {
            printOddEvenNumbers.printEvenNo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
