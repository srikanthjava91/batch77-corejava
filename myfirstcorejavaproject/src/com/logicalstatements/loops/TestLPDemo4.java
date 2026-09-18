package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP THE GIVEN NUMBER IS PERFECT OR NOT ..?
//A perfect number is a positive integer that is equal to the sum of its positive divisors, 
//excluding the number itself. 
//For example, the number 6 is a perfect number because 
//its divisors (excluding itself) are 1, 2, and 3, and their sum is 6 (1 + 2 + 3 = 6) .

//input : 6 
//output : true 
public class TestLPDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		boolean flag = isPerfect(n);

		if (flag) {
			System.out.println("The Given number is Perfect ");
		} else {
			System.out.println("The Given number is not Perfect ");
		}

	}

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;// 6

		for (int i = 1; i <= n / 2; i++) {

			if (n % i == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("-------------------");
		
		if (sum == n) {
			status = true;
		}

		return status;
	}

}
