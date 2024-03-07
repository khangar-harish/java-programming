package com.hash.arrays;

import java.util.ArrayList;
import java.util.List;

public class CountItemMatchingRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> item1 = new ArrayList<>();
		item1.add("phone");
		item1.add("blue");
		item1.add("pixel");
		
		List<String> item2 = new ArrayList<>();
		item2.add("computer");
		item2.add("silver");
		item2.add("lenovo");
		
		List<String> item3 = new ArrayList<>();
		item3.add("phone");
		item3.add("gold");
		item3.add("iphone");
		
		List<List<String>> items = new ArrayList<>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		String ruleKey = "type", ruleValue = "phone";
		
		int ans = countMatches(items, ruleKey, ruleValue);
		System.out.println(ans);

	}
	
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if(ruleKey.equals("type")){
            for(List<String> str : items){
                if(str.get(0).equals(ruleValue))
                    count++;
            }
        }
        if(ruleKey.equals("color")){
            for(List<String> str : items){
                if(str.get(1).equals(ruleValue))
                    count++;
            }
        }
        if(ruleKey.equals("name")){
            for(List<String> str : items){
                if(str.get(2).equals(ruleValue))
                    count++;
            }
        }
        return count;
    }

}
