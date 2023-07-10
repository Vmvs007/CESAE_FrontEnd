package Parte2;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2];

        // Ler input do utilizador para o Array 1
        for(int i =0 ; i< array1.length ; i++){
            System.out.print("Insira um valor no Array 1 ["+i+"]: ");
            array1[i]= input.nextInt();
        }

        // Enter na consola
        System.out.println();

        // Ler input do utilizador para o Array 2
        for(int i =0 ; i< array2.length ; i++){
            System.out.print("Insira um valor no Array 2 ["+i+"]: ");
            array2[i]= input.nextInt();
        }

        // Apresentar Array 1
        for(int i =0 ; i< array1.length ; i++){
            System.out.println("Array 1 ["+i+"]: "+array1[i]);
        }

        // Enter na consola
        System.out.println();

        // Apresentar Array 2
        for(int i =0 ; i< array2.length ; i++){
            System.out.println("Array 2 ["+i+"]: "+array2[i]);
        }

// Enter na consola
        System.out.println();

        // Transferir os elementos para a matriz
        for(int linha=0; linha<matriz.length; linha++){
            matriz[linha][0]= array1[linha];
            matriz[linha][1]= array2[linha];
        }


        // Apresentar a matriz
        for(int linha=0;linha <matriz.length ;linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("\t"+matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
