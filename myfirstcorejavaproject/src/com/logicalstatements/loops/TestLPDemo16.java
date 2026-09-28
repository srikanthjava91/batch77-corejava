package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print the Given number is Armstrong or not ..?  

//An Armstrong number (also called a narcissistic number) is a number 
//that equals the sum of its own digits 
//each raised to the power of the total number of digits.
//—for example, 153 = 1³ + 5³ + 3³.
//Armstrong Number : 
//ex: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 
//ex: 370 = 3 ^3 + 7^3 + 0 = 27 + 343 = 370 
//ex: 371 = 3 ^3 + 7^3 + 1 = 27 + 343 + 1= 371
//ex: 1 = 1 to 9 

public class TestLPDemo16 {

	static boolean isArmStrong(int n) {
		boolean status = false;

		int r = 0;
		int sumP = 0;
		int temp = n;
		
//		int n1 = n;
//		int count = 0;
//		while (n1 > 0) {
//			n1 = n1 / 10;
//			count++;
//		}
		
		String str = Integer.toString(n);//371
		int digitCount = str.length();

		while (n > 0) {
			r = n % 10; // 153 %10 --> 3, 5, 1
			n = n / 10; // 153/10--> 15
//			sumP = sumP + r * r * r;// 27 + 125 + 1 = 153
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (sumP == temp) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isArmStrong(n);

		if (status) {
			System.out.println("The Given number is Armstrong !!");
		} else {
			System.out.println("The Given number is not an Armstrong..");
		}

	}
}
