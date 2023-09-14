package Ex_04;

public class Imovel {

    private String rua, cidade;
    private int porta, quartos, wcs;
    private double area, piscina;

    private TipoImovel tipo;

    private Acabamento acabamento;

    public Imovel(String rua, String cidade, int porta, int quartos, int wcs, double area, double piscina, TipoImovel tipo, Acabamento acabamento) {
        this.rua = rua;
        this.cidade = cidade;
        this.porta = porta;
        this.quartos = quartos;
        this.wcs = wcs;
        this.area = area;
        this.piscina = piscina;
        this.tipo = tipo;
        this.acabamento = acabamento;
    }


    public double calcularValor(){

        // Declarar variáveis
        double valor=0;

        // Aumentar o valor com a area do imovel
        if(this.tipo.equals(TipoImovel.APARTAMENTO)){ // Caso seja apartamento
            valor += this.area*1000;
        }else if(this.tipo.equals((TipoImovel.CASA))){ // Caso seja casa
            valor += this.area*3000;
        } else if(this.tipo.equals((TipoImovel.MANSAO))){ // Caso seja mansao
            valor += this.area*5000;
        }

        // Aumentar o valor com base no numero de quartos
        valor += this.quartos*7500;

        // Aumentar o valor com base no numero de wcs
        valor += this.wcs*10500;

        // Aumentar o valor com base na area da piscina
        valor+= this.piscina*1000;

        if(this.acabamento.equals(Acabamento.PARA_RESTAURO)){
            valor *= 0.5; // valor = valor * 0.5
        }else if(this.acabamento.equals(Acabamento.USADA)){
            valor *= 0.9;
        }else if(this.acabamento.equals(Acabamento.NOVA_ALTO_ACABAMENTO)){
            valor *= 1.25;
        }

        return valor;

    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    public void exibirDetalhes(){
        System.out.println("Rua: " +this.rua);
        System.out.println("Número de porta: " +this.porta);
        System.out.println("Cidade: " +this.cidade);
        System.out.println("Tipo: " +this.tipo);
        System.out.println("Acabamento: " +this.acabamento);
        System.out.println("Área: " +this.area);
        System.out.println("Nº de quartos: " +this.quartos);
        System.out.println("Nº de WCs: " +this.wcs);
        System.out.println("Área da piscina: " +this.piscina);
    }

    public Imovel compararImoveis(Imovel imovelAComparar){
        if(this.calcularValor()>imovelAComparar.calcularValor()){
            return this;
        }else if(this.calcularValor()<imovelAComparar.calcularValor()){
            return imovelAComparar;
        }else{
            return null;
        }
    }
}
