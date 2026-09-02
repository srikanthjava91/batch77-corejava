package com.langfundamentals.methods;

import java.util.Scanner;

//With Return type + no parameters
public class EmployeeSal {
	static Scanner sc = new Scanner(System.in);

	double getBonus() {
		System.out.println("Enter your Bonus ");
		double bonus = sc.nextDouble();
		return bonus;
	}

	double getHRA() {
		System.out.println("Enter your HRA ");
		double hra = sc.nextDouble();
		return hra;
	}

	double getBasicSalary() {
		System.out.println("Enter your Basic salary : ");
		double sal = sc.nextDouble();
		return sal;

	}

	void main(String[] args) {
		System.out.println("main method started !!");

		double basicSal = getBasicSalary();
		double hra = getHRA();
		double bonus = getBonus();
		
		System.out.println("Total Salary : " + basicSal + hra + bonus);
		// BODMAS
		System.out.println("Total Salary : " + (basicSal + hra + bonus));
		System.out.println("main method ended !!");

	}

}
