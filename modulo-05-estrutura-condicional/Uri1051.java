import java.util.Locale;
import java.util.Scanner;

public class Uri1051 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double impostoASerPago = 0;

		if (salario <= 2000.0) {
			System.out.println("Isento");
		} else {
			if (salario <= 3000.0) {
				impostoASerPago = (salario - 2000.0) * 0.08;
			} else if (salario <= 4500.0) {
				impostoASerPago = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			} else {
				impostoASerPago = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			}
			System.out.printf("R$ %.2f\n", impostoASerPago);
		}

		sc.close();
	}

}
