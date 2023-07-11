package Exercicios;

import java.util.Scanner;

public class Recursividade {
    public static int calcularFatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int n, resultado;

        // Ler input do utilizador
        System.out.println("Insira um número: ");
        n=input.nextInt();

        
        resultado = calcularFatorial(n);
        System.out.println("O fatorial de " + n + ": " + resultado);
    }
}