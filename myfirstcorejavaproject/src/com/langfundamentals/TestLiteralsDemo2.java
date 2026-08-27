package com.langfundamentals;

public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		float f1 = 10;
		float f2 = 123;
		////Type mismatch: cannot convert from double to float
//		float f3 = 123.5;
		float f4 = 0123;
		float f5 = 0123.5F;
		float f6 = 0123F;
		float f7 = 123F;

		float f8 = 0x123;
		float f9 = 0x123F;
//		float f10 = 0x123.5F;//Invalid hex literal number
		
		double d1 = 123d;
		double d2 = 0x123d;

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		System.out.println(f9);
//		System.out.println(f10);
		System.out.println(d1);
		System.out.println(d2);

	}

}
