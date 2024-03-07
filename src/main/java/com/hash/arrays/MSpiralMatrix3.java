package com.hash.arrays;

import java.util.Arrays;

public class MSpiralMatrix3 {

	public static void main(String[] args) {
		
		int[][] result = spiralMatrixIII(5, 6, 1, 4);
		System.out.println(Arrays.deepToString(result));
	}
	
	 public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
	      int[][] result = new int[rows * cols][2];
	        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // Right, Down, Left, Up
	        int directionIndex = 0; // Start by moving to the right
	        int step = 0; // The number of steps to take in the current direction
	        int count = 1; // Counter for the number of cells visited

	        while (count <= rows * cols) {
	            for (int i = 0; i < step + 1; i++) {
	                int r = rStart;
	                int c = cStart;
	                if (r >= 0 && r < rows && c >= 0 && c < cols) {
	                    result[count - 1] = new int[]{rStart, cStart};
	                    count++;
	                }
	                rStart += directions[directionIndex][0];
	                cStart += directions[directionIndex][1];
	            }
	            directionIndex = (directionIndex + 1) % 4; // Change direction
	            if (directionIndex % 2 == 0) {
	                step++; // Increase step size every two directions
	            }
	        }

	        return result;
	    
	    }

}
