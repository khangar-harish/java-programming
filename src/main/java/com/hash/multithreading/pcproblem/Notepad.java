package com.hash.multithreading.pcproblem;

import java.util.Arrays;

public class Notepad {

    String [] str = new String[10];
    boolean isReadTurn = true;
    boolean isWriteTurn = false;
    int count = 0;

    protected int a;

//    public void printing(){
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(Thread.currentThread().getName());
//        }
//    }

    public synchronized void printing() throws InterruptedException {
        while (count < str.length) {
            if (isReadTurn && Thread.currentThread().getName().equals("Read Thread") ) {
                System.out.println(Thread.currentThread().getName());
                str[count++] = Thread.currentThread().getName();
                isReadTurn = false;
                notify();
            } else if (!isReadTurn && Thread.currentThread().getName().equals("Write Thread") ) {
                System.out.println(Thread.currentThread().getName());
                str[count++] = Thread.currentThread().getName();
                isReadTurn = true;
                notify();
            } else {
                wait();
            }
        }
        System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {

        Notepad note = new Notepad();
        Thread read = new Thread(new ReadThread(note));
        Thread write = new Thread(new WriteThread(note));

        read.setName("Read Thread");
        write.setName("Write Thread");

        read.start();
        write.start();
    }
}
