package Exercicios;

import java.util.Scanner;

public class Ex_13 {


    public static void desenharQuadrado(String caracter, int linhas, int colunas) {
        for (int i = 1; i <= linhas; i++) {
            for (int x = 1; x <= colunas; x++) {
                if (i == 1 || i == linhas || x == 1 || x == colunas) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza um caracter: ");
        String caracter = scanner.next();

        System.out.print("Introduza o número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("Introduza o número de colunas: ");
        int colunas = scanner.nextInt();

        desenharQuadrado(caracter, linhas, colunas);
    }

}
