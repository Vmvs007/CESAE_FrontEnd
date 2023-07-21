import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("files/exercicio_02.txt");

        PrintWriter printWriter = new PrintWriter(ficheiro);

        printWriter.println("Hello, teste de criação de ficheiro");

        printWriter.close();

    }
}