// Import obrigatorio do Scanner
import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double saldo, montante;

        // Ler valores do utilizador
        System.out.print("Insira o saldo: ");
        saldo = input.nextDouble();

        System.out.print("Insira o montante a creditar (+) ou debitar (-): ");
        montante = input.nextDouble();


        if((saldo+montante)<0){
            System.out.println("Operacao Invalida, nao tem saldo suficiente");
        }else{
            // Atualiza o saldo
            saldo=saldo+montante;
            System.out.println("Operacao realizada com sucesso");
        }


        System.out.println("Novo Saldo: "+saldo);
    }
}
