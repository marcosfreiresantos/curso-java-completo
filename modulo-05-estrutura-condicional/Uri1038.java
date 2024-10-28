import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Escolha seu lanche: ");
		System.out.println("");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Torradas simples");
		System.out.println("5 - Refrigerante");
		System.out.println("");
		*/
		double totalAPagar = 0;

		int codigoProduto = sc.nextInt();
		int quantidade = sc.nextInt();

		if (codigoProduto == 1) {
			totalAPagar = 4.0 * quantidade;
		} else if (codigoProduto == 2) {
			totalAPagar = 4.5 * quantidade;
		} else if (codigoProduto == 3) {
			totalAPagar = 5.0 * quantidade;
		} else if (codigoProduto == 4) {
			totalAPagar = 2.0 * quantidade;
		} else {
			totalAPagar = 1.5 * quantidade;
		}
		System.out.printf("Total: R$ %.2f\n", totalAPagar);
		
		sc.close();
	}

}
