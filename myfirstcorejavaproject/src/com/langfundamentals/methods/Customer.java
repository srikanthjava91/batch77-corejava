package com.langfundamentals.methods;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id : ");
		int id = sc.nextInt();

		System.out.println("Enter name : ");
		String name = sc.nextLine();

		System.out.println("Enter Phone : ");
		long ph = sc.nextLong();

		getCusterName(name);
		getCustomerID(id);
		getCustomerPhone(ph);

		System.out.println("main method ended ");
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
