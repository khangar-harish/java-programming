package com.hash.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithExtraCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Boolean> kidsWithCandies(int[]candies,int extracandies){
        int max = 0;
        for(int candy : candies){
            max = Math.max(max, candy);
        }
        List<Boolean> list = new ArrayList<>();

        for(int i=0; i<candies.length; i++){
            list.add(max <=  candies[i] + extracandies);
        }    
        return list;
    }
}
