import java.util.Scanner;

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a 
preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível
abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser 
solicitado um novo código (até que seja válido). O programa será encerrado
 quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que 
abasteceram cada tipo de combustível, conforme exemplo.
 */
public class Uri1134 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha uma opção:\n ");
		System.out.println(" 1-Alcool\n 2-Gasolina\n 3-Diesel\n 4-Fim");
		System.out.println();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int opcao = sc.nextInt();

		while (opcao != 4) {
			if (opcao == 1) {
				alcool += 1;
			} else if (opcao == 2) {
				gasolina += 1;
			} else if (opcao == 3) {
				diesel += 1;
				
			}
			System.out.println("Escolha uma opção:\n 1-Alcool\n 2-Gasolina\n 3-Diesel\n 4-Fim");
			opcao = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
		System.out.println("Fim");
		

		sc.close();

	}

}







