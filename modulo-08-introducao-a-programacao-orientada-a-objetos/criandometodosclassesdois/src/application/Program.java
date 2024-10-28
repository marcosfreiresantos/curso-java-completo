package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle x: ");
        System.out.println("Digite o valor de 'a' ");
        x.a = sc.nextDouble();
        System.out.println("Digite o valor de 'b' ");
        x.b = sc.nextDouble();
        System.out.println("Digite o valor de 'c' ");
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        System.out.println("Digite o valor de 'a' ");
        y.a = sc.nextDouble();
        System.out.println("Digite o valor de 'b' ");
        y.b = sc.nextDouble();
        System.out.println("Digite o valor de 'c' ");
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("entities.Triangle X area: %.4f%n", areaX);
        System.out.printf("entities.Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
