import java.util.Scanner;


// Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo while.

public class Ex_13 {
    public static void main(String[] args) {

        // Import obrigatório do Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variáveis
        int n;

        // Ler input do Utilizador
        System.out.print("Introduza um número inteiro não-negativo: ");
        n = scanner.nextInt();


        int fatorial = 1;
        int i = 1;

        while (i <= n) {
            fatorial *= i;
            i++;
        }

        System.out.println("O fatorial de " + n + ": " + fatorial);
    }
}
