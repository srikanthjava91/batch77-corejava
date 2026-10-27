package com.arrays;

///Q) WAP to print min & max number from Given Array ..? 
public class TestArrDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 7, 18, 77, 3, -9 };

		int min = arr[0];// 7 3 1
		int max = arr[0];// 7

//		for loop 
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			} else if (arr[i] > max) {
//				max = arr[i];
//			}
//		}

//		Enhanced for loop or for each loop 
		for (int a : arr) {
			if (a < min) {
				min = a;
			} else if (a > max) {
				max = a;
			}
		}

		System.out.println("Minimum value from an array is : " + min);
		System.out.println("Maximum value from an array is : " + max);

	}

}
