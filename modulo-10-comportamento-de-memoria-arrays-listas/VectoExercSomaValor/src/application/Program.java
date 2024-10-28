package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você quer digitar.: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i + 1) +"º " +"número.: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores = ");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("  " + vect[i]);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);		
		sc.close();
	}

}
