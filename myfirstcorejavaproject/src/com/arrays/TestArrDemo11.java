package com.arrays;

//Jagged Arrays 
public class TestArrDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80 } };
		System.out.println(arr);

//		for (int[] a1 : arr) {
//			for (int a : a1) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
