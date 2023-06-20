// Import obrigatorio do Scanner
import java.util.Scanner;


public class Ex_04 {
    public static void main(String[] args) {


        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int lugar;

        // Ler valores do utilizador
        System.out.print("Insira o lugar em que terminou a corrida: ");
        lugar = input.nextInt();

        switch (lugar){
            case 1:
                System.out.println("Ganhou 10 pontos");
                break;

            case 2:
                System.out.println("Ganhou 8 pontos");
                break;

            case 3:
                System.out.println("Ganhou 6 pontos");
                break;

            case 4:
                System.out.println("Ganhou 5 pontos");
                break;

            case 5:
                System.out.println("Ganhou 4 pontos");
                break;

            case 6:
                System.out.println("Ganhou 3 pontos");
                break;

            case 7:
                System.out.println("Ganhou 2 pontos");
                break;

            case 8:
                System.out.println("Ganhou 1 ponto");
                break;

            default:
                System.out.println("Nao tem direito a pontos");
                break;
        }
    }
}
