package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas?.:");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "ª " + "pessoa.:");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da "  + (i + 1) + "ª " + "pessoa.:");
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		
		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			} 
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		double soma = 0.0;
		int mulheres = 0;
		
		for (int i = 0; i < genero.length; i++) {
			if (genero[i] == 'f') {
				soma += altura[i];
				mulheres++;
			}
		}
		
		int cont = 0;
		
		for (int i = 0; i < genero.length; i++) {
			if (genero[i] == 'm') {
				cont++;
			}
		}
		
		double mediaAlturaMulheres = soma / mulheres;
		
		System.out.printf("Menor altura.: %.2f%n", menorAltura);
		System.out.printf("Maior Altrua.: %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + cont);
		
		
		
		sc.close();

	}

}
