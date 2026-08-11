package com.javaintro;

public class TestDemo4 {

//	 static method
	static void hello() {
		System.out.println("Hello guys, Good morning !");
		System.out.println("Hello guys, Good morning !");
	}

//	static main methodc
//	JVM calls the main method to execute !!
	public static void main(String[] args) {
		System.out.println("main method staretd ");
		System.out.println(Thread.currentThread());

		TestDemo4 t = new TestDemo4();

//		 Calling the static method directly 
		hello();

//		Calling the instance method by using Object reference variable.
		t.welcome();

		System.out.println("main method ended ");
	}

	// instance method
	void welcome() {
		System.out.println("Welcome to Vcube !!");
		System.out.println("Welcome to Vcube !!");
		System.out.println("Welcome to Vcube !!");
	}

}
