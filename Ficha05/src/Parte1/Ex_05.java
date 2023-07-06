package Parte1;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 5 *****");

        // Declarar variáveis
        double[] vetor = new double[10];
        double total=0, media;


        // Ciclo para introduzir numeros no vetor
        System.out.println("O utilizador vai introduzir dados\n");
        for(int i=0; i<10 ; i++){
            System.out.print("Introduza um numero no vetor["+i+"]: ");
            vetor[i]= input.nextDouble();
            total=total+vetor[i];
        }

        media = total/10;
        System.out.println("Somatorio: "+total);
        System.out.println("Media: "+ media);



    }
}
