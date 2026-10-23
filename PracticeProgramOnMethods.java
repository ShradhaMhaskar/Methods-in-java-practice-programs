package com.practice.methods;

public class PracticeProgramOnMethods {
//	1.Create a method that print your name.

	public void displayName() {
		System.out.println("Shradha");
	}

//	2.Create method that display even numbers.
	public void evenNumbers() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);

		}
	}

//	3.Create method that print the square of a number.
	public int printSquare() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * i);

		}
		return 1;
	}

//	4.Create method that display whether the number is even or odd.
	public void evenOdddNum() {
		int num = 24;
		if (num % 2 == 0) {
			System.out.println(num + "is an even number");
		} else {
			System.out.println(num + "is an odd number");

		}
	}

// 5. Create method that return 3.145576 as a double.
	public double getPi() {
		return 3.145576;
	}

//	6.Create method that display age as an int.
	public void getAge(int age) {
		System.out.println(age);
	}

//	7.Create method that display sum of two numbers.
	public int addition(int a, int b) {
		int c = a + b;
		return c;
	}

//	8.Create method that return larger number.
	public int maxNumber(int num1, int num2) {

		if (num1 > num2) {
			return num1;
		} else {
			return num2;

		}

	}

//	9.Create method that return first character of a name.
	public char getFirstCharacter(String name) {
		return name.charAt(0);
	}

//  10.Create method that return the length of the string.
	public int getLength(String name) {
		return name.length();
	}

//	11.Calculate the area of a circle.
	public double areaOfCircle(double r) {
		return 3.14 * r * r;
	}

//	12.Return true if the number is positive otherwise false.
	public boolean isPositive(int num) {
		return num > 0;
	}

//	13.Return character grade:A for 80+, B for 60-79, c for 40-59, and F below 40.
	public char getGrade(int marks) {

		if (marks >= 80 && marks <= 100) {
			return 'A';

		} else if (marks >= 60 && marks <= 79) {
			return 'B';
		} else if (marks >= 40 && marks <= 59) {
			return 'C';
		} else {
			return 'F';
		}
	}

//  14.Return factorial of non-negative integer.
	public int factorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;
	}

//	15.Check whether the number is prime if number is prime print true othrewise false.
	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;

		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return false;
	}
}
