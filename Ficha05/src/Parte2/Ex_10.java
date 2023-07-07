package Parte2;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[4][5];
        int numeroPesquisa, somatorio=0;

        // Ler input do utilizador para a matriz
        for(int linha=0;linha < matriz.length ;linha++){
            for(int coluna =0 ; coluna<matriz[0].length; coluna++){
                System.out.print("Introduza um numero na matriz["+linha+"]["+coluna+"]: ");
                matriz[linha][coluna]=input.nextInt();
            }
        }

        // Imprime a matriz
        for(int linha=0;linha <matriz.length ;linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("\t"+matriz[linha][coluna]);
            }
            System.out.println();
        }

        // Perguntar ao utilizador qual o numero a pesquisar
        System.out.println("Numero a pesquisar: ");
        numeroPesquisa=input.nextInt();


        // Pesquisar o numero do utilizador
        for(int linha=0;linha <matriz.length ;linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if(matriz[linha][coluna]==numeroPesquisa){
                    somatorio++;
                }
            }
        }

        System.out.println("O numero "+numeroPesquisa+" aparece "+somatorio+" vezes na matriz.");
    }
}
