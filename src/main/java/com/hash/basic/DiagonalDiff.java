package com.hash.basic;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> arrInner1 = new ArrayList<>();
		List<Integer> arrInner2 = new ArrayList<>();
		List<Integer> arrInner3 = new ArrayList<>();
		arrInner1.add(11);
		arrInner1.add(2);
		arrInner1.add(4);
		
		arrInner2.add(4);
		arrInner2.add(5);
		arrInner2.add(6);
		
		arrInner3.add(10);
		arrInner3.add(8);
		arrInner3.add(-12);
		
		arr.add(arrInner1);
		arr.add(arrInner2);
		arr.add(arrInner3);
		System.out.println(arr);
		int result = DiagonalDiff.diagonalDifference(arr);
		System.out.println(result);
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
        int diff = 0,sum1=0,sum2=0;
        for(int row=0; row<arr.size(); row++){
            for(int col=0; col<arr.size(); col++){
                if(row==col){
                    sum1=sum1+arr.get(row).get(col);
                }else if(row+col==2){
                    sum2=sum2+arr.get(row).get(col);
                }
            }
        }
        diff = sum1-sum2;
        return diff;
    }

}
