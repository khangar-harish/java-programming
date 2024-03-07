package com.hash.basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Please enter input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%4==0 && n%100 != 0 || n%400==0) {
			System.out.println(n+" is a Leap Year");
		}else {
			System.out.println(n+" is not a Leap Year");
		}

	}

}
