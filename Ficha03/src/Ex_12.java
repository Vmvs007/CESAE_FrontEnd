import java.util.Scanner;
public class Ex_12 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, sucessor, quantidade, contador=1;
        boolean crescente = true;

        // Ler input do Utilizador
        System.out.print("Quantos numeros quer introduzir: ");
        quantidade = input.nextInt();

        System.out.print("Introduza um numero: ");
        num = input.nextInt();


        while (contador<quantidade){

            System.out.print("Introduza um numero: ");
            sucessor = input.nextInt();

            if(sucessor<=num){
                crescente=false;
            }

            num=sucessor;

            contador++;
        }

        if(crescente){
            System.out.println("Crescente");
        }else{
            System.out.println("Nao crescente");
        }

    }
}
