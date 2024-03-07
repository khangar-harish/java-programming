package com.hash.basic;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("Please enter input string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		boolean palindrom = true;
		for(int i=0,j=len-1; i<j; i++,j-- ) {
			if(str.charAt(i) != str.charAt(j)) {
				palindrom = false;
				break;
			}
		}
		if(palindrom) {
			System.out.println("Plaindrom");
		}else {
			System.out.println("Not a Plaindrom");
		}
		
	}

}
