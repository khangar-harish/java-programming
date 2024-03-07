package com.hash.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ls = new ArrayList();
        int sum=0, rem; 
        for(int i=0;i<num.length;i++){
            sum = (sum*10)+num[i];
        }
        sum = sum+k;
        while(sum != 0){
            rem = sum % 10;
            ls.add(rem);
            sum =sum/10;
        }
        Collections.reverse(ls);
        return ls;
    }
}
