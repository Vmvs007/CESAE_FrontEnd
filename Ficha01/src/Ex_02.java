// Import obrigatorio do Scanner
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 2 *****");

        // Declarar as variáveis
        double num1, num2, resultado;

        // Ler do utilizador o num1
        System.out.print("Insira um número: ");
        num1 = input.nextDouble();

        // Ler do utilizador o num2
        System.out.print("Insira um número: ");
        num2 = input.nextDouble();

        // Somar os valores
        resultado = num1+num2;
        System.out.println("O resultado da Soma entre "+num1+" com "+num2+": "+resultado);

        // Subtrair os valores
        resultado= num1-num2;
        System.out.println("Subtracao: "+resultado);

        // Multiplicar os valores
        resultado = num1*num2;
        System.out.println("Multiplicacao: "+resultado);

        // Dividir os valores
        resultado = num1/num2;
        System.out.println("Divisao: "+resultado);
    }
}
