package com.langfundamentals.constructor;

public class Car {

	String model;
	String brand;
	double price;
	int year;
	String color;

	// no arg constructor
	Car() {
		System.out.println("no arg constructor called ");
	}

	// 2-arg parameterized constructor
	Car(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}

	// 3-arg parameterized constructor
	Car(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	// 4-arg parameterized constructor
	Car(String model, String brand, double price, int year) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
	}

	// 5-arg parameterized constructor
	Car(String model, String brand, double price, int year, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Car Show-room");

		Car c2 = new Car("Sonet", "KIA");
		c2.carInfo();

		Car c1 = new Car();
		c1.carInfo();

		Car c3 = new Car("Seltos", "KIA", 1700000.00);
		c3.carInfo();

		Car c4 = new Car("Nexon", "Tata", 1400000.00, 2026);
		c4.carInfo();

		Car c5 = new Car("Harrieer", "Tata", 3000000.00, 2026, "Black");
		c5.carInfo();
	}

	void carInfo() {
		System.out.println("Model of the Car : " + model);
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Price of the Car : " + price);
		System.out.println("Year of the Car : " + year);
		System.out.println("color of the Car : " + color);
		System.out.println("******************************************");
	}

}
