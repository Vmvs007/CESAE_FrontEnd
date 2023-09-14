package Ex_04;

public class Main {
    public static void main(String[] args) {

        Imovel apartamento1 = new Imovel("Rua das Tulipas","Porto",111,3,2,250,0,TipoImovel.APARTAMENTO,Acabamento.NOVA);
        Imovel casa1 = new Imovel("Rua do Sol","Braga",10,4,4,590,0,TipoImovel.CASA,Acabamento.USADA);
        Imovel mansao1 = new Imovel("Rua Privada 2","Amarante", 1,10,12,1200,20,TipoImovel.MANSAO,Acabamento.NOVA_ALTO_ACABAMENTO);

        System.out.println("Valor Apartamento 1: "+apartamento1.calcularValor());
        System.out.println("Valor Casa 1: "+casa1.calcularValor());
        System.out.println("Valor Mansao 1: "+mansao1.calcularValor());

        System.out.println("Imovel mais caro: ");
        //(casa1.compararImoveis(mansao1)).exibirDetalhes();
        Imovel imovelCaro = casa1.compararImoveis(mansao1);
        if(imovelCaro==null){
            System.out.println("Tem o mesmo preco");
        }else{
            imovelCaro.exibirDetalhes();
        }

    }
}
