package com.hash.basic;

import java.util.Scanner;

public class PrintFactors {

	public static void main(String[] args) {
		System.out.println("Please enter input string");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		PrintFactors.printFactors(number);

	}
	
	public static void printFactors(int number) {
		for(int i=1; i<=number; i++) {
			if(number%i == 0) {
				System.out.print(i+ " ");
			}
		}
	}

}
