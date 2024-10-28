package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.print("Enter client data:");
		System.out.println();
		System.out.print("Name.: ");
		String name = sc.nextLine();
		System.out.print("E-mail.: ");
		String email = sc.nextLine();
		System.out.print("Birth date(DD/MM/YYYY).: ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		System.out.println();
		
		System.out.println("Enter order data.:");
		System.out.print("Status.: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, client)
		
		System.out.print("How many items to this order?.: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			System.out.println("Enter #" + i + "item data.:");
			System.out.print("Procuct Name.: ");
			String nameProduct = sc.next();
			System.out.print("Product Price.: ");
			double price = sc.nextDouble();
			System.out.print("Quantity.: ");
			int quantity = sc.nextInt();
			
			
		}
		
		
		
		
		
		
		sc.close();
		
	}

}








