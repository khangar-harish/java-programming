package com.hash.arrays;

public class MSetMatrixZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setZeroes(int[][] matrix) {
        boolean row = false, col=false;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    if(i == 0)
                        row = true;
                    if(j == 0)
                        col = true;
                    
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
            
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(row){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        if(col){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }

    }
}
