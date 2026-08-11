package com.javaintro;

//Blocks : static Block vs instance blocks
// If a class does not contain main method there is no chance of executing Java program after 1.5 version.
//But before 1.5 version, Java programs were executing with out main method 
//When we have only static block but not after 1.5 version.
public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
	}

	static {
		System.out.println("static block called ");
	}

}
