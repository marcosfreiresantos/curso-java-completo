package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method1();

        System.out.println("End the program");

    }

    public static void method1() {
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");

    }

    public static void method2() {
        System.out.println("*** METHOD2 START ***");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("provide  the names.: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.print("Inform the positon int the vector.: ");
            int position = sc.nextInt();
            System.out.println("value at selected position " + vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input Error");
        }

        sc.close();
        System.out.println("*** METHOD2 END ***");
    }
}

