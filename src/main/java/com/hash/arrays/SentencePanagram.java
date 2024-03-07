package com.hash.arrays;

import java.util.HashSet;
import java.util.Set;

public class SentencePanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean checkIfPangram(String sentence) {
        Set<Character> keyset = new HashSet();
        for(Character ch : sentence.toCharArray()){
            keyset.add(ch);
        }
        if(keyset.size() == 26)
            return true;
        else
            return false;


        // Map<Character, Integer> map = new HashMap();
        // for(int i=0; i<sentence.length(); i++){
        //     map.put(sentence.charAt(i), 1);
        // }
        // if(map.size() == 26)
        //     return true;
        // else
        //     return false;
	}	

}
