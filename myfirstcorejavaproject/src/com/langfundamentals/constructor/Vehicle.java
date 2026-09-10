package com.langfundamentals.constructor;

public class Vehicle {
	String model;
	String brand;
	double price;

	Vehicle(String model, String brand, double price) {
		System.out.println("3-arg parameterized constructor called ");
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	Vehicle() {
		System.out.println("no arg cosntructor called from vehicle !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Vehicle !");
	}
}

class Car1 extends Vehicle {

	Car1(String model, String brand, double price) {
		super();
		super.model = model;
		super.brand = brand;
		super.price = price;
	}

	Car1() {
		System.out.println("No arg constructor from car1 !");
		super("I20", "Hundai", 100000.00);
	}

	Car1(String model) {

	}

	public static void main(String[] args) {
		System.out.println("main method started from Car !");

		Car1 c1 = new Car1();
		c1.carInfo();

		Car1 c2 = new Car1("Nexon", "Tata", 1500000.00);
		c2.carInfo();
	}

	void carInfo() {
		System.out.println("Model Of the Car : " + model);
		System.out.println("Brand Of the Car : " + brand);
		System.out.println("Price Of the Car : " + price);
	}

}
