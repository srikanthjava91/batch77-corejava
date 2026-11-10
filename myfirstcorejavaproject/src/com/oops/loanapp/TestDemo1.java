package com.oops.loanapp;

import java.io.IOException;

abstract class Animal {
	public static void main(String[] args) {

	}

	String sound() throws Exception {
		return "Bow bow!!";
	}

	abstract void sleep();
}

class Dog extends Animal {
	public static void main(String[] args) {

	}

	@Override
	String sound() throws IOException {
		return "Bow bow Uffff!!";
	}

	@Override
	void sleep() {
		System.out.println("Animal can sleep ");
	}

}

abstract class Puppy extends Dog {

	abstract void sleep();

}

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Dog d = new Dog();

//		Animal a = new Animal();

	}

}
