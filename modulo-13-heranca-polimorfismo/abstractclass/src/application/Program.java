package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*
		Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		*/
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getbalance();
		}
		
		System.out.printf("Total balance.: $ %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d.: %.2f%n", acc.getNumber(), acc.getbalance());
		}		
	}

}










