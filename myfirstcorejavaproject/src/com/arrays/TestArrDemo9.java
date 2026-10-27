package com.arrays;

public class TestArrDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String[][] names = new String[2][3];// 0 1 --> 0 1 2

		names[0][0] = "J2SE";
		names[0][1] = "J2EE";
		names[0][2] = "SPRING";

		names[1][0] = "SQL";
		names[1][1] = "UI";
		names[1][2] = "React";

//		for (String[] n1 : names) {
//			for (String n : n1) {
//				System.out.print(n + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
