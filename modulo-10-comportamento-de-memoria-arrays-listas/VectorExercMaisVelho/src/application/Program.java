package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar.: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
				
		for (int i = 0; i < n; i++) {
			System.out.print("Dados da " + (i + 1) + "ª " + "pessoa.: \n");
			System.out.print("Nome.: ");
			nome[i] = sc.next();
			System.out.print("Idade.: ");
			idade[i] = sc.nextInt();
		}
		
		int maiorIdade = 0;
		int cont = 0;
				
		for (int i = 0; i < n; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				cont++;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA.: " + nome[cont]);
		
		sc.close();

	}

}
