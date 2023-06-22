// Import obrigatorio do Scanner
import java.util.Scanner;


public class Ex_07 {

    public static void main(String[] args) {
        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int num;

        // Ler valores do utilizador
        System.out.print("Insira um numero: ");
        num = input.nextInt();

        if(num%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }


}
