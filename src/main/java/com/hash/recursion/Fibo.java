package com.hash.recursion;

public class Fibo {

    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    private static int fibo(int n) {
        if(n <= 1)
            return n;

        return fibo(n-2) + fibo(n-1);
    }
}
