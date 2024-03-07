package com.hash.new_features.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(70);
		al.add(50);
		al.add(20);
		al.add(90);
		
		System.out.println("Before Sorting "+al);
		
		Comparator<Integer> c = (I1, I2) -> (I1<I2)? -1: (I1>I2)? 1: 0;
		Collections.sort(al, c);
		
		System.out.println("After Sorting "+al);
		
		al.stream().forEach(System.out::println);
		
		BasicLambda.AddFunction addFunction = (a, b) ->a+b;
		System.out.println(addFunction.add(10,11));
	}

}
