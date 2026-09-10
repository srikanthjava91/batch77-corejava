package com.langfundamentals.constructor;

//IS-A Relationship 
//Parent or Super or Base 
public class Animal {
	String breed = "Persian";
	int age = 3;

	Animal() {
		System.out.println("Animal constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Animal");
	}

}

//Child or Sub or Derived 
class Dog extends Animal {
	String breed = "German Shepherd";
	int age = 4;

	Dog() {
		System.out.println("Dog constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Dog class ");
		Dog d = new Dog();
		d.animalInfo();
	}

	void animalInfo() {
		breed= "null";
		System.out.println("Cat Info ");
		System.out.println("Breed of the Dog : " + super.breed);
		System.out.println("Age of the dog : " + super.age);
		System.out.println("Dog  Info ");
		System.out.println("Breed of the Dog : " + breed);
		System.out.println("Age of the dog : " + age);

	}

}
