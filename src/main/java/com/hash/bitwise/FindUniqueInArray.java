package com.hash.bitwise;

import java.util.Arrays;

public class FindUniqueInArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 9, 4, 5, 4, 5, 2};
        //System.out.println(Arrays.toString(findUniqueElements(arr)));
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique = 0;
        for (int a : arr){
            //XOR a^0 = a  a^1 = -a  a^a = 0
            unique ^=a;
        }
        return unique;
    }
}
