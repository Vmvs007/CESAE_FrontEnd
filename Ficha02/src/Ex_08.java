// Import obrigatorio do Scanner
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double nota1, nota2, nota3, media;

        // Ler valores do utilizador
        System.out.print("Insira a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Insira a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Insira a terceira nota: ");
        nota3 = input.nextDouble();

        // Calcular a media
        media = (nota1*0.25)+(nota2*0.35)+(nota3*0.40);

        System.out.println("Media: "+ media);

        // Verificar se o aluno está aprovado ou não
        if(media>=9.5){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
