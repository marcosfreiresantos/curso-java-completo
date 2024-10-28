import java.util.Scanner;

/*
Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas
de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
 */
public class Uri1142 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int inicio = 1;

		for (int i = 1; i <= n; i++) {
			int segundo = inicio + 1;
			int terceiro = inicio + 2;
			System.out.printf("%d %d %d PUM%n", inicio, segundo, terceiro);

			inicio = inicio + 4;

		}
		sc.close();

	}

}
