package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws Exception{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products.: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data.: ");
            System.out.print("Common, used or imported (c/u/i)?.: ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name.: ");
            String name = sc.nextLine();
            System.out.print("Price.: ");
            double price = sc.nextDouble();
            if (ch == 'c'){
               list.add(new Product(name, price));
            } else if(ch == 'i') {
                System.out.print("Customs fee.: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else {
                System.out.print("Manufacture date (DD/MM/YYYY).: ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}












