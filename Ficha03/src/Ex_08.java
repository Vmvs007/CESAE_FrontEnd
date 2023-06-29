import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numUtilizador, iterador=2;

        // Ler input do Utilizador
        System.out.print("Introduza um numero: ");
        numUtilizador= input.nextInt();

        // Ciclo que executa do iterador até ao numUtilizador (de 2 em 2)
        while(iterador<=numUtilizador){
            System.out.println(iterador);
            iterador+=2;
        }

    }
}