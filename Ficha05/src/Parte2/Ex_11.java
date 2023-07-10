package Parte2;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int menor,maior;

        // Ler input do utilizador para a matriz
        for(int linha=0;linha < matriz.length ;linha++){
            for(int coluna =0 ; coluna<matriz[0].length; coluna++){
                System.out.print("Introduza um numero na matriz["+linha+"]["+coluna+"]: ");
                matriz[linha][coluna]=input.nextInt();
            }
        }

        // Inicializar o menor e o maior com a primeira posição da matriz
        menor=matriz[0][0];
        maior=matriz[0][0];

        // Saber o menor e o maior elemento
        for(int linha=0;linha < matriz.length ;linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if(matriz[linha][coluna]<menor){
                    menor=matriz[linha][coluna];
                }

                if(matriz[linha][coluna]>maior){
                    maior = matriz[linha][coluna];
                }


            }
        }

        // Imprimir a matriz
        for(int linha=0;linha <3 ;linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("\t"+matriz[linha][coluna]);
            }
            System.out.println();
        }

        // Imprimir o menor e o maior elemento
        System.out.println("\nMenor: "+menor);
        System.out.println("Maior: "+maior);


    }
}
