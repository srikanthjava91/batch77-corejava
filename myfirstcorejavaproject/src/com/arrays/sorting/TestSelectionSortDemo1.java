package com.arrays.sorting;

import java.util.Arrays;

public class TestSelectionSortDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		int[] arr = { 9, 7, 6, 2, 3, 1, 8, 4 };

		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));

		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("main method ended !");
	}
}
