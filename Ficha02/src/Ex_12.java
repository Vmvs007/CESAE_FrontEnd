// Import obrigatorio do Scanner
import java.util.Scanner;
public class Ex_12 {
    public static void main(String[] args) {
        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int operacao;

        // Imprimir opcoes
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        // Ler valores do utilizador
        System.out.print("Insira a operacao: ");
        operacao = input.nextInt();

        switch (operacao){
            case 1:
                System.out.println("Escolheu criar");
                break;

            case 2:
                System.out.println("Escolheu atualizar");
                break;

            case 3:
                System.out.println("Escolheu eliminar");
                break;

            case 4:
                break;

            default:
                System.out.println("Escolha invalida");
        }
    }
}
