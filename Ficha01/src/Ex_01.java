import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 1 *****");

        // Declarar variável
        int num1, num2, resultado;

        // Ler num1
        System.out.print("Introduza um numero inteiro: ");
        num1=input.nextInt();

        // Ler num2
        System.out.print("Introduza outro numero inteiro: ");
        num2=input.nextInt();

        // Somar num1 com num2
        resultado=num1+num2;

        // Apresentar resultado
        System.out.println("Resultado da soma: "+resultado);
    }
}
