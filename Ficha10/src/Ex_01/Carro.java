package Ex_01;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel combustivel;
    private double consumo;

    /**
     *
     * @param marca Marca do Carro
     * @param modelo Modelo do Carro
     * @param ano Ano de Fabrico
     * @param potencia Potencia (CV)
     * @param cilindrada Cilindrada (CC)
     * @param combustivel Tipo de Combustivel
     * @param consumo Consumo de Combustivel (L/100Km)
     */
    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumo = consumo;
    }

    /**
     * Método para ligar o Carro
     */
    public void ligar(){

        // Avaliar idade do Carro
        if(this.ano>=1993){
            // Se o carro for recente

            // Avaliar a potencia
            if(this.potencia>=250){
                // Carro potente
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMM!");
            }else{
                // Carro com menos de 250 cavalos
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmm!");
            }

        }else{
            // Se o carro tiver mais de 30 anos

            // Avaliar o tipo de combustivel
            if(this.combustivel.equals(TipoCombustivel.DIESEL)){
                // Carro a diesel
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else {
                // Carro não diesel
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        }

    }

    /**
     * Método para fazer uma corrida de carros
     * @param adversario Carro Adversario
     * @return Retorna o carro vencedor || null se empatar
     */
    public Carro corrida(Carro adversario){

        if(this.potencia>adversario.potencia){
            // Ganha o meu carro
            return this;
        }else{
            if(adversario.potencia>this.potencia){
                // Ganha o adversario
                return adversario;
            }else{
                // Empate por potencia

                if(this.cilindrada>adversario.cilindrada){
                    // Ganha o meu carro
                    return this;
                }else {
                    if(adversario.cilindrada>this.cilindrada){
                        // Ganha o adversario
                        return adversario;
                    }else {
                        // Empate por cilindrada

                        if(this.ano>adversario.ano){
                            // Ganha o meu carro
                            return this;
                        }else{
                            if(adversario.ano>this.ano){
                                // Ganha o adversario
                                return adversario;
                            }else {
                                // Empate
                                return null;
                            }
                        }
                    }
                }
            }
        }
}

    /**
     * Método que imprime na consola todos os detalhes de um carro
     */
    public void exibirDetalhes(){
    System.out.println("Marca: "+this.marca);
    System.out.println("Modelo: "+this.modelo);
    System.out.println("Ano: "+this.ano);
    System.out.println("Potencia: "+this.potencia);
    System.out.println("Cilindrada: "+this.cilindrada);
    System.out.println("Tipo de Combustivel: "+this.combustivel);
    System.out.println("L/100Km: "+this.consumo+"L");
}


}
