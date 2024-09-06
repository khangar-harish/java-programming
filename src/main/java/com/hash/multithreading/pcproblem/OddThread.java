package com.hash.multithreading.pcproblem;

public class OddThread implements Runnable{

    SharedResource resource;

    public OddThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        //resource.oneByOneThread();
        resource.oddNo();
    }
}
