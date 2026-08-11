package com.javaintro;

//WAP to Represent Only Indian Cricket Team .?
//JVM is proving the default values for numbers 0 and for String null values.

//Whenever the data is not changing from Object to Object then go and make sure such data as static.
//Whenever the data is changing from Object to Object then go and make sure such data as instance.

//Note: For every Object creation, a new Copy will create with default values for instance data.
//Whereas for static data it's creating only one copy for all objects.

//static data is loading whenever the class loads and store it in Method area.
//instance data is loading whenever the object is creating and stores it in Heap area.

public class Cricketer {

	// Step1: Declaration
	// static variables
	static int countryID = 1;
	static String countryName = "HinduStan";

	// instance variables or non-static variables
	int jerseyNumber  = 1;
	String cricketerName = "Unknown";

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Indian Cricket Team !");

//		If we want to access instance data in static area, we must need to create Object.
//		LHS = "Cricketer" is a class name and "msd" is a Object Reference variable.
//		RHS = new is the keyword in java to create Objects and Cricketer() is Constructor calling.

		System.out.println("****Object1 info *******************");
		Cricketer msd = new Cricketer();// Object Creation

//		Step 2: Initialization 
		countryID = 91;
		countryName = "India";

		msd.jerseyNumber = 7;
		msd.cricketerName = "Mahendra Singh Dhoni ";

//		Step 3: Accessing 
//		Accessing the static data directly
		System.out.println("Country ID : " + countryID);
		System.out.println("Country Name : " + countryName);

//		Accessing the instance data by using Object Reference variable.
		System.out.println("Jersey Number : " + msd.jerseyNumber);
		System.out.println("Cricketer Name : " + msd.cricketerName);

		System.out.println("****Object2 info *******************");
		Cricketer virat = new Cricketer();
		virat.jerseyNumber = 18;
		virat.cricketerName = "Virat Kohli";
		System.out.println("Country ID : " + countryID);//
		System.out.println("Country Name : " + countryName);//
		System.out.println("Jersey Number : " + virat.jerseyNumber);//
		System.out.println("Cricketer Name : " + virat.cricketerName);//

		System.out.println("****Object3 info *******************");
		Cricketer rohit = new Cricketer();
		rohit.jerseyNumber = 45;
		rohit.cricketerName = "Rohit Sharma";
		System.out.println("Country ID : " + countryID);//
		System.out.println("Country Name : " + countryName);//
		System.out.println("Jersey Number : " + rohit.jerseyNumber);//
		System.out.println("Cricketer Name : " + rohit.cricketerName);//

		System.out.println("*********** Object 4 Info *********");

		Cricketer vaibhav = new Cricketer();

		countryID = 92;
		countryName = "Bharath";
		vaibhav.jerseyNumber = 3;
		vaibhav.cricketerName = "Vaibhav Sooryavansi ";

		System.out.println("Country ID : " + countryID);//
		System.out.println("Country Name : " + countryName);//
		System.out.println("Jersey Number : " + vaibhav.jerseyNumber);//
		System.out.println("Cricketer Name : " + vaibhav.cricketerName);//

		Cricketer kl = new Cricketer();

		kl.jerseyNumber = 1;
		kl.cricketerName = "K Lokesh Rahul ";

		System.out.println("Country ID : " + countryID);//
		System.out.println("Country Name : " + countryName);//
		System.out.println("Jersey Number : " + kl.jerseyNumber);//
		System.out.println("Cricketer Name : " + kl.cricketerName);//

//		Accessing the instance data in static area is not possible directly, 
//		if we try to access we will get Compile time error like below.

//		Cannot make a static reference to the non-static field jerseyNumber
//		System.out.println(jerseyNumber);
//		Cannot make a static reference to the non-static field cricketerName
//		System.out.println(cricketerName);

	}

}
