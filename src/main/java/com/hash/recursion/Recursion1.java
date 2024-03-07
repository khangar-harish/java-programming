package com.hash.recursion;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printValue(4);
	}
	
	public static void printValue(int n) {
		if(n > 0) {
			
			System.out.println(n);
			printValue(n - 1);
		}
			
	}

}
