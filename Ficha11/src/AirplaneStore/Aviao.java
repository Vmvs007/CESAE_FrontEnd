package AirplaneStore;

public class Aviao {

    private String modelo;
    private int anoFabrico, serial, n_motores;
    private double peso, cmp_fuselagem, env_asas, alt_cauda, autonomia, velocidade_max, preco;

    /**
     * Método Construtor
     * @param modelo Modelo do Avião
     * @param anoFabrico Ano de Fabrico do Avião
     * @param serial Número de Série
     * @param n_motores Número de Motores
     * @param peso Peso (Kg.)
     * @param cmp_fuselagem Comprimento da Fuselagem (m.)
     * @param env_asas Envergadura das Asas (m.)
     * @param alt_cauda Altura da Causa (m.)
     * @param autonomia Autonomia (Km.)
     * @param velocidade_max Velocidade Máxima (Km/h)
     * @param preco Preço (€)
     */
    public Aviao(String modelo, int anoFabrico, int serial, int n_motores, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, double autonomia, double velocidade_max, double preco) {
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.serial = serial;
        this.n_motores = n_motores;
        this.peso = peso;
        this.cmp_fuselagem = cmp_fuselagem;
        this.env_asas = env_asas;
        this.alt_cauda = alt_cauda;
        this.autonomia = autonomia;
        this.velocidade_max = velocidade_max;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    /**
     * Método que imprime todos os detalhes de um <b>Avião</b> na consola
     */
    public void exibirDetalhes(){
        System.out.println("Serial: "+this.serial);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano de Fabrico: "+this.anoFabrico);
        System.out.println("Peso: "+this.peso+" Kg.");
        System.out.println("Comprimento da Fuselagem: "+this.cmp_fuselagem+ " m.");
        System.out.println("Envergadura das Asas: "+this.env_asas+ " m.");
        System.out.println("Altura da Cauda: "+this.alt_cauda+ " m.");
        System.out.println("Número de Motores: "+this.n_motores);
        System.out.println("Autonomia: "+this.autonomia+ " Km.");
        System.out.println("Velocidade Máxima: "+this.velocidade_max+ " Km/h");
        System.out.println("Preço: "+this.preco+ " €");
    }
}
