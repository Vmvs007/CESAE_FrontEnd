// Import obrigatorio do Scanner
import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 9 *****");

        // Declarar variáveis
        int segundosTotais=0, tempoMusica=0,horas=0,minutos=0, segundos=0;

        // Ler minutos da musica1
        System.out.print("Insira os minutos da musica 1: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da musica1
        System.out.print("Insira os segundos da musica 1: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Ler minutos da musica2
        System.out.print("Insira os minutos da musica 2: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da musica2
        System.out.print("Insira os segundos da musica 2: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Ler minutos da musica3
        System.out.print("Insira os minutos da musica 3: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da musica3
        System.out.print("Insira os segundos da musica 3: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Ler minutos da musica4
        System.out.print("Insira os minutos da musica 4: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da musica4
        System.out.print("Insira os segundos da musica 4: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Ler minutos da musica5
        System.out.print("Insira os minutos da musica 5: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da musica5
        System.out.print("Insira os segundos da musica 5: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        System.out.println("Total do Album em segundos: " +segundosTotais);

        // Converter para horas minutos segundos
        horas=segundosTotais/3600;
        minutos=(segundosTotais/60)-(horas*60);
        segundos=(segundosTotais)-(horas*3600)-(minutos*60);

        // Imprimir duracao album
        System.out.println("Duracao do Album:");
        System.out.println(horas+"h "+minutos+"m "+ segundos+"s");
    }
}
