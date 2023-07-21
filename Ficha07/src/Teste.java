package FichaPratica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Teste {

    public static void criarFicheiro() throws FileNotFoundException {

        String fileContent= "Este é o meu primeiro ficheiro em Java";

        File file= new File ("ficheiros/ex02.txt");
    }

    public static void lerFicheiro() throws FileNotFoundException {

        String fileContent= "Este é o meu primeiro ficheiro em Java";

        File file = new File("ficheiros/ex02.txt");
        Scanner sc = new Scanner(file);

        System.out.println(sc.nextLine());
    }


    public static void main(String[] args) throws FileNotFoundException {

        criarFicheiro();
        lerFicheiro();
    }
}