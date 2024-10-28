package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrentConvert;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Convert Reais To Dollar");
		System.out.println();		
		System.out.print("What is the dollar price.: ");
		double price_dollar = sc.nextDouble();
		System.out.print("Amount to be paid in reais.: ");
		double qts_dollar = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought.: R$ %.2f", CurrentConvert.calcDollar(price_dollar, qts_dollar));
			
		
		sc.close();
	}

}
