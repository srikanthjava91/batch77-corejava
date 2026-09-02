package com.langfundamentals.constructor;

public class Bike {

	String model;
	String brand;
	double price;
	int year;
	String color;

	Bike() {
		this("Unknown", "Unknown");
		System.out.println("no arg constructor called ");
	}

	public Bike(String model, String brand) {
		this(model, brand, 100000.00);
		System.out.println("2-arg constructor called ");
	}

	public Bike(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;

	}

	public Bike(String model, String brand, double price, int year) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
	}

	public Bike(String model, String brand, double price, int year, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Bike Show-room");

		Bike fz = new Bike("FZ-S", "YAMAHA", 200000.00, 2016, "Blue");
		fz.bikeInfo();

		Bike re = new Bike("Classic", "Royal Enfield");
		re.bikeInfo();

		Bike b1 = new Bike();
		b1.bikeInfo();
	}

	void bikeInfo() {
		System.out.println("Model of the Bike : " + model);
		System.out.println("Brand of the Bike : " + brand);
		System.out.println("Price of the Bike : " + price);
		System.out.println("Year of the Bike : " + year);
		System.out.println("color of the Bike : " + color);
		System.out.println("******************************************");
	}

}
