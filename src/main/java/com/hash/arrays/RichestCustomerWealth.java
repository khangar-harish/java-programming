package com.hash.arrays;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maximumWealth(int[][] accounts) {
        int max=0;
        if(accounts.length<0)
            return -1;

        for(int i=0; i<accounts.length; i++){
            if(accounts[i].length <= 50){
                int sum=0;
                for(int j=0; j<accounts[i].length; j++){
                    // if(accounts[i][j] >= 1 || accounts[i][j] <= 100)
                    //     sum = sum + accounts[i][j];
                    // else 
                    //     return -1;
                    sum = sum + accounts[i][j];
                }
                if(sum > max)
                    max = sum;
            }
        }return max;
	}

}
