// Import obrigatorio do Scanner
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double num1, num2, resultado;
        String operacao;

        // Ler valores do utilizador
        System.out.print("Insira um numero: ");
        num1 = input.nextDouble();

        System.out.print("Insira outro numero: ");
        num2 = input.nextDouble();

        System.out.print("Insira a operacao (+)(-)(/)(*): ");
        operacao=input.next();

        // Escolher um caso dependedo da operacao do utilizador
        switch (operacao){
            case "+":
                resultado=num1+num2;
                System.out.println("Soma: "+ resultado );
                break;

            case "-":
                resultado=num1-num2;
                System.out.println("Subtracao: "+ resultado );
                break;

            case "*":
                resultado=num1*num2;
                System.out.println("Multiplicacao: "+ resultado );
                break;

            case "/":
                resultado=num1/num2;
                System.out.println("Divisao: "+ resultado );
                break;

            default:
                System.out.println("Erro, operacao invalida");
                break;
        }
    }
}
