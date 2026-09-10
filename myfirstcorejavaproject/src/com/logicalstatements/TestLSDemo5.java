package com.logicalstatements;

import java.util.Scanner;

//console based basic application.
//WAP to Check the Eligibility for marriage for Matrimonial site ..
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("Welcome to VCube Matrimonial !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String fullname = sc.nextLine();

		System.out.println("Hello mr. " + fullname + " : Nice to meet you ");

		System.out.println("Can you pleae enter your assets : ");
		double assets = sc.nextDouble();

		System.out.println("can you please enter your salary :");
		double salary = sc.nextDouble();

		if (assets >= 50000000.00 && salary >= 2500000.00) {
			System.out.println("Okay !! Great to know Lets continue the discussion ");

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (age >= 26 && age <= 29) {
				System.out.println("Okay to go Will discuss more ");

				System.out.println("Enter your height :");
				float height = sc.nextFloat();

				if (height >= 5.5 && height <= 6.2) {
					System.out.println("Okay Height is matching with our peofile lets continue ");
					
					System.out.println("Enter your weight : ");
					double weight = sc.nextDouble();
					
					if(weight >=65 && weight <=75) {
						System.out.println("Okay !! cool good to ");
						
						System.out.println("Do you have siblings ");
						boolean sibStatus = sc.nextBoolean();
						
						if(!sibStatus) {
							System.out.println("Okay will get back to you later !!");
						}else {
							System.out.println("OMG !!");
						}
						
					}else {
						System.out.println("You must need to join gym");
						System.out.println("You must need to ficus on your fitness ");
					}
					
				}else {
					System.out.println("You are short or long ");
				}

			} else {
				System.out.println("Sorry your age is not matching with our profile !");
			}

		} else {
			System.out.println("You can leave for the day ");
			System.out.println("Concentrate on your career ");
		}

	}

}
