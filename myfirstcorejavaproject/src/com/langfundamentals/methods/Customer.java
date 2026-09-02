package com.langfundamentals.methods;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id : ");
		int id = sc.nextInt();

		System.out.println("Enter name : ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Enter Phone : ");
		long ph = sc.nextLong();

		System.out.println("Enter Gender info : ");
		char c = sc.next().charAt(0);// Method Chaining

		getCusterName(name);
		getCustomerID(id);
		getCustomerPhone(ph);
		getGenderInfo(c);

		System.out.println("main method ended ");
	}

	static void getGenderInfo(char c) {
		System.out.println("Gender is : " + c);
	}

	static void getCustomerID(int id) {
		System.out.println("Customer ID is : " + id);
	}

	static void getCusterName(String name) {
		System.out.println("Name of the Customer is : " + name);
	}

	static void getCustomerPhone(long phone) {
		System.out.println("Phone number is : " + phone);
	}

	void getCustomerCity(String city) {

	}

	void getCustomerPAN(String pan) {

	}

}
