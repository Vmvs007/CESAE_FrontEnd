package Exercicios;

import java.util.Scanner;

import static A_Minha_Biblioteca.Funcoes.*;

public class Ex_06 {


    static void menu(int num){

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do{
            do{
                System.out.println("1 - Par ou Impar");
                System.out.println("2 - Positivo ou Negativo");
                System.out.println("3 - Primo");
                System.out.println("4 - Sair");

                System.out.println("\nEscolha uma opção: ");
                opcao= input.nextInt();
            }while (opcao<1 || opcao>4);

            switch (opcao){

                case 1: // Par ou Impar
                    if(par(num)){
                        System.out.println("Par");
                    }else{
                        System.out.println("Impar");
                    }
                    break;

                case 2: // Positivo ou Negativo
                    if(positivo(num)){
                        System.out.println("Positivo");
                    }else{
                        System.out.println("Negativo");
                    }
                    break;

                case 3: // Primo
                    if(primo(num)){
                        System.out.println("Primo");
                    }else{
                        System.out.println("Não Primo");
                    }
                    break;

                case 4: // Sair

                    break;
            }

        }while (opcao!=4);

    }


    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        // Ler input do utilizador
        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        menu(numero);
    }
}
