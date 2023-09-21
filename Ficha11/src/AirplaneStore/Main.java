package AirplaneStore;

import AirplaneStore.Enums.Armas;
import AirplaneStore.Enums.Categoria;
import AirplaneStore.Enums.Instalacoes;

public class Main {
    public static void main(String[] args) {

        JatoParticular gulfstream = new JatoParticular("Gulfstream 115", 2008,111222,2,11500,20,38,4,4500,800,3500000,8,200, Categoria.MIDSIZE_JET);
        gulfstream.addInstalacao(Instalacoes.WC);
        gulfstream.addInstalacao(Instalacoes.TOMADAS);

        JatoParticular boeing = new JatoParticular("Boeing 747", 2015,999888,2,18050,35,60,7,6700,950,15600000,50,1000,Categoria.HEAVY_JET);
        boeing.addInstalacao(Instalacoes.TOMADAS);
        boeing.addInstalacao(Instalacoes.WC);
        boeing.addInstalacao(Instalacoes.WC);
        boeing.addInstalacao(Instalacoes.ESCRITORIO);
        boeing.addInstalacao(Instalacoes.SUITE);

        JatoParticular airbus = new JatoParticular("Airbus M14", 2001,999777,4,20000,39,62,8,8000,940,16000000,55,1100,Categoria.HEAVY_JET);
        airbus.addInstalacao(Instalacoes.TOMADAS);
        airbus.addInstalacao(Instalacoes.WC);
        airbus.addInstalacao(Instalacoes.ESCRITORIO);
        airbus.addInstalacao(Instalacoes.SUITE);
        airbus.addInstalacao(Instalacoes.CINEMA);

        AviaoCombate f17 = new AviaoCombate("F17",2007,000015,1,1500,12,16,2,1200,1600,29000000,"USA",false);
        f17.addArma(Armas.METRALHADORAS);
        f17.addArma(Armas.MISSEIS);

        AviaoCombate f22 = new AviaoCombate("F22",2016,000105,2,1200,10,16,1.5,1900,2000,60000000,"Russia",true);
        f22.addArma(Armas.MISSEIS);
        f22.addArma(Armas.METRALHADORAS);
        f22.addArma(Armas.BOMBAS);
        f22.addArma(Armas.TORPEDOS);
        f22.addArma(Armas.FOGUETES);

        Catalogo catalogoAvioes = new Catalogo();

        catalogoAvioes.adquirirAviao(gulfstream);
        catalogoAvioes.adquirirAviao(boeing);
        catalogoAvioes.adquirirAviao(airbus);

        catalogoAvioes.adquirirAviao(f17);
        catalogoAvioes.adquirirAviao(f22);

        catalogoAvioes.imprimirAvioesDisponiveis();

        System.out.println("\n");
        catalogoAvioes.darShow();
    }
}
