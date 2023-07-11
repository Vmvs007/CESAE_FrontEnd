package Exercicios;

import java.util.Scanner;

public class Ex_02 {

    static boolean par(int num){
        System.out.println("Função \"par\" a começar...");

        if(num%2==0){
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
        boolean numeroPar = par(numero);

        // Imprimir na consola se o número inserido é par ou impar
        if(numeroPar){
            System.out.print("Par");
        }else{
            System.out.print("Impar");
        }

    }

}
