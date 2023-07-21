import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibliotecaFicheiros {

    /**
     * Imprime o conteúdo de um ficheiro de texto na consola
     * @param ficheiro - Ficheiro a ser impresso
     * @throws FileNotFoundException - Caso o ficheiro não exista
     */
    public static void imprimirFicheiro(File ficheiro) throws FileNotFoundException {

        // Declarar variáveis
        String linhaFicheiro;
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
