package com.arrays;

public class TestArrDemo8 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];// rows & column 0 1 2 --> 0 1 2 3

//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		// 00 01 02 03
		// 10 11 12 13
		// 20 21 22 23

		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		arr[0][3] = 400;

		arr[1][0] = 500;
		arr[1][1] = 600;
		arr[1][2] = 700;
		arr[1][3] = 800;

		arr[2][0] = 900;
		arr[2][1] = 1000;
		arr[2][2] = 1100;
		arr[2][3] = 1200;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

//		for (int[] a1 : arr) {
//			for (int a : a1) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
//		}

	}

}
