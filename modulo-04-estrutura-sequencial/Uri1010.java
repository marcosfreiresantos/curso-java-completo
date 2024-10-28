/*
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
 *  o valor unitário de cada peça 1, o código de uma peça 2, o número de 
 *  peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor
 *   a ser pago.

 * Entrada
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores
 * , respectivamente dois inteiros e um valor com 2 casas decimais.

 * Saída
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando
 * de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá
 * ser apresentado com 2 casas após o ponto.
  */

import java.util.Scanner;
import java.util.Locale;

public class Uri1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//int codigoDaPeça1 = sc.nextInt();
		int numeroDePeças1 = sc.nextInt();
		double valorDaPeca1 = sc.nextDouble();

		//int codigoDaPeça2 = sc.nextInt();
		int numeroDePeças2 = sc.nextInt();
		double valorDaPeca2 = sc.nextDouble();

		double valorAPagar = (numeroDePeças1 * valorDaPeca1) + (numeroDePeças2 * valorDaPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);
		
		sc.close();

	}

}
