package com.hash.design_pattern;

public class Singleton {

    private static Singleton singletonObject;

    private Singleton() {
    }

    public synchronized static Singleton getSingletonObject(){
        if (singletonObject == null){
            singletonObject = new Singleton();
        }
        return singletonObject;
    }
}
