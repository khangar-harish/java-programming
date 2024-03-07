package com.hash.arrays;

public class HighestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public int largestAltitude(int[] gain) {
        int max = 0, current = 0;
        // for(int i=0; i<gain.length; i++){
        //    current = current + gain[i];
        //    max = Math.max(max, current);
        // }
        
        for(int i=0; i<gain.length; i++){
           current = current + gain[i];
           if(max <= current){
               max = current;
           }
        }
        return max;
    }

}
