package Parte2;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[4][4];
        int somatorio=0;

        // Ler input do utilizador para a matriz
        for(int linha=0;linha < matriz.length ;linha++){
            for(int coluna =0 ; coluna<matriz[0].length; coluna++){
                System.out.print("Introduza um numero na matriz["+linha+"]["+coluna+"]: ");
                matriz[linha][coluna]=input.nextInt();
            }
        }

        // Somar os elementos da diagonal principal
        for(int i=0; i<4; i++){
            somatorio += matriz[i][i];
        }

    }
}
