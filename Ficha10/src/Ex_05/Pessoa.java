package Ex_05;

public class Pessoa {

    private String nome, email;
    private int idade, telemovel;

    public Pessoa(String nome, String email, int idade, int telemovel) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telemovel = telemovel;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Telemovel: "+this.telemovel);
        System.out.println("Email: "+this.email);
    }
}
