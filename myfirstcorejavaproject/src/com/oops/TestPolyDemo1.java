package com.oops;

//byte short int long float double 
public class TestPolyDemo1 {

	public static void main(String[] args) {

		TestPolyDemo1 t = new TestPolyDemo1();

		byte b = 123;
		System.out.println(b);// byte can convert to int ;

		System.out.println(t);
		System.out.println("Welcome to Method Overloading !!");// String
		System.out.println(1000);// int
		System.out.println(9972677655L);// long

		System.out.println();
		System.out.println(5.9F);// float
		System.out.println(75.5);// double

		System.out.println('M');// char
		System.out.println(true);// boolean

		char[] ch = { 'a', 'p', 'p' };
		System.out.println(ch);

	}

}
