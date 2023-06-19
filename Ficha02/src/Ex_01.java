// Import obrigatorio do Scanner
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int a,b;

        // Ler valores do utilizador
        System.out.print("Insira um numero: ");
        a= input.nextInt();

        System.out.print("Insira um numero: ");
        b= input.nextInt();

        if(a==b){ // A e B são iguais
            System.out.println("Sao iguais!");
        }else{ // A e B são diferentes

            if(a>b){
                System.out.println("Maior foi o primeiro: "+a);
            }else{
                System.out.println("Maior foi o segundo: "+b);
            }

        }


    }
}
