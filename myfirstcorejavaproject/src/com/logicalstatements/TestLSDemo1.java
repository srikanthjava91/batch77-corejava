package com.logicalstatements;

import java.util.Scanner;

//WAP to check the user age is Eligible or not for Voting and Driving ..? 
public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();// 22

		if (age >= 18) {
			System.out.println("Congratulation !! ");
			System.out.println("You are eligible for Voting & Driving ");
		} else {
			System.out.println("Babu Chitti niku inka time undi ra !!");
			System.out.println("Good day ");
		}

		System.out.println("main method ended !!");
	}

}
