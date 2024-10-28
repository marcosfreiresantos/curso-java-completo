package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Enter the name: ");
		emp.name = sc.nextLine();
		System.out.print("Enter gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Enter the tax rate: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + emp);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Update data: " + emp);
		
		
		
		sc.close();

	}

}
