package com.langfundamentals;

//90 --> 180 --> 200+ 
public class TestLiteralsDemo3 {

	public static void main(String[] args) {
		
		Integer i1 = null;
//		int i2 = null;//Type mismatch: cannot convert from null to int
		

//		null Literals 
		String s3 = null;
		TestLiteralsDemo3 t2 = null;

		s3 = new String("Srikanth");
		System.out.println(s3);

//		 String Literals are storing in SCP : String Constant Pool
		String s1 = "Java";// SCP --> 1 object
		String s2 = new String("Vcube");// 2 object = 1 scp + 1 heap

		System.out.println(s1);
		System.out.println(s2);

		// boolean Literals
		boolean areYouTtendingClassesRegularly = true;
		if (areYouTtendingClassesRegularly) {
			System.out.println("Congrtualtions !! You will get a Job");
		} else {
			System.out.println("God will sace you !!");
			System.out.println("You are cheating your parent directly !! !!");
		}

		// Char Literals
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0040';
		char c4 = '\ufaaa';

		System.out.println(c1);// A
		System.out.println(c2);// A
		System.out.println(c3);// @
		System.out.println(c4);// @

	}

}
