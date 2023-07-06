package Parte1;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 3 *****");

        // Declarar variáveis
        int[] vetor = new int[10];
        int maior;


        // Ciclo para introduzir numeros no vetor
        System.out.println("O utilizador vai introduzir dados\n");
        for(int i=0; i<10 ; i++){
            System.out.print("Introduza um numero no vetor["+i+"]: ");
            vetor[i]= input.nextInt();
        }


        maior=vetor[0];

        System.out.println("O maior foi inicializado a: "+maior);


        for(int i=0; i<10; i++){
            System.out.println("Comparar se: "+vetor[i]+">"+maior);
            if(vetor[i]>maior){
                System.out.println("Verdadeiro");
                maior=vetor[i];
                System.out.println("Maior atualizado para: "+maior);
            }else{
                System.out.println("Falso");
            }
        }

        System.out.println("Maior: "+maior);

    }
}