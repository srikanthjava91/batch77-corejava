package com.javaintro;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started ");

		System.out.println(Class.forName("com.javaintro.Welcome"));

		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("java.lang.System"));

		System.out.println(Class.forName("com.mysql.cj.jdbc."));

		System.out.println("main method ended ");
	}
}
