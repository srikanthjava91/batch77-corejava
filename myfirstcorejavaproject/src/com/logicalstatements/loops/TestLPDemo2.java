package com.logicalstatements.loops;

//Q) WAP TO PRINT EVEN AND ODD NUMBERS from 0 to 100  ..?
public class TestLPDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		System.out.println("Even numbers : ");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		
		System.out.println("--------------------");
		System.out.println("odd numbers :");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1 && i != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("main method ended !!");
	}
}
