package com.hash.arrays;

public class EvenNoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int findNumbers(int[] nums) {
	      int total = 0;
	      for(int i=0; i<nums.length; i++){
	        int no = nums[i];
	        int count = 0;
	        while(no != 0){
	          no = no/10;
	          count++;
	        }
	        if(count%2==0){
	          total++;
	        }
	      }
	      return total;
	    } 
}
