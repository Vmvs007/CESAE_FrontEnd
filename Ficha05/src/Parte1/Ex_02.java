package Parte1;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 1 *****");

        // Declarar variáveis
        double[] precos = new double[10];
        double total=0;

        // Ciclo para introduzir numeros no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduza um preco [" + i + "]: ");
            precos[i] = input.nextInt();
            total=total+precos[i];
        }

        System.out.println("Preco Total: "+ total);


    }
}