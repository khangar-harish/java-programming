package com.hash.basic;

import java.util.Scanner;

public class LCMandHCF {
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int n1 = sc.nextInt();
		System.out.println("Please enter second number");
		int n2 = sc.nextInt();
		System.out.println("LCM of 2 given numbers is "+ getLCM(n1, n2)+" looping count "+count);
		System.out.println("HCF of 2 given numbers is "+ getHCF(n1, n2));
		int lcm = n1*n2/getHCF(n1, n2);
		System.out.println("LCM with diff logic "+lcm);
	}
	
	public static int getLCM(int n1, int n2) {
		int lcm = (n1 > n2) ? n1 : n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				return lcm;
			}lcm++;
			count++;
		}
	}
	
	public static int getHCF(int n1, int n2) {
		int hcf = (n1 < n2) ? n1 : n2;
		for(int i=2;i<=hcf;i++) {
			if(n1%i==0 && n2%i==0) {
				hcf = i;
			}
		}return hcf;
	}
}
