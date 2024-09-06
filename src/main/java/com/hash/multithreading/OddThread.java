package com.hash.multithreading;

public class OddThread implements Runnable{

    PrintOddEvenNumbers printOddEvenNumbers;

    public OddThread(PrintOddEvenNumbers printOddEvenNumbers) {
        this.printOddEvenNumbers = printOddEvenNumbers;
    }

    @Override
    public void run() {
        try {
            printOddEvenNumbers.printOddNo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
