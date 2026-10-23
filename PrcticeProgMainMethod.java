package com.practice.methods;

public class PrcticeProgMainMethod {
	public static void main(String[] args) {
		PracticeProgramOnMethods ppm = new PracticeProgramOnMethods();
		ppm.displayName();
		System.out.println();

		ppm.evenNumbers();
		System.out.println();

		ppm.printSquare();
		System.out.println();

		ppm.evenOdddNum();
		System.out.println();

		ppm.getAge(22);
		System.out.println();

		ppm.getPi();
		System.out.println();

		System.out.println("The addition of 5 + 13 is--->" + ppm.addition(5, 13));
		System.out.println();

		System.out.println("The maximum number is-->" + ppm.maxNumber(4, 6));
		System.out.println();

		System.out.println(ppm.getFirstCharacter("shradha"));
		System.out.println();

		System.out.println(ppm.getLength("shradha"));
		System.out.println();

		System.out.println(ppm.areaOfCircle(4));
		System.out.println();

		System.out.println(ppm.isPositive(-20));
		System.out.println();

		System.out.println(ppm.getGrade(65));
		System.out.println();

		System.out.println(ppm.factorial(5));
		System.out.println();
		
		System.out.println(ppm.isPrime(7));

	}

}
