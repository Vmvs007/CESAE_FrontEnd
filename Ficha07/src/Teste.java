package FichaPratica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Teste {


    public static void main(String[] args) throws IOException {

        File ficheiro = new File("files/exercicio_02.txt");

            //objeto para escrita no ficheiro
            FileWriter fileWriter = new FileWriter(ficheiro, true);

            //acrescentar conteudo da variável "texto" ao ficheiro
            fileWriter.write("texto...\n");
        fileWriter.write("teste de escrita...\n");

            fileWriter.close();
        }
}