package com.oops.loanapp;

import java.util.Scanner;

//Parent or Super or Base
public class LoanImpl implements Loan {

	static Scanner sc = new Scanner(System.in);

	private String getName() {
		return "Loan";
	}
	
	 Number getOffer() {
		return 2.0;
	}

	@Override
	public void hello() {
		System.out.println("Hello method called from Loan !!");
	}

	@Override
	public Double getEmployeeSalary() {
		System.out.println("Enter your Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	@Override
	public int getEmployeeAge() {
		System.out.println("ENter your age : ");
		int age = sc.nextInt();
		return age;
	}

	@Override
	public int getCibilScore() {
		System.out.println("Enter Cibil score !");
		int cibil = sc.nextInt();
		return cibil;
	}

	@Override
	public double getROI() {
		System.out.println("ROI Interest Called from Loan");
		double roi = 15.5;
		int cibil = getCibilScore();

		if (cibil > 800 && cibil <= 900) {
			System.out.println("Excellent : Strong credit profile, best loan terms.");
			roi = 9.0;
		} else if (cibil > 770 && cibil <= 800) {
			System.out.println("Very Good : High approval chances, competitive rates.");
			roi = 9.5;
		} else if (cibil > 700 && cibil <= 770) {
			System.out.println("Good : Eligible for most loans with decent terms.");
			roi = 10.0;
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("Average  : May get loans but at higher interest.");
			roi = 12.0;
		} else if (cibil > 300 && cibil <= 600) {
			System.out.println("Poor : High risk; loan applications often rejected. ");
			roi = 14.5;
		} else {
			System.out.println("Invalid Cibil score ");
		}

		return roi;
	}

	@Override
	public boolean isAadharValid() {
		System.out.println("Enter your 12 digit aadhar card number ");
		String aadhar = sc.next();
		boolean aadharStatus = aadhar.matches("[2-9][0-9]{11}");
		return aadharStatus;
	}

	@Override
	public boolean isPanValid() {
		System.out.println("Enter your 10 digit PAN card number ");
		String pan = sc.next();
//		ABCDE3751A
		boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panStatus;
	}

	@Override
	public boolean isPhoneValid() {
		System.out.println("Enter your 10 digit Phone number ");
		String phone = sc.next();
		boolean phoneStatus = phone.matches("[6-9]{1}[0-9]{9}");
		return phoneStatus;
	}

}
