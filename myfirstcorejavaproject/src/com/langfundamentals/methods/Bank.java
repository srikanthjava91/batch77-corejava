package com.langfundamentals.methods;

import java.util.Scanner;

public class Bank {

	double balance = 10000.00;

	void main(String[] args) {
		System.out.println("Welcome To VCube Bank !!");
		showBalance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deposite amount is : ");
		double amount = sc.nextDouble();
		deposite(amount);
		
		System.out.println("Withdraw amount is : ");
		double amount1 = sc.nextDouble();
		withdraw(amount1);
		
		
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showBalance();
	}

	void deposite(double amount) {
		balance = balance + amount;
		showBalance();
	}

	void showBalance() {
		System.out.println("The Current Balanace is: " + balance);
		System.out.println("THANK YOU !!!!");
	}
}
