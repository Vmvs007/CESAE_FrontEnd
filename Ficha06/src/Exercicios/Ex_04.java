package Exercicios;

import java.util.Scanner;

public class Ex_04 {

    static boolean primo(int num){
        System.out.println("Função \"primo\" a começar...");

        for(int i=2; i<num ; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        // Ler input do utilizador
        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        // Imprimir na consola se o número inserido é par ou impar
        if(primo(numero)){
            System.out.print("Primo");
        }else{
            System.out.print("Não primo");
        }

    }

}
