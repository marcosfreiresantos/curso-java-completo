import java.util.Locale;
import java.util.Scanner;

/*

Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa
de sua ajuda para organizar os experimentos de um laboratório o qual ela é 
responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas
no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
coelhos. Para obter estas informações, ela sabe exatamente o número de 
experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade 
de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos
de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia 
(1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um 
caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada
e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o 
percentual deve ser apresentado com dois dígitos após o ponto.
 */

public class Uri1094 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int quantidadeDeCobaias, coelhos = 0, ratos = 0, sapos = 0;
		char tipoDeCobaia;

		for (int i = 0; i < n; i++) {
			quantidadeDeCobaias = sc.nextInt();
			tipoDeCobaia = sc.next().charAt(0);
			if (tipoDeCobaia == 'c') {
				coelhos += quantidadeDeCobaias;
			} else if (tipoDeCobaia == 'r') {
				ratos += quantidadeDeCobaias;
			} else {
				sapos += quantidadeDeCobaias;
			}
		}
		
		int totalDeCobaias = coelhos + ratos + sapos;
		double percentualDeCoelhos = (double) (coelhos * 100.0) / totalDeCobaias;
		double percentualDeRatos = (double) (ratos * 100.0) / totalDeCobaias;
		double percentualDeSapos = (double) (sapos * 100.0) / totalDeCobaias;
		
		System.out.println("Total: " + totalDeCobaias + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n", percentualDeCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%\n", percentualDeRatos);
		System.out.printf("Percentual de sapos: %.2f %%\n", percentualDeSapos);
		
		sc.close();
	}

}
