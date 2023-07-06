package Parte1;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 6 *****");

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorPar=1;
        boolean inicializar = true;

        // Ciclo para introduzir numeros no vetor
        System.out.println("O utilizador vai introduzir dados\n");
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduza um numero no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if(vetor[i]%2==0 && inicializar){
                maiorPar=vetor[i];
                System.out.println("Maior Par Inicializado a: "+maiorPar);
                inicializar=false;
            }

            if(vetor[i]>maiorPar && vetor[i]%2==0){
                maiorPar=vetor[i];
                System.out.println("Maior Par Alterado para: "+maiorPar);
            }

        }

        if(maiorPar%2==0){
            System.out.println("Nao temos numeros pares no array...");
        }else {
            System.out.println("Variavel Maior Par: " + maiorPar);
        }

    }
}
