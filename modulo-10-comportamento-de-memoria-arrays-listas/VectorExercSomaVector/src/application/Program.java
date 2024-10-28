package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai ter cada vetor.: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("Digite os valores do vetor 'A'.: ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "º " + "valor.: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor 'B'.: ");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print((i + 1) + "º " + "valor.: ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE.: ");
				
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
		
		
		sc.close();

	}

}
