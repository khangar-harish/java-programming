package com.hash.arrays;

public class SumOfDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            // for(int j=i; j<mat[i].length; j++){
            //     if(i == j){
            //         sum = sum+mat[i][j];
            //         break;
            //     }
            // }
            int end = i;
            sum = sum+mat[i][end];
            int j = mat.length-1-i;
            if(i != j){
                sum = sum+mat[i][j];
            }


            // for(int j=mat.length-1; j>=0; j--){
            //     if(i != j && i+j == mat.length-1){
            //         sum = sum+mat[i][j];
            //         break;
            //     }
            // }
        }
        return sum;
    }

}
