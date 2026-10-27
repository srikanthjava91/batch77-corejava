package com.arrays;

public class TestArrDemo13 {

	public static void main(String[] args) {
		int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } },
				{ { 100, 200, 300 }, { 400, 500, 600 }, { 700, 800, 900 } } };
		System.out.println(arr);

		for (int[][] a2 : arr) {
			for (int[] a1 : a2) {
				for (int a : a1) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
