package com.hash.recursion;

public class PowerOfNo {

    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }

    public static int power(int base, int power){

        if(power == 0)
            return 1;

        return base * power(base, power-1);
    }
}
