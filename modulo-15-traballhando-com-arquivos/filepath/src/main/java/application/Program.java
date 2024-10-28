package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path.: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName.: " + path.getName());//mostra no nome do arquivo na pasta
        System.out.println("getParent.: " + path.getParent());//mostra parte do caminho até o arquivo
        System.out.println("getPath.: " + path.getPath());//mostra o caminho completo até o arquivo

        


        sc.close();

    }


}
