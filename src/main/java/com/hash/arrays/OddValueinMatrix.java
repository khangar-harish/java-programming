package com.hash.arrays;

public class OddValueinMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        int count = 0;
        for(int row = 0; row<indices.length; row++){
            int r = indices[row][0];
            int c = indices[row][1];

            for(int i = 0; i < n; i++){
                mat[r][i]++;
            }

            for(int i = 0; i < m; i++){
                mat[i][c]++;
            }
        } 
        for(int[] arr : mat){
            for(int i : arr){
                if(i%2 != 0){
                    count++;
                }
            }
        }return count;
    }

}
