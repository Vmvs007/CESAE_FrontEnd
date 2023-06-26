import java.util.Scanner;

public class Ex_15 {


    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int a,b,c;
        String escolha;

        // Ler valores do utilizador
        System.out.print("Numero a: ");
        a = input.nextInt();

        System.out.print("Numero b: ");
        b = input.nextInt();

        System.out.print("Numero c: ");
        c = input.nextInt();

        System.out.print("Crescente (C) ou Decrescente (D): ");
        escolha = input.next();

        switch (escolha){
            case "C": // Crescente

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

                break;

            case "D": // Descrescente

                if(a<b && a<c){ // a ... ...
                    if( b<c){ // abc
                        System.out.println(c+" "+b+" "+a);
                    }else{ // acb
                        System.out.println(b+" "+c+" "+a);
                    }
                }


                if(b<a && b<c) { // b ... ...
                    if(a<c){ // bac
                        System.out.println(c+" "+a+" "+b);
                    }else{ // bca
                        System.out.println(a+" "+c+" "+c);
                    }
                }


                if(c<a && c<b){ // c ... ...
                    if(a<b){ // cab
                        System.out.println(b+" "+a+" "+c);
                    }else{ // cba
                        System.out.println(a+" "+b+" "+c);
                    }
                }

                break;

            default:
                break;
        }
    }
}
