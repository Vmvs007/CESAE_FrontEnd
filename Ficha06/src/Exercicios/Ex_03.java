package Exercicios;

import java.util.Scanner;

public class Ex_03 {

    static boolean positivo(int num){
        System.out.println("Função \"positivo\" a começar...");

        if(num>=0){
            System.out.println("Return true");
            return true;
        }else{
            System.out.println("Return false");
            return false;
        }
    }

    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        // Ler input do utilizador
        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        // Gravar numa variável boolean o return da função
        boolean positivo = positivo(numero);

        // Imprimir na consola se o número inserido é par ou impar
        if(positivo){
            System.out.print("Positivo");
        }else{
            System.out.print("Negativo");
        }

    }

}
