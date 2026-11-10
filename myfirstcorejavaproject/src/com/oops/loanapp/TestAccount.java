package com.oops.loanapp;

//Parent / Super / Base 
class Account {

	double balance = 10000.00;
	long accountNumber = 12345;

	void openAccount() {
		System.out.println("Welcome to Vcube Banking.");
		System.out.println("Your Account has been Opened Successfully !!");
	}

	void displayAccountDetails() {
		System.out.println("Your ACcount Details are : ");
	}

}

//SIngle Inheritance : One class can extends another class with consider as Single Inheritance
//Child / SUb / Derived 
class BankAccount extends Account {

	void deposit(double amount) {
		System.out.println("Deposited amount is : " + amount);
		balance = balance + amount;
		checkBalance();
	}

	void withdraw(double amount) {
		System.out.println("Withdraw amount is : " + amount);
		balance = balance - amount;
		checkBalance();
	}

	void checkBalance() {
		System.out.println("The Current balance is : " + balance);
	}

}

class SavingAccount extends BankAccount {
	
	void calculateInterest(){
		System.out.println("calculateInterest  called ");
	}
	

}

public class TestAccount {

	public static void main(String[] args) {
		System.out.println("main method started ");

		SavingAccount ba = new SavingAccount();
		ba.openAccount();
		ba.displayAccountDetails();
		ba.withdraw(1000);
		ba.deposit(20000);
		ba.calculateInterest();
		System.out.println("main method ended ");

	}

}
