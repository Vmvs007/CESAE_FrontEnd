package Ex_11;

public class Main {
    public static void main(String[] args) {

        // Instanciar Contas
        Conta conta1 = new Conta("12345", "Vitor");
        Conta conta2 = new Conta("67890", "Primo da Suiça");

        conta1.verDetalhes();

        // Depositar
        conta1.depositar(500);

        conta1.verDetalhes();

        // Levantar Dinheiro a Mais
        conta1.levantar(750);

        conta1.verDetalhes();

        // Levantar Dinheiro Válido
        conta1.levantar(40);

        conta1.verDetalhes();

        // Transferir Invalido
        conta1.transferir(conta2,10000);

        conta1.verDetalhes();
        conta2.verDetalhes();

        // Trasnferir Valida
        conta1.transferir(conta2,110);

        conta1.verDetalhes();
        conta2.verDetalhes();
    }
}
