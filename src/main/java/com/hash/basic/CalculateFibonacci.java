package com.hash.basic;

import java.util.Scanner;

public class CalculateFibonacci {

	public static void main(String[] args) {
		System.out.println("Please enter input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first=0, second=1, sum=0;
		System.out.print(first+" "+second);
		for(int i=1; i<=n-2;i++) {
			sum = first+second;
			first = second;
			second = sum;
			System.out.print(" "+sum);
		}

	}

}
