// Import obrigatorio do Scanner
import java.util.Scanner;


public class Ex_02 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double salario;

        // Ler valores do utilizador
        System.out.print("Insira o salario: ");
        salario = input.nextDouble();

        // Comparar o salario com 15.000
        if(salario<=15000){ // Salario inferior ou igual que 15000
            System.out.println("Montante de impostos a pagar e 20 porcento: "+ salario*0.2);
        }else{ // Salario superior que 15000
            System.out.println("Montante de impostos a pagar e 30 porcento: "+ salario*0.3);
        }
    }
}
