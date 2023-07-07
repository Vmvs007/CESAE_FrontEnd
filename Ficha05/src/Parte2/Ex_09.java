package Parte2;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[5][5];
        int somatorio=0;

        // Ler input do utilizador para a matriz
        for(int linha=0;linha <5 ;linha++){
            for(int coluna =0 ; coluna<5; coluna++){
                System.out.print("Introduza um numero na matriz["+linha+"]["+coluna+"]: ");
                matriz[linha][coluna]=input.nextInt();

                somatorio=somatorio+matriz[linha][coluna];
            }
        }

         // Apresentar o somatório de todos os elementos da matriz
        System.out.println("Somatorio: "+somatorio);

    }
}
