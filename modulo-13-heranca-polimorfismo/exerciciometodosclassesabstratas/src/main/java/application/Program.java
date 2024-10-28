package application;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers.: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data.:");
            System.out.print("Individual or company (i/c)?.: ");
            char ch = (sc.next().charAt(0));
            sc.nextLine();
            System.out.print("Name.: ");
            String name = sc.nextLine();
            System.out.print("Anual Income.: ");
            Double anualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures.: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PhysicalPerson(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Quantity of employees.: ");
                int quantityOfEmployees = sc.nextInt();
                list.add(new LegalPerson(name, anualIncome, quantityOfEmployees));
            }

        }
        System.out.println();
        System.out.println("TAXES PAID:");

        for (Person per : list){
            System.out.print(per.getName() + ": $ " + String.format("%.2f%n", per.tax()));
        }

        System.out.println();

        var sum = 0.0;
        for (Person per : list) {
           sum += per.tax();
        }
        System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
