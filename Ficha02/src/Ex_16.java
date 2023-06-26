import java.util.Scanner;


public class Ex_16 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int valor, notas;

        // Ler valores do utilizador
        System.out.print("Valor em €: ");
        valor = input.nextInt();

        if(valor%5==0){ // Valor multiplo de 5

            //Calcular o numero de notas de 200
            notas = valor/200;
            System.out.println("Notas de 200: "+ notas);
            valor = valor%200;

            //Calcular o numero de notas de 100
            notas = valor/100;
            System.out.println("Notas de 100: "+ notas);
            valor = valor%100;

            //Calcular o numero de notas de 50
            notas = valor/50;
            System.out.println("Notas de 50: "+ notas);
            valor = valor%50;

            //Calcular o numero de notas de 20
            notas = valor/20;
            System.out.println("Notas de 20: "+ notas);
            valor = valor%20;

            //Calcular o numero de notas de 10
            notas = valor/10;
            System.out.println("Notas de 10: "+ notas);
            valor = valor%10;

            //Calcular o numero de notas de 10
            notas = valor/5;
            System.out.println("Notas de 5: "+ notas);

        }else{ // Valor não é multiplo de 5
            System.out.println("Valor invalido! Tem de ser multiplo de 5");
        }


    }
}
