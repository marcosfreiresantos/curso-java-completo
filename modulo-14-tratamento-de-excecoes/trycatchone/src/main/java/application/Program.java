package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("provide the names.: ");

        try {
            String[] vect = sc.nextLine().split(" ");
            System.out.print("inform the position in the vector.: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        } catch (InputMismatchException e) {
            System.out.println("Input Error");
        }
        System.out.print("End of program");

        sc.close();
    }
}

