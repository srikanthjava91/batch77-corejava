package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print sum of the digits from Given number..?
//input : 4567
//output : 22
public class TestLPDemo11 {

	void main() {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int sumOfDigits = sumOfDigits(n);
		System.out.println("Sum of Digits is : " + sumOfDigits);

		System.out.println("main method ended ");

	}

	// 123
	int sumOfDigits(int n) {
		int sum = 0;
		int r = 0;
		int count = 0;

		while (n > 0) {
			r = n % 10;// 123%10 --> 3,12%10 --> 2, 1%10 = 1
			n = n / 10;// 123/10 --> 12,12/10 --> 1, 1/10 = 0
			sum = sum + r;// 3+ 2 + 1 = 6
			count++;
		}

		System.out.println("Digits count is : " + count);
		
		return sum;
	}

}
