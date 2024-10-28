package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?.: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º " + "número.: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES.:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print("  " + vect[i]);
			}
		}
				
		int cont = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				cont++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("QUANTIDADE DE NÚMEROS PARES = " + cont);
		
		sc.close();
	}

}
