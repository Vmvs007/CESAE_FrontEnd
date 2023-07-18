package Exercicios;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um caracter: ");
        String caracter = input.next();

        System.out.print("Introduza o número de linhas: ");
        int linhas = input.nextInt();

        System.out.print("Introduza o número de colunas: ");
        int colunas = input.nextInt();

        desenharQuadrado(caracter, linhas, colunas);
    }

    /**
     * Procedimento que imprime um quadrado na consola, de acordo com o caracter e as medidas passadas pelo utilizador
     * @param caracter Caracter através do qual desenha o quadrado
     * @param linhas - Nº linhas do quadrado
     * @param colunas - Nº colunas do quadrado
     */
    public static void desenharQuadrado(String caracter, int linhas, int colunas) {
        System.out.println("");
        for (int i = 0; i < linhas; i++) {
            for (int x = 0; x < colunas; x++) {
                if (i == 0 || i == linhas - 1 || x == 0 || x == colunas - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
