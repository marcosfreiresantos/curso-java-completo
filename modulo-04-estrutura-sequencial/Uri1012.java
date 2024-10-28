
/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão:
 A, B e C. Em seguida, calcule e mostre:
 
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B.

Entrada
	O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
	O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma
 	das áreas descritas acima, sempre com mensagem correspondente e um espaço entre
  	os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos
   	após o ponto decimal. 
 */
import java.util.Scanner;
import java.util.Locale;

public class Uri1012 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double areaDoTrianguloRetangulo = a * c / 2.0;
		double areaDoCirculoRaio = 3.14159 * Math.pow(c, 2.0);
		double areaDoTrapezeio = (a + b) * c / 2.0;
		double areaDoQuadrado = Math.pow(b, 2);
		double areaDoRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", areaDoTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f\n", areaDoCirculoRaio);
		System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezeio);
		System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
		System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);
		
		sc.close();
		
				
	}

}
