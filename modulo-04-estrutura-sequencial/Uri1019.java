import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int horas = n / 3600;
		int resto = n % 3600;
		
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();

	}

}
