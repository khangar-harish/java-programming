package com.hash.design_pattern;

public class DoubleLockSingleton {

    private static volatile DoubleLockSingleton singletonObj;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getSingletonObject(){
        if (singletonObj == null){
            synchronized (DoubleLockSingleton.class){
                if (singletonObj == null){
                    singletonObj = new DoubleLockSingleton();
                }
            }
        }
        return singletonObj;
    }
}
