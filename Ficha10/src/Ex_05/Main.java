package Ex_05;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor","vmvs007@gmail.com", 24, 911111111);
        Pessoa pessoa2 = new Pessoa("Joaquim","quim@gmail.com", 43, 911111112);
        Pessoa pessoa3 = new Pessoa("Maria","maria@gmail.com", 30, 911111133);
        Pessoa pessoa4 = new Pessoa("Ana","ana@gmail.com", 35, 911111144);

        Agenda agendaPessoal = new Agenda();

        agendaPessoal.addPessoa(pessoa1);
        agendaPessoal.addPessoa(pessoa2);
        agendaPessoal.addPessoa(pessoa3);
        agendaPessoal.addPessoa(pessoa4);

        agendaPessoal.listarAgenda();
    }
}
