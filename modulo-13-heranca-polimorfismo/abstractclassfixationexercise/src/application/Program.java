package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Entrer the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer # " + i + " data:" );
			System.out.print("Individual or company (i/c).: ");
			char ch = sc.next().charAt(0);
			if ((ch != 'i') && (ch != 'c')){					
				System.out.print("Option invalid, choose individual or company (i/c)");
				i--;
				continue;
			}
			System.out.print("Name.: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income.: ");
			Double anualincome = sc.nextDouble();			
					
			if (ch == 'i') {
				System.out.print("Heath expenditures.:");
				Double heathExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualincome, heathExpenditures));							
			}
			else if (ch == 'c') {
				System.out.print("Number of employees.: ");
				Integer numberEmployees = sc.nextInt();
				list.add(new Company(name, anualincome, numberEmployees));				
			}			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f",taxPayer.tax()));
		}
		
		System.out.println();
		double sum = 0.0;
		for (TaxPayer taxPayer : list) {
			sum += taxPayer.tax();
		}
		
		System.out.println("TOTAL TAXES:  $" + String.format("%.2f", sum));
		
		
		/* Imprimindo na tela a soma dos impostos pagos, apenas da classe individual
		  
		double sum = 0.0;
		for (TaxPayer taxPayer : list) {
			if (taxPayer instanceof Individual) {
				Individual individual = (Individual) taxPayer;
				sum += individual.tax();
			}
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		*/			
		sc.close();
	}
}
