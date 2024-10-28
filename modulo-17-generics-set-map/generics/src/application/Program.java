package application;

import services.PrintService;
import services.PrintServiceString;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintServiceString ps = new PrintServiceString();

        System.out.print("How many value?.: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.print("First: " + ps.first());

        sc.close();
    }
}
