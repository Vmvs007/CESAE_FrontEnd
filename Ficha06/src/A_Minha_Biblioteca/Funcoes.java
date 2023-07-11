package A_Minha_Biblioteca;

public class Funcoes {

    public static boolean par(int num){
        System.out.println("Função \"par\" a começar...");

        if(num%2==0){
            System.out.println("Return true");
            return true;
        }else{
            System.out.println("Return false");
            return false;
        }
    }

    public static boolean positivo(int num){
        System.out.println("Função \"positivo\" a começar...");

        if(num>=0){
            System.out.println("Return true");
            return true;
        }else{
            System.out.println("Return false");
            return false;
        }
    }

    public static boolean primo(int num){
        System.out.println("Função \"primo\" a começar...");

        for(int i=2; i<num ; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;

    }


}
