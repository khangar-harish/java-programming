package com.hash.new_features.interfaces;

import java.util.function.Predicate;

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> checkLength = str -> str.length() >= 4;
		System.out.println(checkLength.test("Harish"));
		System.out.println(checkLength.test("abc"));

	}

}
