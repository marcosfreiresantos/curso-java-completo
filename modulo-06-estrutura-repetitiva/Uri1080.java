import java.util.Scanner;

/*
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre
os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */
public class Uri1080 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// vamos considerar o primeiro valor como sendo inicialmente o maior
		int maior = sc.nextInt();
		int posicao = 1;

		// agora vamos ler o segundo até o centésimo
		for (int i = 2; i <= 100; i++) {
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
				posicao = i;
			}
		}

		System.out.println(maior);
		System.out.println(posicao);

		sc.close();

	}

}
