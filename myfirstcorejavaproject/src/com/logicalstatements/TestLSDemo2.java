package com.logicalstatements;

import java.util.Scanner;

//Venkatanagasrikanth --> 19 
public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Full Name : ");
		String fullname = sc.nextLine();

		if (fullname.length() >= 15) {
			System.out.println("Your name is too long..");
			System.out.println("Give a Short name !!");
		} else {
			System.out.println("Mr : " + fullname);
			System.out.println("You can add your name to the application");
		}

	}
}
