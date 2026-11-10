package com.oops.loanapp;

import java.util.Scanner;

//Child class / Sub / Derived 
public class PersonalLoan extends LoanImpl {

	static Scanner sc = new Scanner(System.in);

	@Override
	public void hello() {
		System.out.println("Hello method called from Personal Loan !!");
	}

//	Method Overriding : 
//	Rule 1: Method signature must be same.  
//		(signature means method name and parameters).
//		(Method return type is not part of method signature)

//	Rule 2: Method return type must be same until java 1.4 version.
//	But, later from 1.5 onwards method override can use co-varient return types.

//	Note : Even though Java 1.5 onwards If the Parent class method return primitive data types 
//	the child class must return same Primitive data types.
//	Co-varient Return types is applicable only for Object Data Types.
//	Co-varient Return type means If the Parent class method return any Object data type, 
//	the child class can return same Object data type or it's sub type.

//	ex : If the P --> Number ----> C --> Number/ Integer/ Double/ Byte/ Short...etc
//  ex : If the P --> Object ---> C --> Number/ String/ StringBuffer 
//	ex : If the P  --> String --> C --> String
//	ex : If the P --> Integer --> C -->Number --> invalid 

//	private < <default> < protected < public 
//	Rule 3 : The Scope of the Override method should not Reduced.
//	CE : Cannot reduce the visibility of the inherited method from LoanImpl
//	ex: If the P --> public --> C --> public 
//  ex: If the P --> protected --> C --> protected/ public
//	ex: If the P --> <default> --> C --> default/protected/ public
//	ex: If the P --> private --> we cannot Override those methods.

//	Rule 4 : private methods we cannot override.
//	Because the scope of the private is Within the class.
//	Q) Can we write same Parent private method in child class without Overriding annotation..? 
//  Yes !! We can write without @Override annotation.
//	If we use @Override annotation we will get CE

//	Rule 5 : static methods cannot override.
//	If we use same Parent static method in child class without @Override method will consider as
//	Method hiding. Best example main method.
//	If we use @Override we will get CE.
//	Why because static methods loads whenever the class 
//	loads but overriding is working based Object creation.
	
//	Rule 6 : final method we cannot override.
//	If we use final keyword for a Parent class method, 
//	we cannot override but we can access with object reference variable.
//	If the class is final, all method inside the class also final.
//	If the class is final, all variables inside that class is not final.
	
//	Rule 7 : Exception related ...
//	If the Parent class method throws any Exception the child class no need to throws 
//	any of the Exception. But, If the child class overridden method throws any Exception 
//	the Parent class method must throws same Exception or it's Parent Exception.
//
	
//	Rule 8 : Related to abstract methods 
//	If the Parent class is abstract and which contains abstract methods, 
//	the child class must override the abstract methods.
//	A normal method from normal class, can be override as a abstract method in abstract class.

	private String getName() {
		return "PersonalLoan";
	}

	public Double getOffer() {
		return 2.0;
	}

	@Override
	public double getROI() {
		System.out.println("ROI Interest Called from Personal Loan");
		double roi = 15.0;
		int cibil = getCibilScore();

		if (cibil > 800 && cibil <= 900) {
			System.out.println("Excellent : Strong credit profile, best loan terms.");
			roi = roi - 7.0;// 8%
		} else if (cibil > 770 && cibil <= 800) {
			System.out.println("Very Good : High approval chances, competitive rates.");
			roi = roi - 6.0;
		} else if (cibil > 700 && cibil <= 770) {
			System.out.println("Good : Eligible for most loans with decent terms.");
			roi -= 5.0;
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("Average  : May get loans but at higher interest.");
			roi -= 4.0;
		} else if (cibil > 300 && cibil <= 600) {
			System.out.println("Poor : High risk; loan applications often rejected. ");
			roi -= 3.5;
		} else {
			System.out.println("Invalid Cibil score ");
		}

		return roi;
	}

	void getPersonalLoanDocInfo() {
		System.out.println("Personal Loan Doc info received ");
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Vcube Personal Loan Banking ");

//		Scenario 4 ) By using Parent Object & Child Reference ..? 
//		We cannot Store Parent Object in Child Reference and If we try to store we will get CE like below 
//		Type mismatch: cannot convert from Loan to PersonalLoan
//		So, In Java Down-Casting is not possible Directly like this.
//		We can do Explicit Type-casting for Satisfying the compiler.
//		But, We will get Runtime Error Saying that : ClassCastException
//		PersonalLoan pl2 = new Loan();//CE 

//		Object obj =new Loan();This is possible because every class extends Object class.
//		PersonalLoan pl2 = (PersonalLoan) new Loan();
//		pl2.getCibilScore();
//		pl2.getPersonalLoanD-ocInfo();

//		Can we store Child Object into Parent Reference ..? 
//		- Yes will consider this as Up-casting.

//		Why We need UpCasting ..? 
//		If the Parent class method overridden in child class 
//		Then By using Child Object + Parent reference 
//		we can call Parent class functionalities but 
//		the overridden method executed from child class will consider as Dynamic Method dispatching.

//		In Java, If we want to achieve Abstraction we must use Up-casting like 
//		Create a Object of a class and store that Object into a interface Reference variable.
//		ex: List l = new ArrayList();

//		Scenario 3) By using Child Object & Parent Reference
//		We can call only Parent class functionalities.
		Loan l2 = new PersonalLoan();
		l2.hello();
//		l2.getPersonalLoanDocInfo();

//		Scenario 2) By using Parent Object & parent Reference 
//		We can call only Parent class functionalities.
		Loan l1 = new LoanImpl();
//		The method getPersonalLoanDocInfo() is undefined for the type Loan
//		l1.getPersonalLoanDocInfo();

//		Scenario 1) By using Child Object & Child Reference 
//		We can call both Child class & Parent class functionalities.
		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getEmployeeSalary();
		int cibil = pl.getCibilScore();

		if (salary >= 100000.00 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Good to know Lets starts the remining process ");

			if (pl.isAadharValid() && pl.isPanValid() && pl.isPhoneValid()) {
				System.out.println("Congrtulations !! Your Personal Loan got approved !!");
				System.out.println("Personal Loan ROI is : " + pl.getROI());
				pl.getPersonalLoanDocInfo();
			} else {
				System.out.println("Something went wrong with your personal data, can you re-check once ");
			}

		} else {
			System.out.println("Your Loan got Rejected.. Please try again later.");
		}

	}

}
