package com.logicalstatements;

import java.util.Scanner;

//WAP to print Cricketer Info Based on Jersey Number ..? 
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Jersey number  : ");
		int jno = sc.nextInt();

		switch (jno) {

		case 7:
			System.out.println("Mahendra Singh Dhoni + Jersey Number is : 7 ");
			System.out.println("Cool Captain ");
			System.out.println("Great Wicket Keeper & Talented Batsman");
			break;
		case 18:
			System.out.println("Virat Kohli + Jersey Number is 18 ");
			System.out.println("Consistent Batsman ");
			System.out.println("King kohli");
			break;
		case 45:
			System.out.println("Rohit Sharma  + Jersey Number is 45 ");
			System.out.println("Good Captain & Good Batsman ");
			break;
		case 3:
			System.out.println("Vaibhav Sooryavamsi + Jersey is 3");
			System.out.println("Buddodu gattiodu !!");
			break;
		default:
			System.out.println("Entered Jersey is not my favorite ");
		}

		System.out.println("main method ended ");
	}

}
