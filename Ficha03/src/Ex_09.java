import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, salto, iterador=0;

        // Ler input do Utilizador
        System.out.print("Introduza um limite: ");
        limite= input.nextInt();

        System.out.print("Introduza um salto: ");
        salto= input.nextInt();


        while(iterador<limite){
            System.out.println(iterador);
            iterador+=salto;
        }
    }
}
