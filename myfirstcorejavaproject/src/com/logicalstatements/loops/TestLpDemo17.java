package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to convert Decimal number to Binary number ..? 

//input : 10 
//output : 1010  =   2^3+ 2^2+2^1+2^0 = 8 + 2 = 10 

public class TestLpDemo17 {

	public static void main(String[] args) {

		System.out.println("main method staretd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		conevrtDecimalToBinary(n);

	}

	static void conevrtDecimalToBinary(int n) {

		int r = 0;
		String str = "";

		while (n > 0) {
			r = n % 2;// 10%2=0, 5%2 = 1, 2%2 = 0, 1%2 = 1
			n = n / 2;// 10/2 = 5, 5/2 = 2, 2/2 = 1, 1/2 = 0
			str = r + str;// 1010
		}

		System.out.println("Your Binary number is : " + str);
	}
}
