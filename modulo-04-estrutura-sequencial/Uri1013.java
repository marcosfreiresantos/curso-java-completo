import java.util.Locale;
import java.util.Scanner;

/* O MAIOR
 * 
 * Faça um programa que leia três valores e apresente o maior dos três valores 
 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
 * 
 * Maior AB = (a + b + abs(a-b))/2
 * 
 * 

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
      O arquivo de entrada contém três valores inteiros.

Saída
    Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 *
 */
public class Uri1013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorAB = (a + b + Math.abs(a-b)) / 2;
		int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
		System.out.println(maiorABC + " eh o maior");
		
		sc.close();

	}

}
