package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP TO PRINT FACTORS/DIVISORS OF A GIVEN NUMBER ..?
///Factors are whole numbers that divide another number exactly, 
///leaving no remainder — for example, 1, 2, 4, and 8 are factors of 8.
//input : 6 
//output : 1 2 3 6 

//input : 12 
//output : 1 2 3 4 6 12 

//input : 24 
//output : 1 2 3 4 6 8 12 24 
public class TestLpDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 6
		findFactors(n);
		System.out.println("main method ended ");
	}

	static void findFactors(int n) {

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);

	}
}
