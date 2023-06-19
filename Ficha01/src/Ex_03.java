// Import obrigatorio do Scanner
import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {
        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 3 *****");

        // Declarar as variáveis
        double comprimento, largura, perimetro, area;

        // Ler dimensoes do utilizador
        System.out.print("Insira o comprimento: ");
        comprimento = input.nextDouble();

        System.out.print("Insira a largura: ");
        largura = input.nextDouble();

        // Calcular o perimetro
        perimetro= (comprimento*2)+(largura*2);

        // Apresentar o perimetro
        System.out.println("Perimetro: "+ perimetro);

        // Calcular a area
        area=comprimento*largura;

        // Apresentar a area
        System.out.println("Area: "+area);
    }

}
