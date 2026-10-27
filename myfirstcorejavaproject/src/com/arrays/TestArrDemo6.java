package com.arrays;

import java.util.Arrays;

public class TestArrDemo6 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };

		int[] b = { 5, 6, 7 };

		int[] c = new int[a.length + b.length];// 0 1 2 3 4 5 --> 0 0 0 0 0 0

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		System.out.println(Arrays.toString(c));

	}

}
