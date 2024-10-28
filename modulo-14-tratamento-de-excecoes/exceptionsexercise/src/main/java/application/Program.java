package application;

import entities.Account;
import exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Data.:");
        System.out.print("Number.: ");
        int number = sc.nextInt();
        System.out.print("Holder.: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial Balance.: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw Limit.: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.print("What is the withdrawal amount from your bank account");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("New balance %.2f ", acc.getBalance());
        } catch(DomainException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
