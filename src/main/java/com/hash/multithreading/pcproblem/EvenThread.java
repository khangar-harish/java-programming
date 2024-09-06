package com.hash.multithreading.pcproblem;

public class EvenThread implements Runnable{

    SharedResource resource;

    public EvenThread(SharedResource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        try {
            //resource.oneByOneThread();
            resource.evenNo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
