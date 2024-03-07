package com.hash.basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first input");
		int n1 = sc.nextInt();
		System.out.println("Please enter second input");
		int n2 = sc.nextInt();
		
		
		for(int i=n1;i<=n2;i++) {
			int num = i;
			int rem=0,sum =0;
			while(num!=0) {
				rem = num%10;
				sum = sum+rem*rem*rem;
				num = num/10;
			}
			if(i==sum)
				System.out.println(sum);
		}

	}

}
