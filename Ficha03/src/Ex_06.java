import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, anterior, sucessor;

        // Ler input do Utilizador
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        // Inicializar o anterior e o sucessor
        anterior = num-5;
        sucessor = num+5;

        // Ciclo para imprimir os anteriores
        while(anterior<num){
            System.out.println(anterior);
            anterior++;
        }

        // Incrementamos o numero
        num++;

        // Ciclo para imprimir os sucessores
        while(num<=sucessor){
            System.out.println(num);
            num++;
        }


    }

}
