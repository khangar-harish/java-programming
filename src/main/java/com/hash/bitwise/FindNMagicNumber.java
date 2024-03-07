package com.hash.bitwise;

public class FindNMagicNumber {

    public static void main(String[] args) {
        int n = 5;
        int ans = 0 , base = 5;

        while (n > 0){
            int last = n & 1;
            n = n >> 1;
            ans = ans + last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
