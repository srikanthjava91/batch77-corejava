package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo9 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}

		}

		return status;
	}

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check the Prime or not .. ?");
		int n = sc.nextInt();

		boolean flag = isPrime(n);

		if (flag) {
			System.out.println("The Given number is Prime !!");
		} else {
			System.out.println("The Given number is not Prime !!");
		}

		System.out.println("main method started ");

	}

}
