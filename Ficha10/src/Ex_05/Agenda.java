package Ex_05;

public class Agenda {

    private Pessoa[] agenda;
    private int ultimaPosicao=0;

    public Agenda() {
        this.agenda = new Pessoa[50];
    }

    public void addPessoa(Pessoa pessoaNova){
        this.agenda[this.ultimaPosicao++] = pessoaNova;
    }

    public void listarAgenda(){
        for(int i=0; i<this.ultimaPosicao;i++){
            System.out.println("\nContacto ["+i+"]:");
            this.agenda[i].exibirDetalhes();
        }
    }
}
