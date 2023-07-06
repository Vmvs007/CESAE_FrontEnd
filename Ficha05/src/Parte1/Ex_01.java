package Parte1;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 1 *****");

        // Declarar variáveis
        int[] vetor = new int[10];

        // Ciclo para introduzir numeros no vetor
        for(int i=0; i<10 ; i++){
            System.out.print("Introduza um numero no vetor["+i+"]: ");
            vetor[i]= input.nextInt();
        }

        System.out.println();

        // Ciclo para imprimir o conteudo do vetor
        for(int i=0; i<10; i++){
            System.out.println("Vetor["+i+"]: "+vetor[i]);
        }
    }

}
