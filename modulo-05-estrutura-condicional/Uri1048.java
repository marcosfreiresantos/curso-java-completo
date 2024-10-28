import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double novoSalario;
		double reajusteGanho;
		double percentualDeReajuste;

		double salario = sc.nextDouble();

		if (salario <= 400.0) {
			percentualDeReajuste = 15.0;
		} else if (salario <= 800.0) {
			percentualDeReajuste = 12.0;
		} else if (salario <= 1200.00) {
			percentualDeReajuste = 10.0;
		} else if (salario <= 2000.00) {
			percentualDeReajuste = 7.0;
		} else {
			percentualDeReajuste = 4.0;
		}

		reajusteGanho = salario * percentualDeReajuste / 100;
		novoSalario = salario + reajusteGanho;

		System.out.printf("Novo salário: %.2f\n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
		System.out.printf("Em percentual: %.0f %%%n", percentualDeReajuste);

		sc.close();
	}

}
