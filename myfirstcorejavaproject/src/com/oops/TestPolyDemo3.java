package com.oops;

public class TestPolyDemo3 {

	void main(String[] args) {
		System.out.println("main method started !!");
		add();
//		add(10, 20);//CE : The method add(int, float) is ambiguous for the type TestPolyDemo3
		System.out.println("main method ended !!");
	}

	void add() {
		System.out.println("add method called ");
	}

//	return type is not part of method overloading .
//	method overloading means same method name + with different parameters.
//	Number of parameters 
//	Order of parameters 
//	Types of Parameters 
//	int add(){
//		System.out.println("add method called ");
//		return 100;
//	}

	void add(int i) {
		System.out.println("add method called with int ");
	}

	void add(float f) {
		System.out.println("add method called with float ");
	}

//	void add(int i, int j) {
//		System.out.println("add method called with int + int ");
//	}

	void add(int i, float j) {
		System.out.println("add method called int + float ");
	}

	void add(float i, int j) {
		System.out.println("add method called floayt + int ");
	}
//
//	void add(float i, float j) {
//		System.out.println("add method called float + float ");
//	}

}
