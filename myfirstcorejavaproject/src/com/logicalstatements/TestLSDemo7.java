package com.logicalstatements;

import java.util.Scanner;

//WAP to print T-shirt Description Based on the size.?
public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("Welcome to VCube Shopping Mall ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your T-shirt Size : ");
		int size = sc.nextInt();

		switch (size) {
		case 36 -> {
			System.out.println("Based on your T-Shirt number the Size would Small ");
			System.out.println("The price is 999/-");
		}
		case 38 -> System.out.println("Based on your T-Shirt number the Size would Medium ");
		case 40 -> System.out.println("Based on your T-Shirt number the Size would Large ");
		case 42 -> System.out.println("Based on your T-Shirt number the Size would X-Large ");
		case 44 -> System.out.println("Based on your T-Shirt number the Size would XX-Large ");
		default -> System.out.println("Entered T-shirt size is not available !!");
		}

	}

}
