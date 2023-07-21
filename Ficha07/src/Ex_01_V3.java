import java.io.File;
import java.io.FileNotFoundException;

public class Ex_01_V3 {

    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("files/exercicio_01_Alternativa02.txt");
        BibliotecaFicheiros.imprimirFicheiro(ficheiro);
    }
}
