package Parte1;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 4 *****");

        // Declarar variáveis
        int[] vetor = new int[10];
        int menor;


        // Ciclo para introduzir numeros no vetor
        System.out.println("O utilizador vai introduzir dados\n");
        for(int i=0; i<10 ; i++){
            System.out.print("Introduza um numero no vetor["+i+"]: ");
            vetor[i]= input.nextInt();
        }


        menor=vetor[0];

        System.out.println("O menor foi inicializado a: "+menor);


        for(int i=0; i<10; i++){
            System.out.println("Comparar se: "+vetor[i]+"<"+menor);
            if(vetor[i]<menor){
                System.out.println("Verdadeiro");
                menor=vetor[i];
                System.out.println("Menor atualizado para: "+menor);
            }else{
                System.out.println("Falso");
            }
        }

        System.out.println("Menor: "+menor);

    }
}