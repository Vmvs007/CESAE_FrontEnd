import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {

        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num=0, somatorio=0, contagem=0, media;

        while(num!=-1){

            // Ler input do Utilizador
            System.out.print("Introduza um numero: ");
            num = input.nextDouble();

            if (num != -1) {

                // Somar ao somatorio
                somatorio=somatorio+num;

                // Contar numeros
                contagem++;
            }

        }

        //  Calcula a media
        media= somatorio/contagem;

        // Apresento a media
        System.out.println("Media: "+media);
    }
}
