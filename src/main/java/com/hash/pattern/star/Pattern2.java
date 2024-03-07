package com.hash.pattern.star;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {   
				System.out.print("* ");
			}
			System.out.println();			
		}
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= n-i; k++) {
				System.out.print("* ");
			}
			System.out.println();			
		}
	}

}
