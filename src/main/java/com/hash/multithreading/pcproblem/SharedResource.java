package com.hash.multithreading.pcproblem;

public class SharedResource {

    boolean isOddTurn = true;
    int no = 1;
    static int count = 1;
    public synchronized void oneByOneThread() throws InterruptedException {
        while (no <= 10){
            if(isOddTurn && no%2 != 0){
                System.out.println("Odd No "+no);
                isOddTurn = false;
                notify();
            } else if (!isOddTurn && no%2 == 0) {
                System.out.println("Even No "+no);
                isOddTurn = true;
                notify();
            }else {
                wait();
            }
            no++;
        }

    }

    public synchronized void oddNo(){
        isOddTurn = false;
        System.out.println("Odd "+count);
        notify();
        if (count < 10) {
            count++;
        }
    }

    public synchronized void evenNo() throws InterruptedException {
        while (isOddTurn){
            wait();
        }
        System.out.println("Even "+count);
        isOddTurn = true;
        if (count < 10) {
            count++;
        }
    }

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        OddThread p1 = new OddThread(resource);
        EvenThread p2 = new EvenThread(resource);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
    }
}
