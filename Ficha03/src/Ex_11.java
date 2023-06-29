import java.util.Scanner;
public class Ex_11 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, limite;

        // Ler input do Utilizador
        System.out.print("Introduza o inicio do intervalo: ");
        inicio = input.nextInt();

        System.out.print("Introduza o fim do intervalo: ");
        limite = input.nextInt();

        while(inicio<=limite){
            if(inicio%5==0){
                System.out.println(inicio);
            }
            inicio++;
        }

    }}
