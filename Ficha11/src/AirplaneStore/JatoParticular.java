package AirplaneStore;

import AirplaneStore.Enums.Categoria;
import AirplaneStore.Enums.Instalacoes;

import java.util.ArrayList;

public class JatoParticular extends Aviao{

    private int lotacao;
    private double capacidade_bagagem;
    private Categoria categoria;

    private ArrayList<Instalacoes> instalacoes;

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
     * @param lotacao Lotação (Número de Passageiros)
     * @param capacidade_bagagem Capacidade da Bagagem (cm3)
     * @param categoria Categoria do <b>Jato Particular</b>
     */
    public JatoParticular(String modelo, int anoFabrico, int serial, int n_motores, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, double autonomia, double velocidade_max, double preco, int lotacao, double capacidade_bagagem, Categoria categoria) {
        super(modelo, anoFabrico, serial, n_motores, peso, cmp_fuselagem, env_asas, alt_cauda, autonomia, velocidade_max, preco);
        this.lotacao = lotacao;
        this.capacidade_bagagem = capacidade_bagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacoes>();
    }

    /**
     * Método para adicionar uma nova instalação ao <b>Jato Particular</b>
     * @param instalacoesNovas Instalacao a adicionar
     */
    public void addInstalacao(Instalacoes instalacoesNovas){
        this.instalacoes.add(instalacoesNovas);
    }

    /**
     * Método para remover uma instalação do <b>Jato Particular</b>
     * @param index Indice da instalação a remover
     */
    public void removerInstalacao(int index){
        this.instalacoes.remove(index);
    }

    /**
     * Método para imprimir na consola todas as informações do <b>Jato Particular</b>
     */
    public void exibirDetalhesJato(){
        super.exibirDetalhes();
        System.out.println("Lotação: "+this.lotacao);
        System.out.println("Capacidade de Bagagem: "+this.capacidade_bagagem+ " cm3");
        System.out.println("Categoria Jato: "+this.categoria);
        System.out.print("Instalações: ");
        for(int i=0 ; i<this.instalacoes.size();i++){
            System.out.print(this.instalacoes.get(i)+" | ");
        }
    }

    /**
     * Método para efetuar uma viagem com o <b>Jato Particular</b>
     * @param passageiros Número de passageiros a transportar
     */
    public void viagem(int passageiros){
        if(this.lotacao>=passageiros){
            System.out.println(super.getModelo()+" a transportar "+passageiros+ " passageiros");
        }else{
            System.out.println("Não é possível transportar tanta gente no "+super.getModelo());
        }
    }
}
