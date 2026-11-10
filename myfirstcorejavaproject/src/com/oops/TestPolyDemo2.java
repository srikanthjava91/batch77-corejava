package com.oops;

public class TestPolyDemo2 {

	void main(String[] args) {
		System.out.println("main method started ");
		addition();
		addition(100);
		addition(100.5F);
		addition(5.8);//double cannot convert float 

	}

	void addition() {
		System.out.println("addition method called !!");
	}
	
	void addition(double i) {
		System.out.println("addition method called with float partameters : " + i);
	}
	
	void addition(float i) {
		System.out.println("addition method called with float partameters : " + i);
	}
	
	void addition(long i) {
		System.out.println("addition method called with long partameters : " + i);
	}

	void addition(int i) {
		System.out.println("addition method called with int partameters : " + i);
	}
}
