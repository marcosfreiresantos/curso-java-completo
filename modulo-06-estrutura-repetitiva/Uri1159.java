import java.util.Scanner;

/*
 * O programa deve ler um valor inteiro X indefinidas vezes.
 *  (O programa irá parar quando o valor de X for igual a 0). Para cada X lido,
 *   imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , 
 *   se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, 
 *   que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de 
 *   entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.

Entrada
O arquivo de entrada contém muitos valores inteiros. O último valor do arquivo é zero.

Saída
Imprima a saida conforme a explicação acima e o exemplo abaixo.
 */
public class Uri1159 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double soma = 0;

		int numero = sc.nextInt();

		while (numero != 0) {
			if (numero % 2 == 0) {
				soma = numero + (numero + 2) + (numero + 4) + (numero + 6) + (numero + 8);
			} else {
				soma = (numero + 1) + (numero + 3) + (numero + 5) + (numero + 7) + (numero + 9);
			}
			System.out.println(soma);
			numero = sc.nextInt();
		}

		sc.close();
	}

}
