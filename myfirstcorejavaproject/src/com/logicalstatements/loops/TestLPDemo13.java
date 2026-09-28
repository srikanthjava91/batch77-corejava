package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print The number in a Reverse Order ..? 
//input : 567 
//output : 765 
public class TestLPDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int revNum = reverseNumber(n);
		System.out.println("The Reverse Numer for Given number is :  " + revNum);

		if (n == revNum) {
			System.out.println("The Given number is Palindrome ");
		} else {
			System.out.println("The Given numebr is not a Palindrome !");
		}

		System.out.println("main method ended ");
	}

	private static int reverseNumber(int n) {
		int rev = 0;
		int r = 0;

		//345
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;//54+3 = 543  
		}

		return rev;
	}

}
