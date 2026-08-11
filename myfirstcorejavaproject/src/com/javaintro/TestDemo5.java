package com.javaintro;

public class TestDemo5 {

//	In static area, we cannot call instance methods directly,
//	So, I am creating Object to call instance methods.
	static void method1() {
		TestDemo5 t = new TestDemo5();
		t.method2();
		System.out.println("method1 called ");
	}

//	In instance, we can call static methods directly.
	void method2() {
		System.out.println("method2 called ");
		method3();
	}

//	In static area, we cannot call instance methods directly,
//	So, I am creating Object to call instance methods.
	static void method3() {
		System.out.println("method3 called ");
		TestDemo5 t = new TestDemo5();
		t.method4();
	}

//	In instance methods, can call instance methods directly.
	void method4() {
		System.out.println("method4 called ");
		method5();
	}

	void method5() {
		System.out.println("method5 called ");
	}

	//In static, We can call static methods directly 
	public static void main(String[] args) {
		System.out.println("main method started ");

		method1();

		System.out.println("main method ended ");
	}

}
