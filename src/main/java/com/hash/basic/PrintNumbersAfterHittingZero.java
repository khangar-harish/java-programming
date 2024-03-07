package com.hash.basic;

import java.util.Scanner;

public class PrintNumbersAfterHittingZero {

	public static void main(String[] args) {
		System.out.println("Please enter input string");
		Scanner sc = new Scanner(System.in);
		//System.out.println("Sum of all input is = "+printSum(sc));
		System.out.println("largest number from all input is = "+printMax(sc));

	}
	
	public static int printSum(Scanner sc) {
		int n, sum = 0;
		while(true) {
			n = sc.nextInt();
			if(n != 0) {
				sum = sum + n;
			}else {
				break;
			}	
		}
		return sum;
	}
	
	public static int printMax(Scanner sc) {
		int n, max = 0;
		while(true) {
			n = sc.nextInt();
			if(n != 0) {
				if(n >= max) {
					max = n;
				}
			}else {
				break;
			}	
		}
		return max;
	}

}
