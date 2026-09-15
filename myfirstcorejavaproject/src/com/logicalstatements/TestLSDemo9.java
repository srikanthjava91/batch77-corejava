package com.logicalstatements;

import java.util.Scanner;

//- WAP to take the input from the Customer and give the Total Invoice bill for the customer.
//- Customer may select fruits & vegetables 
//- As a Vendor we need to provide bill as a invoice.

public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Vegetable/Fruit market ");
		Scanner sc = new Scanner(System.in);

		double totalPrice = 0;
		double fruPrice = 0;
		double vegPrice = 0;

		String yn = "";

		do {
			System.out.println("Enter the Category ");
			String catg = sc.next();

			switch (catg) {
			case "veg" -> {

				String vyn = "";

				do {
					System.out.println("Enter a item");
					String item = sc.next();// tmt

					switch (item) {

					case "ptt" -> {
						System.out.println("The Potato per kg is 40rs");
						double potatoPrice = 40.0;
						vegPrice = vegPrice + potatoPrice;
					}

					case "onn" -> {
						System.out.println("The Onion per kg is 60rs");
						double onionPrice = 60.0;
						vegPrice = vegPrice + onionPrice;
					}

					case "car" -> {
						System.out.println("The Carrot per kg is 80rs");
						double carrotPrice = 80.0;
						vegPrice = vegPrice + carrotPrice;
					}

					case "tmt" -> {
						System.out.println("The Tomato per kg is 50rs");
						double tomatoPrice = 50.0;
						vegPrice = vegPrice + tomatoPrice;
					}

					case "brn" -> {
						System.out.println("The Brinjal per kg is 45rs");
						double brinjalPrice = 45.0;
						vegPrice = vegPrice + brinjalPrice;
					}

					default -> System.out.println("Entered Vegetable Item is not availble : ");

					}
					System.out.println("Do you want to continue with Vegetable click Y or N ");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));
				System.out.println("Exit from the Vegetables !! ");
				System.out.println("Total Vegetables price is : " + vegPrice);

			}

			case "fru" -> {

				String fyn = "";

				do {
					System.out.println("Enter fruit name : ");
					String item = sc.next();

					switch (item) {
					case "orn" -> {
						System.out.println("Orange and kg price is 120 rs ");
						double ornPrice = 120;
						fruPrice = fruPrice + ornPrice;

					}
					case "app" -> {
						System.out.println("Apple per kg price is 180 rs");

						double appPrice = 180;
						fruPrice = fruPrice + appPrice;
					}

					case "ban" -> {
						System.out.println("Banana per kg price is 60 rs");

						double banPrice = 60;
						fruPrice = fruPrice + banPrice;
					}

					case "man" -> {
						System.out.println("Mango per kg price is 100 rs");

						double manPrice = 100;
						fruPrice = fruPrice + manPrice;
					}

					case "grape" -> {
						System.out.println("Grapes per kg price is 90 rs");

						double grapePrice = 90;
						fruPrice = fruPrice + grapePrice;
					}

					case "pome" -> {
						System.out.println("Pomegranate per kg price is 150 rs");

						double pomePrice = 150;
						fruPrice = fruPrice + pomePrice;
					}

					default -> {
						System.out.println("Entered Fruit is not available !!");
					}

					}

					System.out.println("Do you want to continue with fruits ..? ");
					fyn = sc.next();

				} while (fyn.equalsIgnoreCase("y"));

				System.out.println("Exit for the Fruits : ");
				System.out.println("Total Fruits price is : " + fruPrice);
			}
			
			default -> System.out.println("entered category is not available right now !!");
			}

			System.out.println("Do you want to continue with the Categories Click Y ot N for EXit ..?");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Total Price is : " + (vegPrice + fruPrice));
	}

}
