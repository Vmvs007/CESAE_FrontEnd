// Import obrigatorio do Scanner
import java.util.Scanner;
public class Ex_14 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int a,b,c;

        // Ler valores do utilizador
        System.out.print("Numero a: ");
        a = input.nextInt();

        System.out.print("Numero b: ");
        b = input.nextInt();

        System.out.print("Numero c: ");
        c = input.nextInt();


        if(a<b && a<c){ // a ... ...
            if( b<c){ // abc
                System.out.println(a+" "+b+" "+c);
            }else{ // acb
                System.out.println(a+" "+c+" "+b);
            }
        }


        if(b<a && b<c) { // b ... ...
            if(a<c){ // bac
                System.out.println(b+" "+a+" "+c);
            }else{ // bca
                System.out.println(b+" "+c+" "+a);
            }
        }


        if(c<a && c<b){ // c ... ...
            if(a<b){ // cab
                System.out.println(c+" "+a+" "+b);
            }else{ // cba
                System.out.println(c+" "+b+" "+a);
            }
        }

    }
}
