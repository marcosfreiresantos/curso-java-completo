package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle r = new Retangle();
		
		System.out.println("Enter rectangle width and height");
		
		System.out.println();
		System.out.print("Width: ");
		r.width = sc.nextDouble();		
		
		System.out.print("height: ");
		r.height = sc.nextDouble();
		
		System.out.println();
		System.out.print(r);
		
		sc.close();

	}

}
