package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados.: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] primeiroSemestre = new double[n];
		double[] segundoSemestre = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite nome, primeira e segunda nota do " + (i + 1) + "º " +"aluno:\n");
			System.out.print("Nome.: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("1ª Nota.: ");
			primeiroSemestre[i] = sc.nextDouble();
			System.out.print("2ª Nota.: ");
			segundoSemestre[i] = sc.nextDouble();
		}		
	
		System.out.println("Alunos Aprovados.:");
		
		for (int i = 0; i < n; i++) {
			if (((primeiroSemestre[i] + segundoSemestre[i]) / 2) >= 6) {
				System.out.println(nome[i]);
			}
		}		
		
		sc.close();

	}

}
