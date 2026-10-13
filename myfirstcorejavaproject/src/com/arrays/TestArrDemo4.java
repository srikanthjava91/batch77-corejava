package com.arrays;

//WAP to print sum and avg of Student marks..? 
public class TestArrDemo4 {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };// 0 1 2 3 4 5

		double sum = 0;
		double avg = 0;

//		for (int m : marks) {
//			sum += m;
//		}

		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		avg = sum / marks.length;

		System.out.println("Sum of the marks : " + sum);
		System.out.println("Avg of the marks : " + avg);
	}
}
