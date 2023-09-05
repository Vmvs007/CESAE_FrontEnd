package Ex_11;

public class Conta {

    private String numero_Conta;
    private double saldo=0;
    private String titular;

    /**
     * Método Construtor para uma Conta
     * @param numero_Conta - IBAN (Numero da Conta)
     * @param titular - Nome do Titular da Conta
     */
    public Conta(String numero_Conta, String titular) {
        this.numero_Conta = numero_Conta;
        this.titular = titular;
    }

    /**
     * Método para Depositar Dinheiro na Conta
     * @param valor - Valor a Depositar
     */
    public void depositar(double valor){
        this.saldo+=valor;
        System.out.println("\nDepósito Efetuado");
    }

    /**
     * Método para Levantar Dinheiro da Conta
     * @param valor - Valor a Levantar
     */
    public void levantar(double valor){

        if(this.saldo>=valor){
            // Caso possa levantar
            this.saldo-=valor;
            System.out.println("\nLevantamento Efetuado");
        }else{
            // Caso não tenha saldo suficiente
            System.out.println("\nLevantamento Recusado! Saldo Insuficiente!");
        }
    }

    /**
     * Método para Transferir Dinheiro de uma Conta para Outra
     * @param contaDestino
     * @param valor
     */
    public void transferir(Conta contaDestino, double valor){

        if(this.saldo>= valor){
            // Caso a transferencia seja valida
            System.out.println("\nTransferencia Concluida!");
            this.saldo-=valor;
            contaDestino.depositar(valor);
        }else{
            // Transferencia invalida, saldo insuficiente
            System.out.println("\nTransferencia Recusada! Saldo Insuficiente");
        }
    }

    /**
     * Método para Imprimir na Consola os Detalhes da Conta
     */
    public void verDetalhes(){
        System.out.println("\nNumero da Conta: "+this.numero_Conta);
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo Atual: "+ this.saldo);
    }

}
