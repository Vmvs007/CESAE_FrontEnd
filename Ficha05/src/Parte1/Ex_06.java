package Parte1;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 6 *****");

        // Declarar variáveis
        int[] vetor = new int[10];
        boolean crescente=true;

        // Ciclo para introduzir numeros no vetor
        System.out.println("O utilizador vai introduzir dados\n");
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduza um numero no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for(int i=1; i<10;i++){
            System.out.println("Comparar: "+vetor[i]+"<"+vetor[i-1]);
            if(vetor[i]<=vetor[i-1]){
                System.out.println("Verdadeiro! Nao e crescente!");
                crescente=false;
            }
        }

        if(crescente){
            System.out.println("Array Crescente");
        }else{
            System.out.println("Array nao e Crescente");
        }

    }
}
