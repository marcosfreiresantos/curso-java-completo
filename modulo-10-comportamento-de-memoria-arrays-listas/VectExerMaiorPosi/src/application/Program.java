package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você quer digitar?.: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º " + "número.: ");
			vect[i] = sc.nextDouble();
		}
		
		double maiorValor = 0.0;
		int posicao = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicao++;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
		System.out.print("POSIÇÃO MAIOR VALOR = " + posicao);
		
		sc.close();
	}

}
