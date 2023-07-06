import java.util.Scanner;

public class Exemplo {

    /**
     * Função que retorna o maior de dois números
     * @param num1 - Número a avaliar
     * @param num2 - Número a avaliar
     * @return - Maior dos dois
     */
    static int maiorNumero(int num1, int num2){

        if(num1<num2){
            return num2;
        }else{
            return num1;
        }

    }


    /**
     * Função que soma 5 a um número
     * @param num - Número original
     * @return Número mais 5
     */
    static int somar5 (int num){
        return num+5;
}



    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
       int num1, num2, maior;

        System.out.print("Introduza o numero: ");
        num1=input.nextInt();

        System.out.print("Introduza o numero: ");
        num2=input.nextInt();

        maior = maiorNumero(num1,num2);

        System.out.println("Maior: "+maior);

        System.out.println(num1 + " + 5 = "+ somar5(num1));
    }
}
