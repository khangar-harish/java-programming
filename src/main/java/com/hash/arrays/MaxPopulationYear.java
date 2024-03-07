package com.hash.arrays;

public class MaxPopulationYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maximumPopulation(int[][] logs) {
        int[] year = new int[101];

        for(int[] log : logs){
            year[log[0]-1950] += 1; 
            year[log[1]-1950] -= 1; 
        }

        int maxNum = year[0], maxYear = 1950;
        for(int i = 1; i<101; i++){
            year[i] += year[i-1];

            if(maxNum < year[i]){
                maxNum = year[i];
                maxYear = 1950 + i;
            }
        }return maxYear;
    }
}
