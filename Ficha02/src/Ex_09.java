// Import obrigatorio do Scanner
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int num1, num2, num3;

        // Ler valores do utilizador
        System.out.print("Insira o num1: ");
        num1 = input.nextInt();

        System.out.print("Insira o num2: ");
        num2 = input.nextInt();

        System.out.print("Insira o num3: ");
        num3 = input.nextInt();


        // Menor é o numero 1?
        if(num1<num2 && num1<num3){
            System.out.println("Menor num1: "+num1);
        }

        // Menor é o numero 2?
        if(num2<num1 && num2<num3){
            System.out.println("Menor num2: "+num2);
        }

        // Menor é o numero 3?
        if(num3<num1 && num3<num2){
            System.out.println("Menor num3: "+num3);
        }


        // Parte opcional - Se algum dos numeros for igual a outro!
        if(num1==num2 && num2==num3){
            System.out.println("Sao todos iguais!!");
        }else{
            if(num1==num2){
                System.out.println("Num1 e Num2 sao iguais!!");
            }

            if(num2==num3){
                System.out.println("Num2 e Num3 sao iguais!!");
            }

            if(num1==num3){
                System.out.println("Num1 e Num3 sao iguais!!");
            }
        }
    }
}
