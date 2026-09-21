package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP TO PRINT PRIME NUMBERS FROM 0 TO n ..?
//Prime number means : Any number divisible by one and itself.
// 2 3 5 7 11 13 17 19 23 
public class TestLPDemo8 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}

		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many prime numbers you want to print ..? ");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 0; i <= n; i++) {

			if (isPrime(i)) {
				System.out.print(i + " ");
				System.out.println(count++);
			}

		}

		System.out.println("main method ended !!");
	}

}
