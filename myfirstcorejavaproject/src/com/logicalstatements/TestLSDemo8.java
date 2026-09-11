package com.logicalstatements;

import java.util.Scanner;

//WAP to print calculation Based on two numbers & with Arithmetic Operator Symbol.
public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("VCUbe Educaltional System ");
		String yn = "";

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a First number : ");
			double d1 = sc.nextDouble();

			System.out.println("Enter a second number : ");
			double d2 = sc.nextDouble();

			System.out.println("Enter a Symbol like + - * / %  ");
			String symb = sc.next();

			switch (symb) {

			case "+" -> System.out.println("Sum of Two numbers is : " + (d1 + d2));
			case "-" -> System.out.println("Difference of Two numbers is : " + (d1 - d2));
			case "*" -> System.out.println("Product of Two numbers is : " + (d1 * d2));
			case "/" -> System.out.println("Quotient of Two numbers is : " + (d1 / d2));
			case "%" -> System.out.println("Reminder of Two numbers is : " + (d1 % d2));
			default -> System.out.println("Invalid SYmbol entred please check ");
			}

			System.out.println("Do you Want ti COntinue ..? Click Y for Yes or Click N for NO ");
			yn = sc.next();// y or n

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("You clicked for EXIT !!");
	}

}
