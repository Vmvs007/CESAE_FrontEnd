import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) throws FileNotFoundException {

        // Declarar variáveis
        String linhaFicheiro;

        // Abrir o ficheiro
        File ficheiro = new File("files/exercicio_01_Alternativa02.txt");

        // Instanciar o Scanner
        Scanner scannerFile = new Scanner(ficheiro);

        while (scannerFile.hasNextLine()){
            // Passar a linha do ficheiro para a variável String "linhaFicheiro"
            linhaFicheiro=scannerFile.nextLine();

            // Imprimir linha do ficheiro
            System.out.println(linhaFicheiro);
        }



    }
}




