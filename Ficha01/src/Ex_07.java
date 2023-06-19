// Import obrigatorio do Scanner
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 7 *****");

        // Declarar variáveis
        int valor1,valor2;

        // Ler valores do utilizador
        System.out.print("Insira um numero: ");
        valor1 = input.nextInt();

        System.out.print("Insira um numero: ");
        valor2 = input.nextInt();

        // Imprimir os valores inseridos
        System.out.println("\nValor 1: "+valor1);
        System.out.println("Valor 2: "+valor2);

        // Lógica de troca
       valor1=valor1+valor2;
       valor2=valor1-valor2;
       valor1=valor1-valor2;


        // Apresentar os valores trocados
        System.out.println("\nValor 1 Trocado: "+valor1);
        System.out.println("Valor 2 Trocado: "+valor2);
    }
}
