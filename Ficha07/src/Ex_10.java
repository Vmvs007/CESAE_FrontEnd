import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) throws FileNotFoundException {

        // Declarar variáveis
        String linha;
        String[] linhaDividida = new String[4];
        double valorTotal=0;

        // Abrir o ficheiro
        File ficheiro = new File("files/exercicio_10.csv");

       // Instanciar o Scanner
        Scanner scannerFicheiro = new Scanner(ficheiro);

        // Avançar a primeira linha à frente
        scannerFicheiro.nextLine();

        // Para cada linha do ficheiro
        while (scannerFicheiro.hasNextLine()){
            // Passar a linha do ficheiro para a variável String "linha"
            linha = scannerFicheiro.nextLine();

            // Dividir a linha com base na "," e passar o conteudo para o array
            linhaDividida=linha.split(",");

            // Enter
            System.out.println("\n");
            System.out.println(linha);
            // Ciclo para imprimir o array -> NÃO FAZ PARTE DO EXERCÍCIO
            for(int i=0; i<linhaDividida.length;i++){
                System.out.println("Array["+i+"]: "+linhaDividida[i]);
            }

            valorTotal += Double.parseDouble(linhaDividida[3]);

        }

        System.out.println("\nValor Total de Vendas: "+valorTotal);

    }
}
