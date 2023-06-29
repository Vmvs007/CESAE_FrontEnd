import java.util.Scanner;
public class Ex_10 {
    public static void main(String[] args) {

        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        // Intervalo_1 = [0,25]
        // Intervalo_2 = [26,50]
        // Intervalo_3 = [51,75]
        // Intervalo_4 = [76,100]
        int intervalo_1=0, intervalo_2=0, intervalo_3=0, intervalo_4=0, num=1;

        while(num>=0){

            // Ler input do Utilizador
            System.out.print("Introduza um numero: ");
            num= input.nextInt();

            // Perceber se o numero está entre 0 e 25
            if(num>=0 && num<=25){
                intervalo_1++;
            }

            // Perceber se o numero está entre 26 e 50
            if(num>=26 && num<=50){
                intervalo_2++;
            }

            // Perceber se o numero está entre 51 e 75
           if(num>=51 && num<=75){
                intervalo_3++;
            }

            // Perceber se o numero está entre 76 e 100
           if(num>=76 && num<=100){
                intervalo_4++;
            }
        }

        System.out.println("[00,25]: "+ intervalo_1);
        System.out.println("[26,50]: "+intervalo_2);
        System.out.println("[51,75]: "+intervalo_3);
        System.out.println("[76,100]: "+intervalo_4);

    }
}
