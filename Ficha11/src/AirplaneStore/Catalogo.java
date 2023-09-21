package AirplaneStore;

import AirplaneStore.Enums.Armas;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> catalogo;

    /**
     * Método construtor de catálogo
     */
    public Catalogo() {
        this.catalogo = new ArrayList<Aviao>();
    }

    /**
     * Método para adicionar um avião ao <b>Catálogo</b>
     * @param aviaoNovo Avião a adicionar
     */
    public void adquirirAviao(Aviao aviaoNovo){
        this.catalogo.add(aviaoNovo);
    }

    /**
     * Método para vender um avião. Remove do <b>Catálogo</b>
     * @param index Indice do avião a vender
     */
    public void venderAviao(int index){
        this.catalogo.remove(index);
    }

    /**
     * Método que imprime na consola todas as informações de todos os aviões na consola
     */
    public void imprimirAvioesDisponiveis(){
        System.out.println("\n***** Aviões Disponiveis para Venda *****\n");
        for(Aviao aviaoAtual : this.catalogo){
            if(aviaoAtual instanceof JatoParticular){
                ((JatoParticular) aviaoAtual).exibirDetalhesJato();
            }

            if(aviaoAtual instanceof AviaoCombate){
            ((AviaoCombate) aviaoAtual).exibirDetalhesCombate();
            }

            System.out.println("\n");
        }
    }

    /**
     * Método que coloca todos os Jatos Privados a fazer uma viagem com 10 passageiros e todos os Aviões de Combate a usar a arma Bombas
     */
    public void darShow(){
        System.out.println("\n***** Dar Show *****\n");
        for(Aviao aviaoAtual : this.catalogo){
            if(aviaoAtual instanceof JatoParticular){
                ((JatoParticular) aviaoAtual).viagem(10);
            }

            if(aviaoAtual instanceof AviaoCombate){
                ((AviaoCombate) aviaoAtual).atacar(Armas.BOMBAS);
            }
        }
    }
}
