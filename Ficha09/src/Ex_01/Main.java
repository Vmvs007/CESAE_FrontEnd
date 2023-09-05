package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor",24,1.7);
        Pessoa pessoa2= new Pessoa("Ana", 29, 1.6);

        System.out.println("***** Detalhes da Ex_01.Pessoa 1 *****");
        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        System.out.println("\n***** Detalhes da Ex_01.Pessoa 2 *****");


    }
}