package com.arrays.sorting;

import java.util.Arrays;

public class BubbleSortDemo1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		int temp = 0;

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			count1++;
			boolean isSwapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					isSwapped = true;
				}

				count2++;
			}

			if (!isSwapped) {
				break;
			}
		}

		System.out.println("Count1 : " + count1);
		System.out.println("Count2 : " + count2);

		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
	}

}
