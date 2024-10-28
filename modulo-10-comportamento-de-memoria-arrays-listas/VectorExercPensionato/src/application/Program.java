package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];

		//Rent rent = new Rent();

		System.out.print("How many rooms will be rented?.: ");
		int n = sc.nextInt();
		System.out.println();

		String name = null;
		String email = null;
		int roomNumber = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name.: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email.: ");
			email = sc.next();
			System.out.print("Room.:");
			roomNumber = sc.nextInt();
			if (vect[roomNumber] == null) {
				vect[roomNumber] = new Rent(name, email);
			} else {
				System.out.print("This room is already booked, choose another one:.:");
				roomNumber = sc.nextInt();
				vect[roomNumber] = new Rent(name, email);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("Busy rooms:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}

		}

		sc.close();
	}

}
