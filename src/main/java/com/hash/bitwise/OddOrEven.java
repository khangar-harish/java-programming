package com.hash.bitwise;

public class OddOrEven {

    public static void main(String[] args) {
        int no = 17*2;
        System.out.println(isOdd(no));
    }

    public static boolean isOdd(int no){
        return (no & 1) == 1;
    }
}
