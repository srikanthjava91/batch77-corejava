package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int n = sc.nextInt();

		int fact = findFact(n);

		System.out.println("Factorial of a Given number is  " + fact);
		System.out.println("main method started ");
	}
	
	static int findFact(int n){
		
		if(n==0 || n==1) {
			return 1;
		}
		
		//5 * findFact(4) --> 5 * 24 = 120
		//4 * findFact(3) --> 4 * 6 
		//3 * findFact(2) --> 3 * 2 
		//2 * findFact(1) --> 2 * 1 
		return n * findFact(n-1);
		
	}

}
