package AirplaneStore;

import AirplaneStore.Enums.Armas;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> armas;

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
     * @param paisOrigem País de Origem do <b>Avião de Combate</b>
     * @param camuflagem Se tem ou não camuflagem
     */
    public AviaoCombate(String modelo, int anoFabrico, int serial, int n_motores, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, double autonomia, double velocidade_max, double preco, String paisOrigem, boolean camuflagem) {
        super(modelo, anoFabrico, serial, n_motores, peso, cmp_fuselagem, env_asas, alt_cauda, autonomia, velocidade_max, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<Armas>();
    }

    /**
     * Método para adicionar uma nova arma ao <b>Avião de Combate</b> (máximo 3)
     * @param armaNova Arma a adicionar
     */
    public void addArma(Armas armaNova){
        if(this.armas.size()!=3){
            this.armas.add(armaNova);
        }else{
            System.out.println("Avião completamente armado! Não é possível adicionar "+armaNova);
        }
    }

    /**
     * Método para remover uma arma do <b>Avião de Combate</b>
     * @param index Indice da arma a remover
     */
    public void removeArma(int index){
        this.armas.remove(index);
    }

    /**
     * Método para imprimir na consola todas as informações do <b>Avião de Combate</b>
     */
    public void exibirDetalhesCombate(){
        super.exibirDetalhes();
        System.out.println("País de Origem: "+this.paisOrigem);
        System.out.println("Camuflagem: "+this.camuflagem);
        System.out.print("Armas: ");
        for(Armas armaAtual : this.armas){
            System.out.print(armaAtual +" | ");
        }
    }

    /**
     * Método para usar uma determinada arma do <b>Avião de Combate</b>, se existir
     * @param armaUso Arma a usar
     */
    public void atacar(Armas armaUso){
        for(Armas armaAtual : this.armas){
            if(armaAtual.equals(armaUso)){
                System.out.println(super.getModelo()+ " usou a arma: "+armaUso);
            }
        }
    }
}
