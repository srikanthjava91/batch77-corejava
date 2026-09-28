package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to check the Given number is Palindrome or not ..? 
//input : 123 
//output : false 

//input : 454
//output : true 

public class TestLPDemo14 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");

		int n = sc.nextInt();

		boolean status = isPalin(n);
		if (status) {
			System.out.println("The Given number is Palindrome :");
		} else {
			System.out.println("The Given number is Not a Palindrome :");
		}

		System.out.println("main method ended ");

	}

	static boolean isPalin(int n) {
		boolean status = false;

		int r = 0;
		int rev = 0;
		int temp = n;
		
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		
		if(rev == temp) {
			status = true;
		}

		return status;
	}

}
