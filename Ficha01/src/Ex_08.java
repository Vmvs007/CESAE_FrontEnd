// Import obrigatorio do Scanner
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 8 *****");

        // Declarar variáveis
        double produto1, produto2, produto3, preco;

        // Ler valores do utilizador
        System.out.print("Insira um preco de um produto: ");
        produto1 = input.nextDouble();

        System.out.print("Insira um preco de um produto: ");
        produto2 = input.nextDouble();

        System.out.print("Insira um preco de um produto: ");
        produto3 = input.nextDouble();

        // Calcular o preco total
        preco=produto1+produto2+produto3;

        // Apresentar o preco sem desconto
        System.out.println("Preco sem desconto: "+preco);

        // Calcular o preco com desconto
        preco=preco*0.9;

        // Apresentar o preco final
        System.out.println("Preco final: "+preco);
    }
}
