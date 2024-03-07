package com.hash.arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> luckyNumbers (int[][] matrix) {
        int[] minArray = new int[matrix.length];
        int[] maxArray = new int[matrix[0].length];
        List<Integer> ls = new ArrayList();
        for(int i=0; i<matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[i].length; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }minArray[i] = min;
            }
        }

        for(int i=0; i<matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }maxArray[i] = max;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<minArray.length; i++){
            if(max < minArray[i]){
                max = minArray[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<maxArray.length; i++){
            if(min > maxArray[i]){
                min = maxArray[i];
            }
        }
        if(min == max){
            ls.add(max);
        }
        return ls;
    }
	
	//Space Optimize
	public List<Integer> luckyNumbers1 (int[][] matrix) {
        int minMax = Integer.MIN_VALUE;
        int maxMin = Integer.MAX_VALUE;

        List<Integer> ls = new ArrayList();
        for(int i=0; i<matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[i].length; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
            if(minMax < min){
                minMax = min;
            }
        }

        for(int i=0; i<matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }
            }
            if(maxMin > max){
                maxMin = max;
            }
        }

        if(minMax == maxMin){
            ls.add(minMax);
        }
        return ls;
    }

}
