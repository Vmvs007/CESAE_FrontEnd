import java.util.Scanner;
import java.util.Set;

public class Ex_03 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, iterador=0;

        // Ler input do Utilizador
        System.out.print("Introduza um numero: ");
        limite=input.nextInt();

        while(iterador<=limite){
            System.out.println(iterador);

            // iterador += 1;
            // iterador = iterador + 1;
            iterador++;
        }
    }

}
