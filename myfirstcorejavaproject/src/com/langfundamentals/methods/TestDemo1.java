package com.langfundamentals.methods;

interface In1 {
	public abstract void method1();
}

class Employee1 {

	int age;
	float height;
	double weight;
	double salary;

}

//Random methods 
public class TestDemo1 {

	static Integer getAge1() {
		Integer i = 22;
		return i;
	}

	int method1() {
		int x = 100;
		return x;
	}

	void method2() {
		int x = method1();
		System.out.println(x);
	}

	int addition(int a, int b) {
		byte sum = (byte) (a + b);
		return sum;// byte can convert to int
	}

	strictfp int getGnderInfo() {
		char c = 'M';
		return c;// char can convert into int
	}

	strictfp char getAge() {
		int age = 21;
		return (char) age;// int cannot convert to char so we need to explicit type casting
	}

	// Factory Methods
	Employee1 getEmpDetails(int age, float height, double weight, double salary) {
		Employee1 emp = new Employee1();

		emp.age = age;
		emp.height = height;
		emp.weight = weight;
		emp.salary = salary;

		return emp;
	}

	void subtraction(int a1, int b1) {
		System.out.println(a1);//
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		System.out.println(TestDemo1.getAge1());

		TestDemo1 t = new TestDemo1();
		Employee1 e = t.getEmpDetails(21, 5.9F, 65, 100000.00);

//		Employee1 e =  new Employee1();
		System.out.println(e.age);
		System.out.println(e.height);
		System.out.println(e.weight);
		System.out.println(e.salary);

	}

}
