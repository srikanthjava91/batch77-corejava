package com.langfundamentals.methods;

import java.util.Scanner;

///With return type + with Parameters
///
/// find Area of Triangle : 0.5 * base * height 
/// find Area of Rectangle : length * breadth 
/// find area of Square  : side * side 
///find Area of Circle  : PI * r * r 

public class Areas {

	void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Side : ");
		double side = sc.nextDouble();
		double arOfSq = findAreaOfSquare(side);
		System.out.println("Area of Square : " + arOfSq);

		System.out.println("Enter Base : ");
		double b = sc.nextDouble();
		System.out.println("Enter height : ");
		double h = sc.nextDouble();
		double arOfTri = findAreaOfTriangle(b, h);
		System.out.println("Area of Triangle is : " + arOfTri);

	}

	double findAreaOfTriangle(double base, double height) {
		double arOfTri = 0.5 * base * height;
		
		System.out.println(arOfTri);
		return arOfTri;
	}

	double findAreaOfSquare(double side) {
		double arOfSq = side * side;
		return arOfSq;
	}

	double areaOfRectangle(double l, double b) {
		return l * b;
	}

	double areaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}

}
