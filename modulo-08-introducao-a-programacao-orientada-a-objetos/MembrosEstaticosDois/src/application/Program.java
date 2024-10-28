package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	//public static final double PI = 3.14159;
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = calc.circunference(radius);
		double v = calc.volume(radius);
		
		//double c = circunference(radius);
		//double v = volume(radius);
		
		System.out.println();
		System.out.printf("Circunference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI %.2f%n", calc.PI);
				
		sc.close();
	}
	/*
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3;
	}
	*/

}
