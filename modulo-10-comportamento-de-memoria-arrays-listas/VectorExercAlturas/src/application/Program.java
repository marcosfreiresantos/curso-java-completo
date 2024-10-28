package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas.: ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
	    for (int i = 0; i < n; i++) {
	    	System.out.println("Dados da " + (i + 1) + "ª " + "pessoa.:");
	    	System.out.print("Nome.: ");
	    	name[i] = sc.next();
	    	System.out.print("Idade.: ");
	    	age[i] = sc.nextInt();
	    	System.out.print("Altura.: ");
	    	height[i] = sc.nextDouble();
	    }
	    
	    double sum = 0.0;
	    double cont = 0.0;
	    
	    for (int i = 0; i < n; i++) {
	    	sum += height[i];
	    }
	    
	    double avg = sum / n;
	    
	    System.out.println();
	    System.out.printf("Altura média.: %.2f%n ", avg);
	    
	    for (int i = 0; i < n; i++) {
	    	if (age[i] < 16) {
	    		cont++;
	    	}	    	
	    }
	    
	   
	    double peopleMinor = (cont * 100.0) / 5;
	    
	    System.out.printf("Pessoas com menos de 16 anos.: %.1f%%%n ", peopleMinor);
	    
	    for (int i = 0; i < n; i++) {
	    	if (age[i] < 16) {
	    		System.out.println(name[i]);
	    		
	    	}
	    } 	    		
		
		sc.close();		

	}

}
