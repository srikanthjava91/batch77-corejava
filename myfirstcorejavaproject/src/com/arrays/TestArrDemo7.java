package com.arrays;

import java.util.Scanner;

//Q) WAP to read the content from the SCanner for an Array elements..?
//And find & print even numbers from a given elements.
public class TestArrDemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size : ");
		int size = sc.nextInt();// 5

		int[] arr = new int[size];// 0 1 2 3 4

		System.out.println("Enter Elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Even number from an array : ");
		for (int a : arr) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
		}

	}

}
