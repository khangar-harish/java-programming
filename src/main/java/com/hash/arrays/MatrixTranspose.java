package com.hash.arrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] transpose(int[][] matrix) {
		int[][] ans = new int[matrix[0].length][matrix.length];
			for(int i=0;i<matrix.length;i++){
					for(int j=0; j<matrix[0].length;j++){
						ans[j][i] = matrix[i][j];
					}
			}
			return ans;
	}
}
