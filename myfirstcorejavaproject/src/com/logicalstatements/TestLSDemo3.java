package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salry ");

		double salary = sc.nextDouble();

		if (salary > 600000.00) {
			System.out.println("You are eligible for Personal Loan ");
		} else {
			System.out.println("Concentrate on your carrer !!");
		}
	}

}
