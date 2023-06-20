// Import obrigatorio do Scanner
import java.util.Scanner;


public class Ex_06 {

    public static void main(String[] args) {
        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int num1, num2;

        // Ler valores do utilizador
        System.out.print("Insira um numero: ");
        num1 = input.nextInt();

        System.out.print("Insira outro numero: ");
        num2 = input.nextInt();

        // Comparar num1 com num2
        if(num1<num2){
            System.out.println(num2 +" "+num1);
        }else{
            System.out.println(num1 +" "+num2);
        }
    }

}