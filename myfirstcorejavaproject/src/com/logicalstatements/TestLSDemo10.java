package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Day number !!");
		int day = sc.nextInt();
		String info = getDayInfo(day);
		System.out.println(info);

	}

	private static String getDayInfo(int day) {

		String info = switch (day) {
		case 1 -> {
			System.out.print("It is a Holiday !!");
			yield "Sunday";
		}

		case 2 -> {
			System.out.print("It is a Lazy day !!");
			yield "Monday";
		}

		case 3, 4, 5 -> {
			System.out.print("These are Rotinue days !!");
			yield "TWT";
		}

		case 6 -> {
			System.out.print("Preparation day ");
			yield "Friday";
		}

		case 7 -> {
			System.out.print("Exams day ");
			yield "Saturday";
		}

		default -> "not available";
		};

		return info;
	}

}
