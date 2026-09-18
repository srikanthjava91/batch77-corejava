package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP TO PRINT FACTORIAL OF A GIVEN NUMBER USING FOR LOOP ..? 
//input : 4! --> 4 * 3 * 2 * 1 
//output : 24 

//input : 6! --> 6 * 5 * 4 * 3 * 2 * 1 
//output : 720 
public class TestLPDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int n = sc.nextInt();

		long fact = findFact(n);

		System.out.println("Factorial of a Given number is  " + fact);
		System.out.println("main method started ");
	}

	static long findFact(int n) {
		long fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;// 1*6 =6 *5= 30 *4 = 120*3 = 360*2 = 720*1 = 720
		}

		return fact;
	}

}
