package com.hash.arrays;

import java.util.ArrayList;
import java.util.List;

public class MSpiralMitrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, top=0, right=matrix[0].length-1, bottom=matrix.length-1;
        List<Integer> res = new ArrayList();
        while(top <= bottom && left <= right){
            for(int i = left; i<=right; i++){
                res.add(matrix[top][i]);
            }top++;

            for(int i = top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }right--;

            if(top <= bottom){
                for(int i = right; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }bottom--;
            }

            if(left <= right){
                for(int i = bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }left++;
            }
            
        }
        return res;
    }
}
