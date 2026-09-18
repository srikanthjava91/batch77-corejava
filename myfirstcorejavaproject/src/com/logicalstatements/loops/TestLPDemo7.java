package com.logicalstatements.loops;

import java.util.Scanner;

//WAP TO PRINT FIBONACCI SERIES UP TO 20 NUMBERS ..? 
//input : How many numbers you want to print ..? 10 
//output : 0 1 1 2 3 5 8 13 21 34 

public class TestLPDemo7 {

	public static void main(String[] args) {
		System.out.println("Fibbonacci series : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to print ..? ");
		int n = sc.nextInt();

		fibbonacciSeries(n);

	}

	static void fibbonacciSeries(int n) {

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		System.out.print(n1 + " " + n2 + " ");// 0 1

		for (int i = 1; i <= n-2; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");// 1 2 3
			n1 = n2;//1 2 
			n2 = n3;//2 3
	 	}

	}

}
